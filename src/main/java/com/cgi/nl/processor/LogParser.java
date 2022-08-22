package com.cgi.nl.processor;

import com.cgi.nl.constants.AppConstants;
import com.cgi.nl.constants.LogLevel;
import com.cgi.nl.model.LogData;
import com.cgi.nl.utils.AppUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Component
public class LogParser {

    private final static Logger LOGGER = LoggerFactory.getLogger(LogParser.class);
    private static Pattern INFO_LOG_PATTERN = Pattern.compile(AppConstants.TIMESTAMP_REGEX + " " + AppConstants.INFO_LEVEL_REGEX + "\\s+" + AppConstants.THREAD_REGEX + "\\s+" + AppConstants.CLASS_REGEX + "\\s+" + AppConstants.MSG_RGX, Pattern.DOTALL);
    private static Pattern DEBUG_LOG_PATTERN = Pattern.compile(AppConstants.TIMESTAMP_REGEX + " " + AppConstants.DEBUG_LEVEL_REGEX + "\\s+" + AppConstants.THREAD_REGEX + "\\s+" + AppConstants.CLASS_REGEX + "\\s+" + AppConstants.MSG_RGX, Pattern.DOTALL);
    private static Pattern TIME_REGEX_PATTERN = Pattern.compile(AppConstants.TIMESTAMP_REGEX + "\\s+" + AppConstants.MSG_RGX, Pattern.DOTALL);
    private static Pattern ERROR_LOG_PATTERN = Pattern.compile(AppConstants.TIMESTAMP_REGEX + " " + AppConstants.ERROR_LEVEL_REGEX + "\\s+" + AppConstants.THREAD_REGEX + "\\s+" + AppConstants.CLASS_REGEX + "\\s+" + AppConstants.MSG_RGX, Pattern.DOTALL);
    private static Pattern WARN_LOG_PATTERN = Pattern.compile(AppConstants.TIMESTAMP_REGEX + " " + AppConstants.WARN_LEVEL_REGEX + "\\s+" + AppConstants.THREAD_REGEX + "\\s+" + AppConstants.CLASS_REGEX + "\\s+" + AppConstants.MSG_RGX, Pattern.DOTALL);

    @Autowired
    private AppUtil appUtil;

    public List<LogData> parseErrorLogger(final List<String> loggerLines)  {

        LOGGER.debug("Total logger lines ::: {}", loggerLines.size());
        boolean isMatches = false;
        String logMessage = null;
        List<LogData> logDataList = new ArrayList<>();
        for(String logLine : loggerLines) {
            Matcher patternMatcher = ERROR_LOG_PATTERN.matcher(logLine);

            Matcher timeRegexMatcher = TIME_REGEX_PATTERN.matcher(logLine);
            LogData logData = null;
            if(isMatches && logMessage != null) {
                if(!timeRegexMatcher.matches()) {
                    String message = new StringBuilder(logMessage).append(" ").append(logLine).toString();
                    logData = new LogData(appUtil.extractLogName(message), message, 1);
                } else {
                    logData = new LogData(appUtil.extractLogName(logMessage), logMessage, 1);
                }

                boolean isExisting = false;
                isExisting = updateCounterForExistingError(logDataList, logData, isExisting);
                if(logDataList.size() == 0 || !isExisting) {
                    logDataList.add(logData);
                }
                isMatches = false;
            }
            if(patternMatcher.matches() ) {
                isMatches = true;
                logMessage = patternMatcher.group(AppConstants.MESSAGE);
            }


        }
        return sortDataList(logDataList);
    }
    public List<LogData> parseLoggerExceptError(final List<String> loggerLines, final String logType) {
        Pattern pattern = INFO_LOG_PATTERN;
        if(logType.equals(LogLevel.WARN.name())) {
            pattern = WARN_LOG_PATTERN;
        } else if(logType.equals(LogLevel.DEBUG.name())) {
            pattern = DEBUG_LOG_PATTERN;
        }
        return parseLogger(loggerLines, pattern);
    }
    private List<LogData> parseLogger(final List<String> loggerLines, final Pattern pattern) {

        LOGGER.debug("Total logger lines ::: {}", loggerLines.size());
        List<LogData> logDataList = new ArrayList<>();
        for(final String logLine : loggerLines) {
            Matcher patternMatcher = pattern.matcher(logLine);
            if(patternMatcher.matches() ) {
                final String logMessage = patternMatcher.group(AppConstants.MESSAGE);
                final String className = patternMatcher.group(AppConstants.CLASS);
                final LogData logData = new LogData(className, logMessage, 1);

                boolean isExisting = updateCounterForExistingError(logDataList, logData, false);
                if(logDataList.size() == 0 || !isExisting) {
                    logDataList.add(logData);
                }
            }

        }
        return sortDataList(logDataList);
    }

    private boolean updateCounterForExistingError(List<LogData> logDataList, LogData logData, boolean isExisting) {
        for(int i = 0; i< logDataList.size(); i++) {
            LogData existingLogData = logDataList.get(i);
            if(existingLogData.getLogName().equals(logData.getLogName())) {
                existingLogData.setLogCount(existingLogData.getLogCount()+1);
                logDataList.set(i, existingLogData);
                isExisting = true;
                break;
            }
        }
        return isExisting;
    }

    private List<LogData> sortDataList(final List<LogData> logDataList) {
        final List<LogData> sortedLogDataList = logDataList.stream()
                .sorted(Comparator.comparing(LogData :: getLogCount).reversed())
                .collect(Collectors.toList());
        LOGGER.debug("List size : {}", sortedLogDataList.size());
        return sortedLogDataList;
    }

}

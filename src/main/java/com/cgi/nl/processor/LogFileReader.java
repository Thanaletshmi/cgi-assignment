package com.cgi.nl.processor;

import com.cgi.nl.config.AppConfig;
import com.cgi.nl.constants.LogLevel;
import com.cgi.nl.model.LogAnalyzer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

@Component
public class LogFileReader {

    private final static Logger LOGGER = LoggerFactory.getLogger(JsonFileReader.class);

    //final static String timestampRgx = "(?<timestamp>\\d{2}-\\d{2}-\\d{4} \\d{2}:\\d{2}:\\d{2},\\d{3})";
    //final static String levelRgx = "(?<level>INFO|ERROR|WARN|TRACE|DEBUG|FATAL)";
    //final static String classRgx = "\\[(?<class>[^\\]]+)]";
    //final static String threadRgx = "\\[(?<thread>[^\\]]+)]";
    //final static String textRgx = "(?<text>.*?)(?=\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2},\\d{3}|\\Z)";

    //private static Pattern PatternFullLog = Pattern.compile(timestampRgx + " " + levelRgx + "\\s+" + classRgx + "-" + threadRgx + "\\s+" + textRgx, Pattern.DOTALL);

    final static String timestampRgx = "(?<timestamp>\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2},\\d{3})";
    final static String levelRgx = "(?<level>INFO|ERROR|WARN|TRACE|DEBUG|FATAL)";
    //final static String classRgx = "\\[(?<class>[^\\]]+)]";
    final static String threadRgx = "\\[(?<thread>[^\\]]+)]";

//    final static String classRgx = "(?<class>.*?)(?=\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2},\\d{3}|\\Z)";
    final static String textRgx = "(?<text>.*?)(?=\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2},\\d{3}|\\Z)";

    private static Pattern PatternFullLog = Pattern.compile(timestampRgx + " " + levelRgx + "\\s+" + " " + threadRgx + "\\s+" + textRgx, Pattern.DOTALL);

    @Autowired
    private AppConfig appConfig;

    public void readLogFile() {
        final List<LogAnalyzer> logAnalyzerList = new ArrayList<>();
        LOGGER.info("************Inside LogFileReader************");

        List<String> lines = null;

        try {
            lines = Files.readAllLines(Path.of(appConfig.getLogFilePath()));
            for(final String logLine : lines) {
                Matcher patternMatcher = PatternFullLog.matcher(logLine);
                if(patternMatcher.matches()) {
                  //  LOGGER.info("&&&&&&& ::: {}", logLine);

                    String dateStr = patternMatcher.group("timestamp");

                    String levelStr = patternMatcher.group("level");
                    String logLevel = LogLevel.valueOf(levelStr).name();
                    LOGGER.info("**************LogLevel ::: {}", logLevel);

                    /*String fullClassStr = patternMatcher.group("class");
                    LOGGER.info("FullClassStr ::: {}", fullClassStr);

                    String[] classNameArray = fullClassStr.split("\\.");
                    //String framework = classNameArray[2];
                    LOGGER.info("classNameArray ::: {}", classNameArray);*/

                   /* String classname = classNameArray[classNameArray.length - 1];
                    LOGGER.info("Classname ::: {}", classname);*/

                    String threadName = patternMatcher.group("thread");
                    LOGGER.info("ThreadName ::: {}", threadName);

                    String logText = patternMatcher.group("text");
                    LOGGER.info("LogText ::: {}", logText);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*try (Stream<String> lines = Files.lines(Path.of(appConfig.getLogFilePath()))) {
           // Matcher matcher = PatternFullLog.matcher(lines);

            lines.filter(line -> PatternFullLog.matcher(line).matches()).forEach(System.out::println);

            //System.out.println("The count of lines starting with 'A' is " + i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }

}

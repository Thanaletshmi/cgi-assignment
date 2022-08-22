package com.cgi.nl.service;

import com.cgi.nl.constants.AppConstants;
import com.cgi.nl.constants.LogLevel;
import com.cgi.nl.exception.DataNotFoundException;
import com.cgi.nl.exception.FileReaderException;
import com.cgi.nl.exception.InvalidInputException;
import com.cgi.nl.model.LogAnalyzer;
import com.cgi.nl.model.LogData;
import com.cgi.nl.model.RecipeInfo;
import com.cgi.nl.processor.LogFileReader;
import com.cgi.nl.processor.LogParser;
import com.cgi.nl.validator.RequestValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Component
public class LogAnalyzerServiceImpl implements LogAnalyzerService {

	private final static Logger LOGGER = LoggerFactory.getLogger(LogAnalyzerServiceImpl.class);

	@Autowired
	private RequestValidator validator;

	@Autowired
	private LogFileReader logFileReader;

	@Autowired
	private LogParser logParser;


	@Override
	public LogAnalyzer getLogData(final String logType) throws FileReaderException, InvalidInputException, DataNotFoundException {
		validator.validateLogType(logType);
		final List<String> loggerLines = logFileReader.readLogFile();
		List<LogData> logDataList = null;
		if(logType.equals(LogLevel.ERROR.name())) {
			logDataList = logParser.parseErrorLogger(loggerLines);
		} else {
			logDataList = logParser.parseLoggerExceptError(loggerLines, logType);
		}
		LogAnalyzer logAnalyzer = new LogAnalyzer(logType, logDataList);

		return logAnalyzer;
	}

}

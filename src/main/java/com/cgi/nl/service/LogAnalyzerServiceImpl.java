package com.cgi.nl.service;

import com.cgi.nl.exception.DataNotFoundException;
import com.cgi.nl.exception.FileReaderException;
import com.cgi.nl.exception.InvalidInputException;
import com.cgi.nl.model.LogAnalyzer;
import com.cgi.nl.model.RecipeInfo;
import com.cgi.nl.processor.JsonFileReader;
import com.cgi.nl.processor.LogFileReader;
import com.cgi.nl.validator.RequestValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class LogAnalyzerServiceImpl implements LogAnalyzerService {

	private final static Logger LOGGER = LoggerFactory.getLogger(LogAnalyzerServiceImpl.class);

	@Autowired
	private RequestValidator validator;

	@Autowired
	private LogFileReader logFileReader;


	@Override
	public List<LogAnalyzer> getLogData(final String logType) throws FileReaderException, InvalidInputException {
		validator.validateLogType(logType);
		logFileReader.readLogFile();
		return null;
	}

}

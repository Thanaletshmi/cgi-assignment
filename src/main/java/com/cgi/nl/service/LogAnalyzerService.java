package com.cgi.nl.service;

import com.cgi.nl.exception.FileReaderException;
import com.cgi.nl.exception.InvalidInputException;
import com.cgi.nl.model.LogAnalyzer;

import java.util.List;

public interface LogAnalyzerService {

    List<LogAnalyzer> getLogData(final String logType) throws FileReaderException, InvalidInputException;

}

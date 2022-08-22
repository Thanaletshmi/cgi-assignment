package com.cgi.nl.service;

import com.cgi.nl.exception.DataNotFoundException;
import com.cgi.nl.exception.FileReaderException;
import com.cgi.nl.exception.InvalidInputException;
import com.cgi.nl.model.LogAnalyzer;
import com.cgi.nl.model.LogData;

import java.util.List;

public interface LogAnalyzerService {

    LogAnalyzer getLogData(final String logType) throws FileReaderException, InvalidInputException, DataNotFoundException;

}

package com.cgi.nl.processor;

import com.cgi.nl.config.AppConfig;
import com.cgi.nl.exception.FileReaderException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Component
public class LogFileReader {
    private final static Logger LOGGER = LoggerFactory.getLogger(LogFileReader.class);
    @Autowired
    private AppConfig appConfig;
    public List<String> readLogFile() throws FileReaderException {
        try {
            return Files.readAllLines(Paths.get(appConfig.getLogFilePath()));
        } catch (IOException e) {
            LOGGER.error("Exception occurred while reading log file - {}", e.getMessage());
            throw new FileReaderException("Server Error: Please try again after sometime!");
        }
    }

}

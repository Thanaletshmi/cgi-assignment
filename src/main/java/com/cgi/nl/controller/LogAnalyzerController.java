package com.cgi.nl.controller;


import com.cgi.nl.exception.DataNotFoundException;
import com.cgi.nl.exception.FileReaderException;
import com.cgi.nl.exception.InvalidInputException;
import com.cgi.nl.model.LogAnalyzer;
import com.cgi.nl.model.RecipeInfo;
import com.cgi.nl.service.LogAnalyzerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "${cross.origin.url}", allowedHeaders = "*")
@Api(tags = "Log Analyzer App", value = "LogAnalyzerApp")
public class LogAnalyzerController {

    private final static Logger LOGGER = LoggerFactory.getLogger(LogAnalyzerController.class);

    @Autowired
    private LogAnalyzerService service;

    @ApiOperation(value = "Analyze and get log information based on LogType", notes = "Returns the log information by logType")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = LogAnalyzer.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "LogType is required"),
            @ApiResponse(code = 404, message = "Invalid logType value"),
            @ApiResponse(code = 500, message = "Server Error: Please try again after sometime!")
    })
    @GetMapping(path="/logs/{logType}")
    public ResponseEntity<LogAnalyzer> analyzeLogs(@PathVariable(required = true) String logType) throws InvalidInputException,
            FileReaderException, DataNotFoundException {
        LOGGER.debug("Get recipes for ingredients: Routing the request to Service");
        return new ResponseEntity<>(service.getLogData(logType), HttpStatus.OK);
    }
}
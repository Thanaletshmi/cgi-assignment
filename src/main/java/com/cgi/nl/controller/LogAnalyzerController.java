package com.cgi.nl.controller;


import com.cgi.nl.exception.DataNotFoundException;
import com.cgi.nl.exception.FileReaderException;
import com.cgi.nl.exception.InvalidInputException;
import com.cgi.nl.service.LogAnalyzerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(path = "/")
public class LogAnalyzerController {

    private final static Logger LOGGER = LoggerFactory.getLogger(LogAnalyzerController.class);

    @Autowired
    private LogAnalyzerService service;

    @GetMapping(path="/logs/{logType}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List> analyzeLogs(@PathVariable(required = true) String logType) throws InvalidInputException,
            DataNotFoundException, FileReaderException {
        LOGGER.debug("Get recipes for ingredients: Routing the request to Service");
        service.getLogData(logType);
        return null; // new ResponseEntity<>(service.getRecipesForIngredients(ingredients), HttpStatus.OK);
    }
}
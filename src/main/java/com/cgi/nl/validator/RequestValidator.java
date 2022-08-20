package com.cgi.nl.validator;

import com.cgi.nl.exception.InvalidInputException;
import com.cgi.nl.processor.JsonFileReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.logging.LogLevel;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class RequestValidator {

    private final static Logger LOGGER = LoggerFactory.getLogger(RequestValidator.class);
    private static final String STRING_REGEX = "^[a-zA-Z]*$";

    public void validateInputIngredients(final List<String> ingredients) throws InvalidInputException {
        for(final String ingredient : ingredients) {
            if(ingredient == null || StringUtils.trimWhitespace(ingredient).isEmpty()) {
                LOGGER.error("Input ingredient is empty");
                throw new InvalidInputException("Input ingredient(s) is required");
            }
        }

        for(final String ingredient: ingredients) {
            if(!ingredient.matches(STRING_REGEX)) {
                LOGGER.error("Input ingredient [{}] is invalid",ingredient);
                throw new InvalidInputException("Invalid ingredient value. Only String values accepted");
            }
        }
    }

    public void validateLogType(final String logType) throws InvalidInputException {
        if(logType == null || StringUtils.trimWhitespace(logType).isEmpty()) {
            LOGGER.error("LogType is empty");
            throw new InvalidInputException("LogType is required");
        }

        if(!Arrays.stream(LogLevel.values()).anyMatch(level -> level.name().equals(logType))) {
            LOGGER.error("Input logType [{}] is invalid",logType);
            throw new InvalidInputException("Invalid logType value");
        }
    }

}

package com.cgi.nl.processor;

import com.cgi.nl.config.AppConfig;
import com.cgi.nl.exception.FileReaderException;
import com.cgi.nl.model.RecipeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class JsonFileReader {

    private final static Logger LOGGER = LoggerFactory.getLogger(JsonFileReader.class);
    @Autowired
    private AppConfig appConfig;
    @Autowired
    private ObjectMapper objectMapper;
    public List<RecipeInfo> readJsonFile() throws FileReaderException {
        try {
            Object object = new JSONParser().parse(new FileReader(appConfig.getJsonFilePath()));
            JSONArray jsonObject = (JSONArray) object;
            String jsonString = jsonObject.toJSONString();
            CollectionType listType =
                    objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, RecipeInfo.class);
            return objectMapper.readValue(jsonString, listType);
        } catch (IOException e) {
            LOGGER.error("IOException : {}", e.getMessage());
            throw new FileReaderException("Server Error: Please try again after sometime!");
        } catch (ParseException e) {
            LOGGER.error("ParsingException : {}", e.getMessage());
            throw new FileReaderException("Server Error: Please try again after sometime!");
        }
    }

}

package com.cgi.nl.controller;

import com.cgi.nl.constants.AppConstants;
import com.cgi.nl.exception.DataNotFoundException;
import com.cgi.nl.exception.InvalidInputException;
import com.cgi.nl.exception.FileReaderException;
import com.cgi.nl.service.RecipeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class RecipeController {

    private final static Logger LOGGER = LoggerFactory.getLogger(RecipeController.class);

    @Autowired
    private RecipeService service;


    @GetMapping(path="/recipes")
    public ResponseEntity<List> getAllRecipes() throws FileReaderException {
        LOGGER.debug("Get All Recipes: Routing the request to Service");
        return new ResponseEntity<>(service.getAllRecipes(), HttpStatus.OK);
    }

    @GetMapping(path="/recipes/ingredients")
    public ResponseEntity<List> getRecipesForIngredients(@RequestParam List<String> ingredients) throws InvalidInputException,
            DataNotFoundException, FileReaderException {
        LOGGER.debug("Get recipes for ingredients: Routing the request to Service");
        return new ResponseEntity<>(service.getRecipesForIngredients(ingredients), HttpStatus.OK);
    }

    /**
     * Homepage
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return AppConstants.WELCOME_MESSAGE;
    }
}

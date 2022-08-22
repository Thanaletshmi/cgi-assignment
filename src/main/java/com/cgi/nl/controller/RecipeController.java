package com.cgi.nl.controller;


import com.cgi.nl.exception.DataNotFoundException;
import com.cgi.nl.exception.InvalidInputException;
import com.cgi.nl.exception.FileReaderException;
import com.cgi.nl.model.RecipeInfo;
import com.cgi.nl.service.RecipeService;
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

import java.util.List;

@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "${cross.origin.url}", allowedHeaders = "*")
@Api(tags = "Recipe App", value = "RecipeApp")
public class RecipeController {

    private final static Logger LOGGER = LoggerFactory.getLogger(RecipeController.class);

    @Autowired
    private RecipeService service;


    @ApiOperation(value = "List all the Recipes", notes = "Returns all the recipes")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = RecipeInfo.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Input ingredient(s) is required/invalid"),
            @ApiResponse(code = 500, message = "Server Error: Please try again after sometime!")
    })
    @GetMapping(path="/recipes")
    public ResponseEntity<List> getAllRecipes() throws FileReaderException {
        LOGGER.debug("Get All Recipes: Routing the request to Service");
        return new ResponseEntity<>(service.getAllRecipes(), HttpStatus.OK);
    }

    @ApiOperation(value = "Get Recipes by Ingredients", notes = "Returns the recipes by ingredients")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = RecipeInfo.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Input ingredient(s) is required/invalid"),
            @ApiResponse(code = 404, message = "No recipe found for given input ingredient(s)"),
            @ApiResponse(code = 500, message = "Server Error: Please try again after sometime!")
    })
    @GetMapping(path="/recipes/ingredients")
    public ResponseEntity<List> getRecipesForIngredients(@RequestParam List<String> ingredients) throws InvalidInputException,
            DataNotFoundException, FileReaderException {
        LOGGER.debug("Get recipes for ingredients: Routing the request to Service");
        return new ResponseEntity<>(service.getRecipesForIngredients(ingredients), HttpStatus.OK);
    }

}

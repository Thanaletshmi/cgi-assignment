package com.cgi.nl.service;

import com.cgi.nl.exception.DataNotFoundException;
import com.cgi.nl.exception.InvalidInputException;
import com.cgi.nl.exception.FileReaderException;
import com.cgi.nl.model.RecipeInfo;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;

public interface RecipeService {

    List<RecipeInfo> getAllRecipes() throws FileReaderException;

    List<RecipeInfo> getRecipesForIngredients(final List<String> ingredients) throws InvalidInputException, DataNotFoundException, FileReaderException;

}

package com.cgi.nl.service;

import com.cgi.nl.exception.DataNotFoundException;
import com.cgi.nl.exception.FileReaderException;
import com.cgi.nl.exception.InvalidInputException;
import com.cgi.nl.model.RecipeInfo;
import com.cgi.nl.processor.JsonFileReader;
import com.cgi.nl.validator.RequestValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class RecipeServiceImpl implements RecipeService {

	private final static Logger LOGGER = LoggerFactory.getLogger(RecipeServiceImpl.class);

	@Autowired
	private RequestValidator validator;

	@Autowired
	private JsonFileReader jsonFileReader;

	@Override
	public List<RecipeInfo> getAllRecipes() throws FileReaderException {
		List<RecipeInfo> recipeInfoList = jsonFileReader.readJsonFile();
		return recipeInfoList.stream().sorted(Comparator.comparing(r -> r.getTitle()))
				.collect(Collectors.toList());
	}

	@Override
	public List<RecipeInfo> getRecipesForIngredients(final List<String> ingredients) throws InvalidInputException,
			DataNotFoundException, FileReaderException {

		validator.validateInputIngredients(ingredients);
		List<RecipeInfo> recipeInfoList = jsonFileReader.readJsonFile();

		List<RecipeInfo> filteredRecipeInfo = new ArrayList<>();
		for (final String inputIngredient: ingredients) {
			filteredRecipeInfo = recipeInfoList.stream()
					.filter(r -> r.getIngredients().stream()
							.anyMatch(s -> s.equals(inputIngredient)))
					.sorted(Comparator.comparing(RecipeInfo :: getTitle))
					.collect(Collectors.toList());
			recipeInfoList = filteredRecipeInfo;
		}

		if(filteredRecipeInfo.isEmpty()) {
			LOGGER.error("No recipe found for ingredients - {}", ingredients);
			throw new DataNotFoundException("No recipe found for given input ingredient(s)");
		}
		return filteredRecipeInfo;
	}

}

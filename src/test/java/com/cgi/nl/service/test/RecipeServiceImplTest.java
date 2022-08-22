package com.cgi.nl.service.test;


import com.cgi.nl.model.RecipeInfo;
import com.cgi.nl.processor.JsonFileReader;

import com.cgi.nl.service.RecipeServiceImpl;
import com.cgi.nl.validator.RequestValidator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class RecipeServiceImplTest {

    @InjectMocks
    private RecipeServiceImpl recipeServiceImplTest;

    //@Mock
    private RequestValidator validatorMock = Mockito.mock(RequestValidator.class);

    @Mock
    private JsonFileReader fileReaderMock;

    @Test
    public void testGetAllRecipes() {

        try {
            List<String> ingredients = new ArrayList<>();
            ingredients.add("water");
            RecipeInfo recipeInfo = new RecipeInfo();
            recipeInfo.setIngredients(ingredients);
            recipeInfo.setTitle("Plain Rice");
            recipeInfo.setHref("hrfe");
            List<RecipeInfo> recipeInfoList = new ArrayList<>();
            recipeInfoList.add(recipeInfo);
            Mockito.when(fileReaderMock.readJsonFile()).thenReturn(recipeInfoList);
            List<RecipeInfo> actualRecipeInfoList = recipeServiceImplTest.getAllRecipes();
            assertNotNull(actualRecipeInfoList);
            assertEquals(recipeInfoList, actualRecipeInfoList);
            assertEquals(recipeInfoList.size(), actualRecipeInfoList.size());
        } catch (Exception ex) {
            fail();
        }
    }

    @Test
    public void testGetRecipesForIngredients() {
        try {

            Mockito.doNothing().when(validatorMock).validateInputIngredients(Mockito.anyList());
            List<String> ingredients = new ArrayList<>();
            ingredients.add("water");
            RecipeInfo recipeInfo = new RecipeInfo();
            recipeInfo.setIngredients(ingredients);
            recipeInfo.setTitle("Plain Rice");
            recipeInfo.setHref("hrfe");
            List<RecipeInfo> recipeInfoList = new ArrayList<>();
            recipeInfoList.add(recipeInfo);
            Mockito.when(fileReaderMock.readJsonFile()).thenReturn(recipeInfoList);
            List<RecipeInfo> actualRecipeInfoList = recipeServiceImplTest.getRecipesForIngredients(ingredients);
            assertNotNull(actualRecipeInfoList);
            assertTrue(actualRecipeInfoList.size() == 1);
            assertEquals(recipeInfoList.get(0).getIngredients(), actualRecipeInfoList.get(0).getIngredients());
            assertEquals(recipeInfoList.get(0).getTitle(), actualRecipeInfoList.get(0).getTitle());
            assertEquals(recipeInfoList.get(0).getHref(), actualRecipeInfoList.get(0).getHref());
        } catch (Exception ex) {
            fail();
        }
    }

    @Test
    public void testGetRecipesForIngredientsDataNotFound() {
        boolean isException = true;
        try {
            List<String> ingredients = new ArrayList<>();
            ingredients.add("sauce");
            ingredients.add("honey");
            List<RecipeInfo> actualRecipeInfoList = recipeServiceImplTest.getRecipesForIngredients(ingredients);
        } catch (Exception ex) {
            assertTrue(isException);
            assertEquals("No recipe found for given input ingredient(s)", ex.getMessage());
        }
    }

}

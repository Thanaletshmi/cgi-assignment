package com.cgi.nl.controller.test;


import com.cgi.nl.util.test.TestConstantsUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application-test.properties")
@RunWith(SpringRunner.class)
public class RecipeControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetAllRecipesForSuccess() {
        try {
            mvc.perform(get("/recipes")
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content()
                            .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                    .andExpect(content().json(TestConstantsUtil.ALL_RECIPES_JSON));
        } catch (Exception ex) {
            fail();
        }
    }

    @Test
    public void testGetAllRecipesForIngredientsSuccess() {
        try {
            mvc.perform(get("/recipes/ingredients?ingredients=rice,water")
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content()
                            .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                    .andExpect(content().json(TestConstantsUtil.PLAIN_RICE_ING_JSON));
        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
    }

    @Test
    public void testGetAllRecipesForInvalidInputIngredients() {
        boolean isException = true;
        try {
            mvc.perform(get("/recipes/ingredients?ingredients=rice$asd12,water")
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isBadRequest())
                    .andExpect(content().string("Invalid ingredient value. Only String values accepted"));
        } catch (Exception ex) {
            assertTrue(isException);
        }
    }

    @Test
    public void testGetAllRecipesForDataNotFoundInputIngredients() {
        boolean isException = true;
        try {
            mvc.perform(get("/recipes/ingredients?ingredients=white sauce")
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isNotFound())
                    .andExpect(content().string("No recipe found for given input ingredient(s)"));
        } catch (Exception ex) {
            assertTrue(isException);
        }
    }

}
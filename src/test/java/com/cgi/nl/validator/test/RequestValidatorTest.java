package com.cgi.nl.validator.test;

import com.cgi.nl.exception.DataNotFoundException;
import com.cgi.nl.exception.InvalidInputException;
import com.cgi.nl.validator.RequestValidator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class RequestValidatorTest {

    @InjectMocks
    private RequestValidator requestValidator;


    @Test
    public void testValidateInputIngredientsForSuccess() {
        try {
            List<String> ingredients = new ArrayList<>();
            ingredients.add("water");
            requestValidator.validateInputIngredients(ingredients);
        } catch (InvalidInputException e) {
           fail();
        }
    }

    @Test
    public void testValidateInputIngredientsForEmpty() {
        boolean isException = true;
        try {
            requestValidator.validateInputIngredients(null);
        } catch (InvalidInputException e) {
            assertTrue(isException);
            assertEquals("Input ingredient(s) is required", e.getMessage());
        }
    }

    @Test
    public void testValidateInputIngredientsForEmptyString() {
        boolean isException = true;
        try {
            List<String> ingredients = new ArrayList<>();
            ingredients.add("water");
            ingredients.add("");
            requestValidator.validateInputIngredients(ingredients);
        } catch (InvalidInputException e) {
            assertTrue(isException);
            assertEquals("Input ingredient(s) is required", e.getMessage());
        }
    }

    @Test
    public void testValidateInputIngredientsForNonStringValues() {
        boolean isException = true;
        try {
            List<String> ingredients = new ArrayList<>();
            ingredients.add("water");
            ingredients.add("23sdf34");
            requestValidator.validateInputIngredients(ingredients);
        } catch (InvalidInputException e) {
            assertTrue(isException);
            assertEquals("Invalid ingredient value. Only String values accepted", e.getMessage());
        }
    }


    @Test
    public void testValidateLogTypeForSuccess() {
        try {
            requestValidator.validateLogType("ERROR");
        } catch (Exception e) {
           fail();
        }
    }

    @Test
    public void testValidateLogTypeForEmpty() {
        boolean isException = true;
        try {
            requestValidator.validateLogType(null);
        } catch (Exception e) {
            assertTrue(isException);
            assertEquals(InvalidInputException.class, e.getClass());
            assertEquals("LogType is required", e.getMessage());
        }
    }

    @Test
    public void testValidateLogTypeForInvalidLogType() {
        boolean isException = true;
        try {
            requestValidator.validateLogType("FATAL");
        } catch (Exception e) {
            assertTrue(isException);
            assertEquals(DataNotFoundException.class, e.getClass());
            assertEquals("Invalid logType value", e.getMessage());
        }
    }

}

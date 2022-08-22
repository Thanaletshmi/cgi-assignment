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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application-test.properties")
@RunWith(SpringRunner.class)
public class LogAnalyzerControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetWARNLoggerInformation() {
        try {
            mvc.perform(get("/logs/WARN")
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content()
                            .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                    .andExpect(content().json(TestConstantsUtil.WARN_LOG_INFO));
        } catch (Exception ex) {
            fail();
        }
    }

    @Test
    public void testGetERRORLoggerInformation() {
        try {
            mvc.perform(get("/logs/ERROR")
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content()
                            .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                    .andExpect(content().json(TestConstantsUtil.ERROR_LOG_INFO));
        } catch (Exception ex) {
            fail();
        }
    }

    @Test
    public void testGetINFOLoggerInformation() {
        try {
            mvc.perform(get("/logs/INFO")
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content()
                            .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                    .andExpect(content().json(TestConstantsUtil.INFO_LOG_DATA));
        } catch (Exception ex) {
            fail();
        }
    }

    @Test
    public void testGetDEBUGLoggerInformation() {
        try {
            mvc.perform(get("/logs/DEBUG")
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content()
                            .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                    .andExpect(content().json(TestConstantsUtil.DEBUG_LOG_INFO));
        } catch (Exception ex) {
            fail();
        }
    }

    @Test
    public void testInvalidLogType() {
        boolean isException = true;
        try {
            mvc.perform(get("/logs/FATAL")
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isNotFound())
                    .andExpect(content().string("Invalid logType value"));
        } catch (Exception ex) {
            assertTrue(isException);
        }
    }

    @Test
    public void testEmptyLogType() {
        boolean isException = true;
        try {
            mvc.perform(get("/logs/ ")
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isBadRequest())
                    .andExpect(content().string("LogType is required"));
        } catch (Exception ex) {
            assertTrue(isException);
        }
    }

}

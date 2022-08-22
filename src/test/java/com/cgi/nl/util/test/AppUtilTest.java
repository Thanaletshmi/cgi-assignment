package com.cgi.nl.util.test;

import com.cgi.nl.utils.AppUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class AppUtilTest {

    private static final String MESSAGE = "Exception in com.fluentgrid.repapp.web.rest.EventsResource.search() with cause = null java.lang.NullPointerException: null";

    @InjectMocks
    private AppUtil appUtilTest;

    @Test
    public void testExtractLogNameUtil() {
        try{
            String name = appUtilTest.extractLogName(MESSAGE);
            assertNotNull(name);
            assertEquals("java.lang.NullPointerException:", name);
        } catch (Exception e) {
            fail();
        }
    }

}

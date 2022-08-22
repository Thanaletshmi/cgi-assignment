package com.cgi.nl.processor.test;

import com.cgi.nl.model.LogData;
import com.cgi.nl.processor.LogParser;
import com.cgi.nl.utils.AppUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class LogParserTest {

    private static final String MESSAGE_1 = "2018-09-10 16:57:13,240 ERROR [http-nio-8080-exec-8] LoggingAspect: Exception in com.fluentgrid.repapp.web.rest.EventsResource.search() with cause = null java.lang.NullPointerException: null";

    private static final String MESSAGE_2 = "2018-09-10 16:57:13,240 INFO [http-nio-8080-exec-8] LoggingAspect: Exception in EventsResource with cause = null org.springframework.beans.factory.BeanCreationException: null";

    private static final String MESSAGE_3 = "2018-09-10 16:57:13,222 DEBUG [http-nio-8080-exec-8] LoggingAspect: Enter: com.fluentgrid.repapp.web.rest.EventsResource.search() with argument[s] = [1, 5, null, [1]]";

    private static final String MESSAGE_4 = "2018-09-10 16:57:13,225 DEBUG [http-nio-8080-exec-8] EventsResource: Searching Customers with search criteria: null";

    private static final String MESSAGE_5 = "2018-09-10 17:07:35,230 WARN  [main] AnnotationConfigEmbeddedWebApplicationContext: Exception encountered during context initialization - cancelling refresh attempt";

    private static final String MESSAGE_6 = "2018-09-10 17:07:21,108 WARN  [main] Node: [127.0.0.1]:5701 [dev] [3.2.5] No join method is enabled! Starting standalone.";

    @InjectMocks
    private LogParser logParserTest;


    @Mock
    private AppUtil appUtilMock;

    @Test
    public void testErrorLogParser() {
        try {
            List<String> errorList = new ArrayList<>();
            errorList.add(MESSAGE_1);
            errorList.add(MESSAGE_2);
            errorList.add(MESSAGE_3);
            errorList.add(MESSAGE_4);
            errorList.add(MESSAGE_5);
            errorList.add(MESSAGE_6);
            List<LogData> logDataList = logParserTest.parseErrorLogger(errorList);
            assertNotNull(logDataList);
            assertEquals(1, logDataList.size());
        } catch(Exception ex) {
            fail();
        }
    }


    @Test
    public void testInfoLogParser() {
        try {
            List<String> errorList = new ArrayList<>();
            errorList.add(MESSAGE_1);
            errorList.add(MESSAGE_2);
            errorList.add(MESSAGE_3);
            errorList.add(MESSAGE_4);
            errorList.add(MESSAGE_5);
            errorList.add(MESSAGE_6);
            List<LogData> logDataList = logParserTest.parseLoggerExceptError(errorList, "INFO");
            assertNotNull(logDataList);
            assertEquals(1, logDataList.size());
        } catch(Exception ex) {
            fail();
        }
    }

    @Test
    public void testWarnLogParser() {
        try {
            List<String> errorList = new ArrayList<>();
            errorList.add(MESSAGE_1);
            errorList.add(MESSAGE_2);
            errorList.add(MESSAGE_3);
            errorList.add(MESSAGE_4);
            errorList.add(MESSAGE_5);
            errorList.add(MESSAGE_6);
            List<LogData> logDataList = logParserTest.parseLoggerExceptError(errorList, "WARN");
            assertNotNull(logDataList);
            assertEquals(2, logDataList.size());
        } catch(Exception ex) {
            fail();
        }
    }

    @Test
    public void testDebugLogParser() {
        try {
            List<String> errorList = new ArrayList<>();
            errorList.add(MESSAGE_1);
            errorList.add(MESSAGE_2);
            errorList.add(MESSAGE_3);
            errorList.add(MESSAGE_4);
            errorList.add(MESSAGE_5);
            errorList.add(MESSAGE_6);
            List<LogData> logDataList = logParserTest.parseLoggerExceptError(errorList, "DEBUG");
            assertNotNull(logDataList);
            assertEquals(2, logDataList.size());
        } catch(Exception ex) {
            fail();
        }
    }

}

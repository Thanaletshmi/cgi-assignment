package com.cgi.nl.service.test;

import com.cgi.nl.exception.DataNotFoundException;
import com.cgi.nl.exception.FileReaderException;
import com.cgi.nl.exception.InvalidInputException;
import com.cgi.nl.model.LogAnalyzer;
import com.cgi.nl.model.LogData;
import com.cgi.nl.processor.LogFileReader;
import com.cgi.nl.processor.LogParser;
import com.cgi.nl.service.LogAnalyzerServiceImpl;
import com.cgi.nl.util.test.TestConstantsUtil;
import com.cgi.nl.validator.RequestValidator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringRunner;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class LogAnalyzerServiceImplTest {

    @InjectMocks
    private LogAnalyzerServiceImpl logAnalyzerServiceTest;

    @Mock
    private RequestValidator validator = Mockito.mock(RequestValidator.class);

    @Mock
    private LogFileReader logFileReader= Mockito.mock(LogFileReader.class);

    @Mock
    private LogParser logParser = Mockito.mock(LogParser.class);

    @Test
    public void testLogAnalyzerForWARN() {

        try {
            LogData logData = new LogData("Node:", "[127.0.0.1]:5701 [dev] [3.2.5] No join method is enabled! Starting standalone.", 10);
            LogData logData1 = new LogData("AnnotationConfigEmbeddedWebApplicationContext:", "Exception encountered during context initialization - cancelling refresh attempt", 3);
            List<LogData> logDataList = new ArrayList<>();
            logDataList.add(logData);
            logDataList.add(logData1);
            Mockito.when(logFileReader.readLogFile()).thenReturn(new ArrayList<>());
            Mockito.when(logParser.parseLoggerExceptError(Mockito.anyList(), Mockito.anyString())).thenReturn(logDataList);
            LogAnalyzer logAnalyzer = logAnalyzerServiceTest.getLogData("WARN");
            assertNotNull(logAnalyzer);
            assertNotNull(logAnalyzer.getLogType());
            assertEquals("WARN", logAnalyzer.getLogType());
            assertNotNull(logAnalyzer.getLogDataList());
            assertEquals(2, logAnalyzer.getLogDataList().size());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void testLogAnalyzerForERROR() {

        try {
            LogData logData = new LogData("java.lang.NullPointerException:", "Exception in com.fluentgrid.repapp.web.rest.EventsResource.search() with cause = null java.lang.NullPointerException: null", 11);
            List<LogData> logDataList = new ArrayList<>();
            logDataList.add(logData);
            Mockito.when(logFileReader.readLogFile()).thenReturn(new ArrayList<>());
            Mockito.when(logParser.parseErrorLogger(Mockito.anyList())).thenReturn(logDataList);
            LogAnalyzer logAnalyzer = logAnalyzerServiceTest.getLogData("ERROR");
            assertNotNull(logAnalyzer);
            assertNotNull(logAnalyzer.getLogType());
            assertEquals("ERROR", logAnalyzer.getLogType());
            assertNotNull(logAnalyzer.getLogDataList());
            assertEquals(1, logAnalyzer.getLogDataList().size());
        } catch (Exception e) {
            fail();
        }
    }



}
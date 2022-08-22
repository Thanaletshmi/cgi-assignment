package com.cgi.nl.utils;

import com.cgi.nl.constants.AppConstants;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Component
public class AppUtil {

    public String extractLogName(final String message) {

        final List<String> array = Pattern.compile(" ")
                .splitAsStream(message)
                .collect(Collectors.toList());
        String exceptionName = AppConstants.DEFAULT_STRING;
        for(final String word : array) {
            if(word.matches(AppConstants.EXP_REGEX)) {
                exceptionName = word;
            }
        }
        return exceptionName;
    }
}

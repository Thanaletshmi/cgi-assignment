package com.cgi.nl.constants;

import java.util.regex.Pattern;

public class AppConstants {
    public static final String WELCOME_MESSAGE = "Welcome to Recipe and Log Analyzer Application !!!";
    public static final String MESSAGE = "message";
    public static final String CLASS = "class";
    public static final String EXP_REGEX = "(.*)\\.([A-Za-z]+Exception)(.*)";
    public static final String DEFAULT_STRING = "generalException";

    public static final String STRING_REGEX = "^[a-zA-Z ]*$";

    public final static String TIMESTAMP_REGEX = "(?<timestamp>\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2},\\d{3})";

    public final static String INFO_LEVEL_REGEX = "(?<level>INFO)";

    public final static String DEBUG_LEVEL_REGEX = "(?<level>DEBUG)";

    public final static String ERROR_LEVEL_REGEX = "(?<level>ERROR)";

    public final static String WARN_LEVEL_REGEX = "(?<level>WARN)";

    public final static String THREAD_REGEX = "\\[(?<thread>[^\\]]+)]";

    public final static String CLASS_REGEX = "(?<class>\\w+:)";

    public final static String MSG_RGX = "(?<message>.*)";

}

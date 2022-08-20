package com.cgi.nl.exception;

public class DataNotFoundException extends Exception {
    private String message;

    public DataNotFoundException(final String message) {
        super(message);
        this.message = message;
    }
    public DataNotFoundException() {
    }
}

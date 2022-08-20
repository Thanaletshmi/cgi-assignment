package com.cgi.nl.exception;

public class InvalidInputException extends Exception {
    private String message;

    public InvalidInputException(final String message) {
        super(message);
        this.message = message;
    }
    public InvalidInputException() {
    }
}

package com.cgi.nl.exception;

public class FileReaderException extends Exception {
    private String message;

    public FileReaderException(final String message) {
        super(message);
        this.message = message;
    }
    public FileReaderException() {
    }
}

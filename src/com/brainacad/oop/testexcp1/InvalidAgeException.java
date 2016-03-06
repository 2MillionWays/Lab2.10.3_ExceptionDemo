package com.brainacad.oop.testexcp1;


public class InvalidAgeException extends RuntimeException {
    private String message;

    public InvalidAgeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

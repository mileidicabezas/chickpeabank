package com.chickpeabank.exceptions;

public class InvalidValuesException extends Exception {
    public String getMessage() {
        return "values equal to zero are not allowed";
    }
}

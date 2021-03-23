package com.chickpeabank.exceptions;

public class RepeatedValuesException extends Exception {
    @Override
    public String getMessage() {
        return "Repeated values are not allowed";
    }
}



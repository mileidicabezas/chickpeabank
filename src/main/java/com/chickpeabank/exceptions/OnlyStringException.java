package com.chickpeabank.exceptions;

public class OnlyStringException extends Throwable {
    @Override
    public String getMessage() {
        return "Please just enter characters";
    }
}

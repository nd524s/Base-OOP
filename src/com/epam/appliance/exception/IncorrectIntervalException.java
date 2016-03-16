package com.epam.appliance.exception;

/**
 * Created by Никита on 25.11.2015.
 */
public class IncorrectIntervalException extends Exception {

    public IncorrectIntervalException() {
    }

    public IncorrectIntervalException(String message) {
        super(message);
    }

    public IncorrectIntervalException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectIntervalException(Throwable cause) {
        super(cause);
    }

    public IncorrectIntervalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

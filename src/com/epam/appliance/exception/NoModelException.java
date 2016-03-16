package com.epam.appliance.exception;

/**
 * Created by Никита on 28.11.2015.
 */
public class NoModelException extends Exception {
    public NoModelException() {
    }

    public NoModelException(String message) {
        super(message);
    }

    public NoModelException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoModelException(Throwable cause) {
        super(cause);
    }

    public NoModelException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

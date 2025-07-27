package com.bala.practice.exceptions;

public class Custom2Exception extends Exception{


    public Custom2Exception() {
    }

    public Custom2Exception(String message) {
        super(message);
    }

    public Custom2Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Custom2Exception(Throwable cause) {
        super(cause);
    }

    public Custom2Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

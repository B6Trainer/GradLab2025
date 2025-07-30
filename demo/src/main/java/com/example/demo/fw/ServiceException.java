package com.example.demo.fw;

public class ServiceException extends Exception{

    private int errorCode;
    private String errorMessage;

    public ServiceException(int _errorCode, String _errorMessage){
        this.errorCode=_errorCode;
        this.errorMessage=_errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}

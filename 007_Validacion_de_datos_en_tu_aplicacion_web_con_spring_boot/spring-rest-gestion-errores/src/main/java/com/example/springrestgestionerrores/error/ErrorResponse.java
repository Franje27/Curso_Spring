package com.example.springrestgestionerrores.error;

public class ErrorResponse {


    private String message;

    public ErrorResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

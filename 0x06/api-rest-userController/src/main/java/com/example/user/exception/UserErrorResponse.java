package com.example.user.exception;

public class UserErrorResponse {
    int status;
    String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserErrorResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public UserErrorResponse() {
    }
}

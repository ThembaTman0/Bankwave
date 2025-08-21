package com.bankwave.accounts.dto;

public class ResponseDto {
    private String statusCode;
    private String message;

    public ResponseDto() {
    }

    public ResponseDto(String statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    // getters and setters
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

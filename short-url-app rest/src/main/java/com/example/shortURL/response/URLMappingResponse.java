package com.example.shortURL.response;

public class URLMappingResponse {
    private String shortURL;
    private String errorMessage;

    public URLMappingResponse() {
    }

    public URLMappingResponse(String shortURL) {
        this.shortURL = shortURL;
    }

    public URLMappingResponse(String shortURL, String errorMessage) {
        this.shortURL = shortURL;
        this.errorMessage = errorMessage;
    }

    public String getShortURL() {
        return shortURL;
    }

    public void setShortURL(String shortURL) {
        this.shortURL = shortURL;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}


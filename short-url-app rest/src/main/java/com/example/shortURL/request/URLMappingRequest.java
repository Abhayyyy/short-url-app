package com.example.shortURL.request;

public class URLMappingRequest {
    private String originalURL;

    public URLMappingRequest() {
    }

    public URLMappingRequest(String originalURL) {
        this.originalURL = originalURL;
    }

    public String getOriginalURL() {
        return originalURL;
    }

    public void setOriginalURL(String originalURL) {
        this.originalURL = originalURL;
    }
}


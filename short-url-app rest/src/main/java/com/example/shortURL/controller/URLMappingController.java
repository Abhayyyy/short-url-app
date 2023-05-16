package com.example.shortURL.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shortURL.entity.URLMapping;
import com.example.shortURL.repo.URLMappingRepository;
import com.example.shortURL.request.URLMappingRequest;
import com.example.shortURL.response.URLMappingResponse;

@RestController
@RequestMapping("/api")
public class URLMappingController {
	@Autowired
	private URLMappingRepository urlMappingRepository;
	
	 @PostMapping("/shorten")
	    public ResponseEntity<URLMappingResponse> shortenURL(@RequestBody URLMappingRequest urlMappingRequest) {
	        // Validate URL structure
	        if (!isValidURL(urlMappingRequest.getOriginalURL())) {
	            return ResponseEntity.badRequest().body(new URLMappingResponse("Invalid URL"));
	        }

	        // Check for duplicate URLs
	        URLMapping existingMapping = urlMappingRepository.findByOriginalURL(urlMappingRequest.getOriginalURL());
	        if (existingMapping != null) {
	            return ResponseEntity.ok(new URLMappingResponse(existingMapping.getShortCode()));
	        }

	        // Generate a short code (e.g., using a unique ID or hash)
	        String shortCode = generateShortCode();

	        // Set expiration time (5 minutes from the current time)
	        Date expirationTime = new Date(System.currentTimeMillis() + 5 * 60 * 1000);

	        // Create URLMapping object
	        URLMapping urlMapping = new URLMapping();
	        urlMapping.setOriginalURL(urlMappingRequest.getOriginalURL());
	        urlMapping.setShortCode(shortCode);
	        urlMapping.setExpirationTime(expirationTime);

	        // Save the URL mapping in the database
	        urlMappingRepository.save(urlMapping);

	        // Return the short URL to the client
	        return ResponseEntity.ok(new URLMappingResponse(shortCode));
	    }

	    private boolean isValidURL(String url) {
	        // Implement your URL validation logic here
	        // You can use regular expressions or any other validation method
	        // For simplicity, this example assumes any non-empty string is considered a valid URL
	        return url != null && !url.isEmpty();
	    }

	    private String generateShortCode() {
	        // Implement your short code generation logic here
	        // This example generates a random 6-character alphanumeric code
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < 6; i++) {
	            int index = (int) (Math.random() * characters.length());
	            sb.append(characters.charAt(index));
	        }
	        return sb.toString();
	    }
}

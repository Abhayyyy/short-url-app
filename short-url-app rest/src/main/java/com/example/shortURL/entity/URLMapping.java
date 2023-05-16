package com.example.shortURL.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//
//@Entity
//public class URLMapping {
//    @Id
//    @Generated(strategy = Generated.IDENTITY)
//    private Long id;
//    private String originalURL;
//    private String shortCode;
//    // Add other fields as needed
//
//    // Getters and setters
//}
//
@Entity
public class URLMapping {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String originalURL;
	private String shortCode;
	private Date expirationTime;
	
	public URLMapping() {
		super();
	}
	
	public URLMapping(Long id, String originalURL, String shortCode, Date expirationTime) {
		super();
		this.id = id;
		this.originalURL = originalURL;
		this.shortCode = shortCode;
		this.expirationTime = expirationTime;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOriginalURL() {
		return originalURL;
	}
	public void setOriginalURL(String originalURL) {
		this.originalURL = originalURL;
	}
	public String getShortCode() {
		return shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}
	
	public Date getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Date expirationTime) {
        this.expirationTime = expirationTime;
    }
	
}

package com.example.shortURL.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shortURL.entity.URLMapping;

@Repository
public interface URLMappingRepository extends JpaRepository<URLMapping, Long> {
	URLMapping findByOriginalURL(String originalURL);
    URLMapping findByShortCode(String shortCode);
}

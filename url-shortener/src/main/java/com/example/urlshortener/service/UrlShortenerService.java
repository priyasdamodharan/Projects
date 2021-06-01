package com.example.urlshortener.service;
import com.example.urlshortener.model.UrlRequest;


public interface UrlShortenerService {
    String createShortUrl(UrlRequest urlRequest);
    String getLongUrl(String encryptedId);
    void deleteExpiredUrl();
}

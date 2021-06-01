package com.example.urlshortener.repository;

import com.example.urlshortener.entity.Url;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UrlRepository extends CrudRepository<Url,Long> {
    Optional<Url> findByUrl(String url);
}

//findurl.isPresent()

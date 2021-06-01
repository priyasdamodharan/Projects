package com.example.urlshortener.repository;


import com.example.urlshortener.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {
    Optional<Client> findByClientName(String name);
}



    //Optional is a class in java. It wraps an object.
    //If it returns a null, Optional provides a null objects. It avoids NullPointterException


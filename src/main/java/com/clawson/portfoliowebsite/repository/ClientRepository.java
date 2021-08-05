package com.clawson.portfoliowebsite.repository;

import java.util.List;

import com.clawson.portfoliowebsite.model.Client;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "client", path="client")
public interface ClientRepository extends MongoRepository<Client, String>{
    
    List<Client> findByLastName(@Param("name") String name);
}

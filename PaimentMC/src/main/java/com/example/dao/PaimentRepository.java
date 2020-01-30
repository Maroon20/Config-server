package com.example.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entities.Paiement;



@RepositoryRestResource
public interface PaimentRepository extends MongoRepository<Paiement,Id> {

}

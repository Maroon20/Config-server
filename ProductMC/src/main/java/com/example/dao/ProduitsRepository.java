package com.example.dao;

import com.example.entities.Produit;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProduitsRepository extends MongoRepository<Produit,Id>{

}

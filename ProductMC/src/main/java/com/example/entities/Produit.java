package com.example.entities;


import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Document
@Data @AllArgsConstructor @NoArgsConstructor
@RequiredArgsConstructor
public class Produit implements Serializable {
	@Id
	private String id;
	private String titre;
	private String description;
	private String image;
	private String prix;

}

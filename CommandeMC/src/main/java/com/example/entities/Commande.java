package com.example.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Document
@Data @AllArgsConstructor @NoArgsConstructor
@RequiredArgsConstructor
public class Commande {
	@Id
	private String id;
	private Integer productId;
	private Date dateCommande;
	private Integer quantite;
	private Boolean commandePayee;
	

}

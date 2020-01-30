package com.example.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Document
@Data @AllArgsConstructor @NoArgsConstructor
@RequiredArgsConstructor
public class Paiement {
	@Id
	private String id;
	private String idCommande;
	private Double montant;
	private Long numeroCarte;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(String idCommande) {
		this.idCommande = idCommande;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Long getNumeroCarte() {
		return numeroCarte;
	}
	public void setNumeroCarte(Long numeroCarte) {
		this.numeroCarte = numeroCarte;
	}
	

}

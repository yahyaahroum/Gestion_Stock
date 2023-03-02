package com.example.Gestion_Stock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="Client")
public class Client extends AbstractEntity{
@Column(name = "nom")
	private String nom;
@Column(name="prenom")	
	private String prenom;
@Embedded
private Adresse adresse;
@Column(name="photo")
	private String photo;
@Column(name="email")
	private String email;
@Column(name="numtel")
	private String numtel;



}

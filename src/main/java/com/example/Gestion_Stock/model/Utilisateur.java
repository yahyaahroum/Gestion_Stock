package com.example.Gestion_Stock.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name="Utilisateur")
public class Utilisateur extends AbstractEntity{
	@Column(name = "nom")
	private String nom;
@Column(name="prenom")	
	private String prenom;
@Column(name="password")
private String password;
@Embedded
private Adresse adresse;
@Column(name="photo")
	private String photo;
@Column(name="email")
	private String email;
@Column(name="numtel")
	private String numtel;
@ManyToOne
@JoinColumn(name="idEntreprise")
    private Entreprise entreprise;
@OneToMany(mappedBy = "utilisateur")
    private List<Roles> roles;
}

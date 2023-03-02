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
@Table(name="Entreprise")
public class Entreprise extends AbstractEntity {

	@Column(name = "nom")
	private String nom;
	@Column(name = "description")
	private String description;
	 @Embedded
	private Adresse adresse;
	 @Column(name = "codefiscal")
	private String codeFiscal;
	 @Column(name = "logo")
	private String logo;
	 @Column(name = "email")
	private String email;
	 @Column(name = "numtel")
	private String numTel;
	 @Column(name = "siteweb")
	private String siteWeb;
@OneToMany(mappedBy = "entreprise")
	private List<Utilisateur> utilisateurs;
}

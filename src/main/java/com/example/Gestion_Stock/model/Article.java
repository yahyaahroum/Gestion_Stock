package com.example.Gestion_Stock.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="Article")
public class Article extends AbstractEntity{
@Column(name="CodeArticle")
	private String CodeArticle;
@Column(name="Designation")
	private String Designation;
@Column(name="PrixUnitaireHT")
	private BigDecimal PrixUnitaireHT;
@Column(name="TauxTVA")
	private BigDecimal TauxTVA;
@Column(name="PrixUnitaireTTC")
	private BigDecimal PrixUnitaireTTC;
@Column(name="Photo")
private String Photo;
@ManyToOne
@JoinColumn(name="idcategorie")
private Categorie categorie;
}

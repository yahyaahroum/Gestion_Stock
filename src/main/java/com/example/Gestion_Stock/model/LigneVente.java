package com.example.Gestion_Stock.model;

import java.math.BigDecimal;
import java.text.Bidi;

import jakarta.persistence.Column;
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
@Table(name="LigneVente")
public class LigneVente extends AbstractEntity {
@ManyToOne
@JoinColumn(name = "idVente")
	private Vente vente;
@Column(name = "quantite")
private BigDecimal quantite;
@Column(name = "prixunitaire")
private BigDecimal prixUnitaire;
}

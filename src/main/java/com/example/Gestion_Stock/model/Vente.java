package com.example.Gestion_Stock.model;

import java.time.Instant;

import jakarta.persistence.Column;
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
@Table(name="Vente")
public class Vente extends AbstractEntity{
@Column(name="code")
private String code;
@Column(name="dateVente")
private Instant dateVente;
@Column(name="commentaire")
private String commentaire;
}

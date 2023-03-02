package com.example.Gestion_Stock.model;

import com.fasterxml.jackson.core.sym.Name;

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
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Entity
@Table(name="lignecmdclient")
public class LigneCmdClient extends AbstractEntity{

	@ManyToOne
	@JoinColumn(name ="idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name ="idCommandeClient")
	private CommandeClient commandeClient;
}

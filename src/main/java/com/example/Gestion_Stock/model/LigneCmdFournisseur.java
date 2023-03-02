package com.example.Gestion_Stock.model;

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


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="LigneCmdFounisseur")
public class LigneCmdFournisseur extends AbstractEntity{

	@ManyToOne
	@JoinColumn(name ="idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name ="idCommandeFournisseur")
	private CommandeFournisseur commandefournisseur;
}

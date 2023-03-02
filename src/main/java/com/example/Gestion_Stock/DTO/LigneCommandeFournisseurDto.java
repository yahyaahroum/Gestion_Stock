package com.example.Gestion_Stock.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LigneCommandeFournisseurDto {
	private Integer id;
	private articleDto article;
	private CommandeClientDto commandeFournisseur;
}

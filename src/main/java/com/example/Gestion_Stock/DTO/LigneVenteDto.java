package com.example.gestiondestock.DTO;

import java.math.BigDecimal;

import com.example.gestiondestock.model.LigneVente;
import com.example.gestiondestock.model.Vente;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.sound.sampled.Line;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LigneVenteDto {
	private Integer id;
	private VenteDto vente;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
	public static LigneVenteDto fromEntity(LigneVente ligneVente){
if(ligneVente==null){
	return null;
}
return LigneVenteDto.builder()
		.id(ligneVente.getId())
		//.vente(ligneVente.getVente())
		.quantite(ligneVente.getQuantite())
		.prixUnitaire(ligneVente.getPrixUnitaire())

		.build();
	}
	public static LigneVente toEntity(LigneVenteDto ligneventeDto){
             if (ligneventeDto==null){
				 return null;
			 }
			 LigneVente ligneVente=new LigneVente();
			 ligneVente.setId(ligneventeDto.getId());
			// ligneVente.setVente(ligneventeDto.getId());
		     ligneVente.setQuantite(ligneventeDto.getQuantite());
			 ligneVente.setPrixUnitaire(ligneventeDto.getPrixUnitaire());
               return ligneVente;

	}
}

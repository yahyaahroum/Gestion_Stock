package com.example.Gestion_Stock.DTO;

import com.example.Gestion_Stock.model.Adresse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdresseDto {
	private Integer id;
	private String adresse1;
	private String adresse2;
	private String ville;
	private String codePostale;
	private String pays;
	
	
	public static AdresseDto frontEntity(Adresse adresse) {
		if(adresse== null) {
			return null;
		}
		return AdresseDto.builder()
				.adresse1(adresse.getAdresse1())
				.adresse2(adresse.getAdresse2())
				.ville(adresse.getVille())
				.codePostale(adresse.getCodePostale())
				.pays(adresse.getPays())
				.build()
				;
		
	}
	public static Adresse toEntity(AdresseDto adressedto) {
		if(adressedto==null) {
			return null;
			}
		        Adresse adresse=new Adresse();
		        adresse.setAdresse1(adressedto.getAdresse1());
				adresse.setAdresse2(adressedto.getAdresse2());
				adresse.setVille(adressedto.getVille());
				adresse.setCodePostale(adressedto.getCodePostale());
				adresse.setPays(adressedto.getPays());
				return adresse;

	}
			
}


package com.example.Gestion_Stock.DTO;

import java.util.List;
import com.example.Gestion_Stock.model.Entreprise;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EntrepriseDto {
    private Integer id;
	private String nom;
	private String description;
	private AdresseDto adresse;
	private String codeFiscal;
	private String logo;
	private String email;
	private String numTel;
	private String siteWeb;
	private List<UtilisateurDto> utilisateurs;

	public static EntrepriseDto fromEntity(Entreprise entreprise){
if(entreprise==null){
	return null;
}
     return EntrepriseDto.builder()
		.id(entreprise.getId())
		.nom(entreprise.getNom())
		.description(entreprise.getDescription())
		//AdresseDto adresse;
		.codeFiscal(entreprise.getCodeFiscal())
		.logo(entreprise.getLogo())
		.email(entreprise.getEmail())
		.numTel(entreprise.getNumTel())
		.siteWeb(entreprise.getSiteWeb())
		.build();
	}
	public static Entreprise toEntity(EntrepriseDto entrepriseDto){
     if(entrepriseDto==null){
		 return null;
	 }
	 Entreprise entreprise=new Entreprise();
	         entreprise.setId(entrepriseDto.getId());
			 entreprise.setNom(entrepriseDto.getNom());
			 entreprise.setDescription(entrepriseDto.getDescription());
			 entreprise.setCodeFiscal(entrepriseDto.getCodeFiscal());
			 entreprise.setLogo(entrepriseDto.getLogo());
			 entreprise.setEmail(entrepriseDto.getEmail());
			 entreprise.setNumTel(entrepriseDto.getNumTel());
			 entreprise.setSiteWeb(entrepriseDto.getSiteWeb());
			 return entreprise;
	}
}

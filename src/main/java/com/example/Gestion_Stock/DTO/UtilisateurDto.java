package com.example.Gestion_Stock.DTO;

import java.util.List;

import com.example.Gestion_Stock.model.Utilisateur;
import com.example.gestiondestock.DTO.RolesDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UtilisateurDto {
	private Integer id;
	private String nom;	
	private String prenom;
    private String password;
    private AdresseDto adresse;
	private String photo;
	private String email;
	private String numtel;
	private EntrepriseDto entreprise;
    private List<RolesDto> roles;
	public static UtilisateurDto fromEntity(Utilisateur utiliateur){
        if(utiliateur==null)
		{
			return null;
		}
		return UtilisateurDto.builder()
				.id(utiliateur.getId())
				.nom(utiliateur.getNom())
				.prenom(utiliateur.getPrenom())
				.password(utiliateur.getPassword())
			//	.adresse(utiliateur.getAdresse())
				.photo(utiliateur.getPhoto())
				.email(utiliateur.getEmail())
				.numtel(utiliateur.getNumtel())
				//.entreprise(utiliateur.getEntreprise())
				.build();
	}
	public static Utilisateur toEntity(UtilisateurDto utilisateurDto){
          if(utilisateurDto==null){
			  return null;
		  }
		  Utilisateur utilisateur=new Utilisateur();
		  utilisateur.setId(utilisateurDto.getId());
		  utilisateur.setNom(utilisateurDto.getNom());
		  utilisateur .setPrenom(utilisateurDto.getPrenom());
		  utilisateur.setPassword(utilisateurDto.getPassword());
		  //utilisateur.setAdresse(utilisateurDto.getAdresse());
		  utilisateur.setPhoto(utilisateurDto.getPhoto());
		  utilisateur.setEmail(utilisateurDto.getEmail());
		  utilisateur.setNumtel(utilisateurDto.getNumtel());
		 // utilisateur.setEntreprise(utilisateurDto.getEntreprise());
		return utilisateur;
	}
}

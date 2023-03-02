package com.example.Gestion_Stock.DTO;


import com.example.Gestion_Stock.model.Fournisseur;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FournisseurDto {
	private Integer id;
	private String nom;
	private String prenom;
    private AdresseDto adresse;
	private String photo;
	private String email;
	private String numtel;

	public static FournisseurDto fromEntity(Fournisseur fournisseur){
		if(fournisseur==null){
			return null;
		}
		return FournisseurDto.builder()
		 .id(fournisseur.getId())
		 .nom(fournisseur.getNom())
		 .prenom(fournisseur.getPrenom())
		 //.adresse(fournisseur.getAdresse())
		 .photo(fournisseur.getPhoto())
		 .email(fournisseur.getEmail())
		 .numtel(fournisseur.getNumtel())
		 .build();
	}
	public static Fournisseur toEntity(FournisseurDto fournisseurDto){
       if (fournisseurDto==null){
	     return null;
       }
   Fournisseur fournisseur=new Fournisseur();
		fournisseur.setId(fournisseurDto.getId());
		fournisseur.setNom(fournisseurDto.getNom());
		fournisseur.setPrenom(fournisseurDto.getPrenom());
		//fournisseur.setAdresse(fournisseurDto.getAdresse());
		fournisseur.setPhoto(fournisseurDto.getPhoto());
		fournisseur.setEmail(fournisseurDto.getEmail());
		fournisseur.setNumtel(fournisseurDto.getNumtel());

		return  fournisseur;
	}

}

package com.example.Gestion_Stock.DTO;

import com.example.Gestion_Stock.model.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {
	private Integer id;
	private String nom;	
	private String prenom;
    private AdresseDto adresse;
	private String photo;
	private String email;
	private String numtel;

public static ClientDto fromEntity(Client client){
	if(client==null){
		return null;
	}
	return ClientDto.builder()
			.id(client.getId())
			.nom(client.getNom())
	        .prenom(client.getPrenom())
	       // .adresse(client.getAdresse())
	        .email(client.getEmail())
			.numtel(client.getNumtel())
			.build();

}
public static Client toEntity(ClientDto clientDto)
{
if (clientDto==null)
{
return null;
}
            Client client=new Client();
            client.setId(clientDto.getId());
	        client.setNom(clientDto.getNom());
			client.setPrenom(clientDto.getPrenom());
			client.setEmail(clientDto.getEmail());
			client.setNumtel(clientDto.getNumtel());
			return client;
}
}

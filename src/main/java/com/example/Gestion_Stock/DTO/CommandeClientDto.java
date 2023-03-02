package com.example.Gestion_Stock.DTO;

import java.time.Instant;
import java.util.List;

import com.example.Gestion_Stock.model.Client;
import com.example.Gestion_Stock.model.CommandeClient;
import com.example.Gestion_Stock.model.LigneCmdClient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommandeClientDto {
	private Integer id;
	private String idcommandeclient;
    private Instant dateCommande;
	private ClientDto client;
	private List<LigneCommandeClientDto> LigneCommandeClient;

	public static CommandeClientDto fromEntity(CommandeClient commandeClient){
		if(commandeClient==null){
			return null;
		}
		return CommandeClientDto.builder()
				.id(commandeClient.getId())
				.idcommandeclient(commandeClient.getIdcommandeclient())
				.dateCommande(commandeClient.getDateCommande())
				//.client.(commandeClient.getClient());
				.build();

	}
	public static CommandeClient toEntity(CommandeClientDto commandeclientDto){
		if(commandeclientDto==null){
			return null;
		}
		CommandeClient commandeclient =new CommandeClient();
		        commandeclient.setId(commandeclientDto.getId());
				commandeclient.setIdcommandeclient(commandeclientDto.getIdcommandeclient());
				commandeclient.setDateCommande(commandeclientDto.getDateCommande());

		return commandeclient;
	}
}

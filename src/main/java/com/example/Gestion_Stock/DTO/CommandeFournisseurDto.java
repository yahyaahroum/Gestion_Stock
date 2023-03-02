package com.example.Gestion_Stock.DTO;

import com.example.Gestion_Stock.model.CommandeFournisseur;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommandeFournisseurDto {
	private Integer id;
	private String code;
    private Instant dateCommande;
	private FournisseurDto fournisseur;
	private List<LigneCommandeFournisseurDto> LigneCommandeFournisseur;

	public static CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur){
if (commandeFournisseur==null){
	return null;
}
return CommandeFournisseurDto.builder()
		.id(commandeFournisseur.getId())
		.code(commandeFournisseur.getCode())
		.dateCommande(commandeFournisseur.getDateCommande())
		.build();
	}
	public static CommandeFournisseur toEntity(CommandeFournisseurDto commandefournisseurDto){
if (commandefournisseurDto==null)
{
	return null;
}
CommandeFournisseur cmdFrs=new CommandeFournisseur();
		cmdFrs.setId(commandefournisseurDto.getId());
		cmdFrs.setCode(commandefournisseurDto.getCode());
		cmdFrs.setDateCommande(commandefournisseurDto.getDateCommande());
		return cmdFrs;
	}
}

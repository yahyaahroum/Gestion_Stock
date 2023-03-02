package com.example.gestiondestock.validator;

import com.example.gestiondestock.DTO.CommandeClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeClientValidator {
    public static List<String> validate(CommandeClientDto commandeClientDto){
        List<String> errors=new ArrayList<>();
        if(commandeClientDto.getDateCommande()==null){
            errors.add("Il faut ajouter la date de la commande !");
        }
        if(commandeClientDto.getClient()==null){
            errors.add("Il faut ajout un client !");
        }

        return errors;
    }
}


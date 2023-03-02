package com.example.gestiondestock.validator;

import com.example.gestiondestock.DTO.CommandeFournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeFournisseurValidator {
    public static List<String> validate(CommandeFournisseurDto commandeFournisseurDto){
        List<String> errors=new ArrayList<>();
        if(!StringUtils.hasLength(commandeFournisseurDto.getCode())){
            errors.add("Il faut saisir le code");
        }
        if(commandeFournisseurDto.getDateCommande()==null){
            errors.add("Il faut ajouter la date de commande");
        }
        if(commandeFournisseurDto.getFournisseur()==null){
            errors.add("Il fait ajouter un fournisseur");
        }
        return errors;
    }

}

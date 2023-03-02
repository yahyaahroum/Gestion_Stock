package com.example.gestiondestock.validator;

import com.example.gestiondestock.DTO.ClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {
    public static List<String> validate(ClientDto clientDto){
        List<String> errors=new ArrayList<>();
        if(!StringUtils.hasLength(clientDto.getEmail())){
            errors.add("Il faut saisir l'adresse email !");
        }
        if(!StringUtils.hasLength(clientDto.getNom())){
            errors.add("Il faut saisir le nom!");
        }
        if(!StringUtils.hasLength(clientDto.getPrenom())){
            errors.add("Il faut saisir le prénom !");
        }
        if(clientDto.getAdresse()==null){
            errors.add("Il faut ajouter une adresse");
        }
        return errors;
    }

}

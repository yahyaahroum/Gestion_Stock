package com.example.gestiondestock.validator;

import com.example.gestiondestock.DTO.FournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {
    public static List<String> validate(FournisseurDto fournisseurDto){
        List<String> errors=new ArrayList<>();
        if(!StringUtils.hasLength(fournisseurDto.getNom())){
            errors.add("Il faut ajouter un nom !");
        }
        if(!StringUtils.hasLength(fournisseurDto.getEmail())){
            errors.add("Il faut saisir une adresse email");
        }
        if(!StringUtils.hasLength(fournisseurDto.getNumtel())){
            errors.add("Il faut entrer un numero de telephone");
        }
        if(fournisseurDto.getAdresse()==null){
            errors.add("Il faut saisir une adresse !");
        }
        return errors;
    }

}

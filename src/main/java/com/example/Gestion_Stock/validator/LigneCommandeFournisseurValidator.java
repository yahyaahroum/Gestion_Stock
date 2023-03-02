package com.example.gestiondestock.validator;

import com.example.gestiondestock.DTO.LigneCommandeFournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class LigneCommandeFournisseurValidator {
    public static List<String> validate(LigneCommandeFournisseurDto ligneCommandeFournisseurDto){
        List<String> errors=new ArrayList<>();
        if(ligneCommandeFournisseurDto.getCommandeFournisseur()==null){
            errors.add("Il faut ajouter une commande !");
        }
        if(ligneCommandeFournisseurDto.getArticle()==null){
            errors.add("Il faut ajouter un article !");
        }
        return errors;
    }
}


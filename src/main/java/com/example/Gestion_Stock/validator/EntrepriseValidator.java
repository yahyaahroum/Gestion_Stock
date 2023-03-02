package com.example.gestiondestock.validator;

import com.example.gestiondestock.DTO.EntrepriseDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidator {
    public static List<String> validate(EntrepriseDto entrepriseDto){
        List<String> errors=new ArrayList<>();
        if(!StringUtils.hasLength(entrepriseDto.getNom())){
            errors.add("il faut saisir le nom d'entreprise !");
        }
        if(!StringUtils.hasLength(entrepriseDto.getEmail())){
            errors.add("Li faut saisir l'adresse email !");
        }
        if(!StringUtils.hasLength(entrepriseDto.getCodeFiscal())){
            errors.add("Il faut ajouter le code fiscale !");
        }
        return errors;
    }
}


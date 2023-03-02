package com.example.gestiondestock.validator;

import com.example.gestiondestock.DTO.AdresseDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class AdresseValidator {

    public static List<String> validate(AdresseDto adresseDto) {
        List<String> errors=new ArrayList<>();
       if(!StringUtils.hasLength(adresseDto.getAdresse1())){
           errors.add("Il faut saisir l'adresse");
       }
        if(!StringUtils.hasLength(adresseDto.getVille())){
            errors.add("Il faut saisir la ville");
        }
        return errors;
    }
}

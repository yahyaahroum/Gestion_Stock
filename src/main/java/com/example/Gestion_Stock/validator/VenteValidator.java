package com.example.gestiondestock.validator;

import com.example.gestiondestock.DTO.VenteDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class VenteValidator {
    public static List<String> validate(VenteDto venteDto){
        List<String> errors=new ArrayList<>();
        if(!StringUtils.hasLength(venteDto.getCode())){
            errors.add("Il faut saisir le code de vente !");
        }
        if(venteDto.getDateVente()==null){
            errors.add("Il faut saisir la date de vente !");
        }

        return errors;
    }

}

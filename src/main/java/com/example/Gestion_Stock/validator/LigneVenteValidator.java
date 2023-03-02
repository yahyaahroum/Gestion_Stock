package com.example.gestiondestock.validator;

import com.example.gestiondestock.DTO.LigneVenteDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class LigneVenteValidator {
    public static List<String> validate(LigneVenteDto ligneVenteDto){
        List<String> errors=new ArrayList<>();
        if(ligneVenteDto.getVente()==null){
            errors.add("Il faut ajouter une vente !");
        }
        if(ligneVenteDto.getPrixUnitaire()==null){
            errors.add("Il faut saisir le prix unitaire HT !");
        }
        if(ligneVenteDto.getQuantite()==null){
            errors.add("Il faut saisir la quantité !");
        }

        return errors;
    }
}


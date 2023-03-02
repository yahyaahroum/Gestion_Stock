package com.example.gestiondestock.validator;

import com.example.gestiondestock.DTO.LigneCommandeClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class LigneCommandeClientValidator {
    public static List<String> validate(LigneCommandeClientDto ligneCommandeClientDto){
        List<String> errors=new ArrayList<>();
        if(ligneCommandeClientDto.getCommandeClient()==null){
            errors.add("Il faut ajouter une commande !");
        }
        if(ligneCommandeClientDto.getArticle()==null){
            errors.add("Il faut ajouter un article !");
        }

        return errors;
    }
}


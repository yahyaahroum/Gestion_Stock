package com.example.gestiondestock.validator;

import com.example.gestiondestock.DTO.articleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {
    public static List<String> validate(articleDto articleDto) {
        List<String> errors=new ArrayList<>();

        if(!StringUtils.hasLength(articleDto.getCodeArticle())){
            errors.add("Il faut saisir le code article");
        }
        if(!StringUtils.hasLength(articleDto.getDesignation())){
            errors.add("Il faut saisir la designation !");
        }
        if(articleDto.getPrixUnitaireHT()==null){
            errors.add("Il faut saisir le prix HT");
        }
        if(articleDto.getTauxTVA()==null){
            errors.add("Il faut saisir le taux de TVA !");
        }

        return errors;
    }
}


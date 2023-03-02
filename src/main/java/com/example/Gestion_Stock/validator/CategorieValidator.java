package com.example.gestiondestock.validator;

import com.example.gestiondestock.DTO.CategorieDto;
import com.example.gestiondestock.DTO.articleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategorieValidator {
    public static List<String> validate(CategorieDto categorieDto) {
        List<String> errors = new ArrayList<>();

        if (!StringUtils.hasLength(categorieDto.getCode())) {
            errors.add("Il faut saisir le code");
        }
        if (!StringUtils.hasLength(categorieDto.getDesignation())) {
            errors.add("Il faut saisir la designation!");
        }
        if (categorieDto.getArticles() == null) {
            errors.add("Il faut ajouter un article !");
        }
        return errors;
    }
}
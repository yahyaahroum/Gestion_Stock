package com.example.Gestion_Stock.validator;

import com.example.Gestion_Stock.DTO.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

    public static List<String> validate(UtilisateurDto utilisateurDto){
        List<String> errors=new ArrayList<>();
        if(!StringUtils.hasLength(utilisateurDto.getEmail())){
            errors.add("Il faut saisir l'email !");
        }
        if(!StringUtils.hasLength(utilisateurDto.getNom())){
            errors.add("Il faut saisir le nom !");
        }
        if(!StringUtils.hasLength(utilisateurDto.getPrenom())){
            errors.add("Il faut saisir le prenom !");
        }
        if(!StringUtils.hasLength(utilisateurDto.getNumtel())){
            errors.add("Il faut saisir le numero de telephone!");
        }
        if(!StringUtils.hasLength(utilisateurDto.getPassword())){
            errors.add("Il faut saisir le mot de passe!");
        }
        if(utilisateurDto.getAdresse()==null){
            errors.add("Il faut saisir une adresse !");
        }
        if(utilisateurDto.getEntreprise()==null){
            errors.add("Il faut saisir une entreprise !");
        }
        if(utilisateurDto.getRoles()==null){
            errors.add("Il faut saisir le role d'utilisateur!");
        }
        return errors;
    }
}


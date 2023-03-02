package com.example.gestiondestock.validator;

import com.example.gestiondestock.DTO.RolesDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class RolesValidator {
    public static List<String> validate(RolesDto rolesDto){
        List<String> errors=new ArrayList<>();
        if(!StringUtils.hasLength(rolesDto.getRoleName())){
            errors.add("Il faut saisir le nom du role!");
        }
        if(rolesDto.getUtilisateur()==null){
            errors.add("il faut ajouter un utilisateur");
        }

        return errors;
    }
}


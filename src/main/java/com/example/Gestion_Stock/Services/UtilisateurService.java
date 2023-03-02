package com.example.gestiondestock.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestiondestock.Repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {
	@Autowired
	private UtilisateurRepository utilisateurRepo; 
}

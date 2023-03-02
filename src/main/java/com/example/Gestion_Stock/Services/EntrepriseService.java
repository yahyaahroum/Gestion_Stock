package com.example.gestiondestock.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestiondestock.Repository.EntrepriseRepository;
import org.springframework.stereotype.Service;

@Service
public class EntrepriseService {
	@Autowired
	private EntrepriseRepository entrepriseRepo;
}

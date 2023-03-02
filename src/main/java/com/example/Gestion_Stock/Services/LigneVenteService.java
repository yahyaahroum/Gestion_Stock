package com.example.gestiondestock.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestiondestock.Repository.LigneVenteRepository;
import org.springframework.stereotype.Service;

@Service
public class LigneVenteService {
	@Autowired
	private LigneVenteRepository ligneVenteRepo;
}

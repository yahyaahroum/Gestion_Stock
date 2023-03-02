package com.example.gestiondestock.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestiondestock.Repository.VenteRepository;
import org.springframework.stereotype.Service;

@Service
public class VenteService {
	@Autowired
	private VenteRepository VenteRepo;
}

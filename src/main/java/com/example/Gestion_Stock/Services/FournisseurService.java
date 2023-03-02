package com.example.gestiondestock.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestiondestock.Repository.FournisseurRepository;
import org.springframework.stereotype.Service;

@Service
public class FournisseurService {
	@Autowired
	private FournisseurRepository fournisseurRepo;
}

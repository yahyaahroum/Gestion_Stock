package com.example.gestiondestock.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestiondestock.Repository.LigneCmdFournisseurRepository;
import org.springframework.stereotype.Service;

@Service
public class LigneCmdFournisseurService {
	@Autowired
	private LigneCmdFournisseurRepository LigneCmdFournisseurRepo;
}

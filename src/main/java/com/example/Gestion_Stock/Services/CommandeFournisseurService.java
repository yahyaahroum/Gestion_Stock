package com.example.gestiondestock.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestiondestock.Repository.CommandeFournisseurRepository;
import org.springframework.stereotype.Service;

@Service
public class CommandeFournisseurService {
	@Autowired
	private CommandeFournisseurRepository CommandeFournisseurRepo;
}

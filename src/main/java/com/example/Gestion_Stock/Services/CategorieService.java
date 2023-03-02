package com.example.gestiondestock.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestiondestock.Repository.CategorieRepository;
import org.springframework.stereotype.Service;

@Service
public class CategorieService {
	@Autowired
	private CategorieRepository categorieRepo;
}

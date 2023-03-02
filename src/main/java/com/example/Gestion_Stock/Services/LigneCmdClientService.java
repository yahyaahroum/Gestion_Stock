package com.example.gestiondestock.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestiondestock.Repository.LigneCmdClientRepository;
import org.springframework.stereotype.Service;

@Service
public class LigneCmdClientService {
	@Autowired
	private LigneCmdClientRepository ligneCmdClientRep;
}

package com.example.gestiondestock.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestiondestock.Repository.CommandeClientRepository;
import org.springframework.stereotype.Service;

@Service
public class CommandeClientService {
	@Autowired 
	private CommandeClientRepository CommandeClientRepo;
}

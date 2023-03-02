package com.example.gestiondestock.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestiondestock.Repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepo;
}

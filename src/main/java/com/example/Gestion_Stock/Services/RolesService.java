package com.example.gestiondestock.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestiondestock.Repository.RolesRepository;
import org.springframework.stereotype.Service;

@Service
public class RolesService {
	@Autowired
	private RolesRepository rolesRepo;
}

package com.example.gestiondestock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestiondestock.model.CommandeClient;

public interface CommandeClientRepository extends JpaRepository<CommandeClient, Integer>{

}

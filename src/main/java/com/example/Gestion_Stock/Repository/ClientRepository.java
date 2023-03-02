package com.example.gestiondestock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestiondestock.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{

}

package com.example.gestiondestock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestiondestock.model.Vente;

public interface VenteRepository extends JpaRepository<Vente, Integer>{

}

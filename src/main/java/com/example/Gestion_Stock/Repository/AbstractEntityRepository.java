package com.example.gestiondestock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestiondestock.model.AbstractEntity;

public interface AbstractEntityRepository extends JpaRepository<AbstractEntity, Integer> {

}

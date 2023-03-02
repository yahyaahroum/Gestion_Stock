package com.example.Gestion_Stock.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="Categorie")
public class Categorie extends AbstractEntity{
	@Column(name="code")
	private String code;
	@Column(name="Designation")
	private String Designation;
	@OneToMany(mappedBy = "categorie")
	private List<Article> articles;

}

package com.example.Gestion_Stock.model;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="CommandeClient")
public class CommandeClient extends AbstractEntity{
@Column(name = "idcommandeclient")
	private String idcommandeclient;
@Column(name = "dateCommande")
    private Instant dateCommande;
@ManyToOne
@JoinColumn(name = "idclient")
	private Client client;
@OneToMany(mappedBy = "commandeClient")
	private List<LigneCmdClient> LigneCommandeClient;
}

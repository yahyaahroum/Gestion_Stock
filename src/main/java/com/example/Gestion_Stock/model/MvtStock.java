package com.example.Gestion_Stock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="MvtStock")
public class MvtStock extends AbstractEntity{

}

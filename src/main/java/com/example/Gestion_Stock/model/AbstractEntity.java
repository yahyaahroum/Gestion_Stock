package com.example.Gestion_Stock.model;



import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AbstractEntity implements Serializable{
@Id
@GeneratedValue
	private Integer id;
@CreatedDate
@Column(name="DateCreation",nullable = false)
@JsonIgnore
private Instant DateCreation;
@LastModifiedDate
@Column(name="lastModifieDate")
@JsonIgnore
private Instant lastModifieDate;

}

package com.example.Gestion_Stock.DTO;

import java.util.List;

import com.example.Gestion_Stock.model.Article;

import com.example.Gestion_Stock.model.Categorie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategorieDto {
	private Integer id;
	private String code;
	private String Designation;
	private List<articleDto> articles;
	public static CategorieDto fromEntity(Categorie categorie){
		if(categorie==null){
			return null;
		}
		return CategorieDto.builder()
				.id(categorie.getId())
				.code(categorie.getCode())
				.Designation(categorie.getDesignation())
				.build();
	}
	public static Categorie toEntity(CategorieDto categorieDto) {
		if (categorieDto == null) {
			return null;

		}
Categorie categorie=new Categorie();
		categorie.setId(categorieDto.getId());
		categorie.setCode(categorieDto.getCode());
		categorie.setDesignation(categorieDto.getDesignation());
		return categorie;


	}

}

package com.example.Gestion_Stock.DTO;

import java.math.BigDecimal;
import java.util.Optional;

import com.example.Gestion_Stock.model.Article;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class articleDto {
	private Integer id;
	private String CodeArticle;
	private String Designation;
	private BigDecimal PrixUnitaireHT;
	private BigDecimal TauxTVA;
	private BigDecimal PrixUnitaireTTC;
    private String Photo;
    private CategorieDto categorie;

	public static articleDto fromEntity(Article article){
		if(article==null){
			return null;
		}
		return articleDto.builder()
				.id(article.getId())
				.CodeArticle(article.getCodeArticle())
				.Designation(article.getDesignation())
		        .PrixUnitaireHT(article.getPrixUnitaireHT())
		        .TauxTVA(article.getTauxTVA())
		        .PrixUnitaireTTC(article.getPrixUnitaireTTC())
		        .Photo(article.getPhoto())
				.categorie(CategorieDto.fromEntity(article.getCategorie()))
				.build();
	}
	public static Article toEntity(articleDto articledto){
		if(articledto==null)
		{
			return null;
		}
		Article article=new Article();
		article.setId(articledto.getId());
		article.setCodeArticle(articledto.getCodeArticle());
		article.setDesignation(articledto.getDesignation());
		article.setPrixUnitaireHT(articledto.getPrixUnitaireHT());
		article.setTauxTVA(articledto.getTauxTVA());
		article.setPrixUnitaireTTC(articledto.getPrixUnitaireTTC());
		article.setPhoto(articledto.getPhoto())	;
		article.setCategorie(article.getCategorie());
		return article;
	}
    
}



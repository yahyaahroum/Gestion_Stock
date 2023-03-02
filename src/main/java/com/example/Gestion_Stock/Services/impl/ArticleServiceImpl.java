package com.example.Gestion_Stock.Services.impl;

import com.example.Gestion_Stock.DTO.articleDto;
import com.example.Gestion_Stock.Repository.ArticleRepository;
import com.example.gestiondestock.Services.ArticleService;
import com.example.Gestion_Stock.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {
@Autowired(required = true)
     ArticleRepository articleRepo;

    public ArticleServiceImpl(ArticleRepository articleRepo) {
        this.articleRepo = articleRepo;
    }


    @Override
    public articleDto findById(Integer id) {
     return articleDto.fromEntity(articleRepo.findById(id).get());
    }
    public Optional<Article> searchById(Integer id){
        return articleRepo.findById(id);
    }
}

package com.example.Gestion_Stock.Controller;

import com.example.gestiondestock.Services.impl.ArticleServiceImpl;
import com.example.Gestion_Stock.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    @Autowired
    ArticleServiceImpl articleService;

 //   @GetMapping("/{id}")
   // public articleDto findById(@PathVariable Integer id){
      //  return articleService.findById(id);
  //  }
   // @GetMapping("/{id}")
   // public Optional<Article> searchById(@PathVariable Integer id){
      //  return articleService.searchById(id);
  //  }

}

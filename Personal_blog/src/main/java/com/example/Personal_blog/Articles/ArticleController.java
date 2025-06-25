package com.example.Personal_blog.Articles;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;


@RestController
public class ArticleController {

    private final ArticleRepository repository;

    ArticleController(ArticleRepository repository){
        this.repository = repository;
    }

    @GetMapping("/get_all_articles")
    public ArrayList<Article> getAll(){
        return (ArrayList<Article>) repository.findAll();
    }

    @GetMapping("get_article_by_id/{id}")
    public Article getOne(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("No article found"));
    }

    @PostMapping("create_article")
    public Article newArticle(@RequestBody Article newArticle){
        return repository.save(newArticle);
    }

    @PutMapping("update_article/{id}")
    public Article updateArticle(@RequestBody Article updatedArticle, @PathVariable long id) {
        return repository.findById(id).map(article -> {
            article.setArticleContent(updatedArticle.getArticleContent());
            return repository.save(article); // Return the updated article
        }).orElseGet(() -> {
            return repository.save(updatedArticle); // Save the new article if not found
        });
    }

    @DeleteMapping("delete_article/{id}")
    public void deleteArticle(@PathVariable long id){
        repository.deleteById(id);
    }
}

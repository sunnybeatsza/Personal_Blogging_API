package com.example.Personal_blog.Articles;

import org.springframework.data.jpa.repository.JpaRepository;


interface ArticleRepository extends JpaRepository<Article, Long>{

}
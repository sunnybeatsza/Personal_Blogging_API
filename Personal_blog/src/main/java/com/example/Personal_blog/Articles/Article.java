package com.example.Personal_blog.Articles;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.Objects;

@Entity
public class Article {
    private @Id
    @GeneratedValue Long id;
    private String articleAuthor;
    private int articleYear;
    private ArrayList<String> articleTags;
    private String articleContent;


    public Article() {
    }

    public Article(String articleAuthor, int articleYear, ArrayList<String> articleTags, String articleContent){
        this.articleAuthor = articleAuthor;
        this.articleYear = articleYear;
        this.articleTags = articleTags;
        this.articleContent = articleContent;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Double.compare(id, article.id) == 0;
    }

    @Override
    public String toString() {
        return "Article{\n" +
                "    articleId=" + id + ",\n" +
                "    articleAuthor='" + articleAuthor + "',\n" +
                "    articleYear=" + articleYear + ",\n" +
                "    articleTags=" + articleTags + ",\n" +
                "    articleContent='" + articleContent + "'\n" +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }



    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public long getArticleId() {
        return id;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public int getArticleYear() {
        return articleYear;
    }

    public void setArticleYear(int articleYear) {
        this.articleYear = articleYear;
    }

    public ArrayList<String> getArticleTags() {
        return articleTags;
    }

    public void setArticleTags(ArrayList<String> articleTags) {
        this.articleTags = articleTags;
    }

}

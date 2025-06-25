package com.example.Personal_blog.Articles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;


@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ArticleRepository repository){
        return args -> {
            ArrayList<String> articleTags = new ArrayList<>();
            articleTags.add("Africa");
            articleTags.add("Finance");

            String articleContent = "PIC enters partnership with UK development finance institution";
            log.info("Preloading data " + repository.save(new Article("Tumisho", 2025, articleTags, articleContent)));
        };
    }
}

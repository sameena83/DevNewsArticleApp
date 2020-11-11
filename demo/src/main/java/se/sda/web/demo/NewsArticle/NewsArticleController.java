package se.sda.web.demo.NewsArticle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NewsArticleController {

    private List<NewsArticle> newsArticles;

    public NewsArticleController() {
        this.newsArticles = new ArrayList<>();
        newsArticles.add(new NewsArticle(1L, "Gullivers travels", "its about gullivers travel", "Jonathan Swift"));
        newsArticles.add(new NewsArticle(2L, "clarissa", "tragic story of a heroine", "Samuel Richadson"));
        newsArticles.add(new NewsArticle(3L, "Emma", "its about sparkling life of Emma", "Jane Austen"));
        newsArticles.add(new NewsArticle(4L, "Frankenstein", "its aa horror novel", "Mary Shelle"));


    }

    @GetMapping("/newsArticles")
    public List<NewsArticle> getAll(){
        return newsArticles;

    }

    @GetMapping("/newsArticles/{id}")
    public NewsArticle getById(@PathVariable Long id){
        for(NewsArticle n: newsArticles){
            if(n.getId().equals(id)){
                return n;
            }
        }
         return null;
       }

    @PostMapping("/newsArticles")
        public NewsArticle create(@RequestBody NewsArticle newsArticle) {
            newsArticles.add(newsArticle);
            return newsArticle;
        }
    }






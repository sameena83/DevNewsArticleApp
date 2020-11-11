package se.sda.web.demo.NewsArticle;

public class NewsArticle {
    private Long id;
    private String title;
    private String body;
    private String authorName;


    public NewsArticle(Long id, String title, String body, String authorName) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.authorName = authorName;
    }



    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }
}

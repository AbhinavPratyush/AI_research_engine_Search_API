package Ai_Research_Engine.Orchestration_Api.Repo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Url")
public class UrlSentForRanking {
    private String title;
    private String link;
    private String snippet;


    public UrlSentForRanking() {
    }

    public UrlSentForRanking(String title, String link, String snippet) {
        this.title = title;
        this.link = link;
        this.snippet = snippet;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }
//other attributes will add it later
}

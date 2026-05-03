package Ai_Research_Engine.Orchestration_Api.Repo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Querry")
public class QuerrySentFromUser {

    String query;
    public List<String> urlAssociated;



    public QuerrySentFromUser(String query, List<String> urlAssociated) {
        this.query = query;
        this.urlAssociated = urlAssociated;
    }

    public QuerrySentFromUser() {
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<String> getUrlAssociated() {
        return urlAssociated;
    }

    public void setUrlAssociated(List<String> urlAssociated) {
        this.urlAssociated = urlAssociated;
    }
}

package Ai_Research_Engine.Orchestration_Api.Repo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Querry")
public class QuerrySentFromUser {

    String query;
    public ArrayList<String> urlAssociated;



    public QuerrySentFromUser(String query, ArrayList<String> urlAssociated) {
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

    public ArrayList<String> getUrlAssociated() {
        return urlAssociated;
    }

    public void setUrlAssociated(ArrayList<String> urlAssociated) {
this.urlAssociated=urlAssociated;
    }


}

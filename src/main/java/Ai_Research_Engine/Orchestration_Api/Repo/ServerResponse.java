package Ai_Research_Engine.Orchestration_Api.Repo;

import Ai_Research_Engine.Orchestration_Api.DuckDuckGo.UrlResult;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ServerResponse {
    @JsonProperty("organic_results")
    List<UrlResult> organic_results;

    public List<UrlResult> getOrganic_results() {
        return organic_results;
    }

    public void setOrganic_results(List<UrlResult> organic_results) {
        this.organic_results = organic_results;
    }
}

package Ai_Research_Engine.Orchestration_Api.Services;

import Ai_Research_Engine.Orchestration_Api.Repo.UrlSentForRanking;
import Ai_Research_Engine.Orchestration_Api.SerperApi.QuerrySent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankingAlgo {
    public void rank(List<UrlSentForRanking> urlResults, QuerrySent querrySent){
        // will integrate it later


        //it returns nothing because why to return anything , just send
        // to the rag model from ranking service only, why to bring back the data here
    }
}

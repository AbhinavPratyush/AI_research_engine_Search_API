package Ai_Research_Engine.Orchestration_Api.Services;

import Ai_Research_Engine.Orchestration_Api.DTO.QueryDTO;
import Ai_Research_Engine.Orchestration_Api.Repo.QuerrySentFromUser;
import Ai_Research_Engine.Orchestration_Api.Repo.UrlSentForRanking;
import Ai_Research_Engine.Orchestration_Api.DuckDuckGo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Mapper {




    public QuerrySent mapL2R(QueryDTO queryDTO,QuerrySent querrySent){
        querrySent.setQ(queryDTO.getQuery());
        return querrySent;
    }

    public QuerrySentFromUser mapL2R(QueryDTO queryDTO,QuerrySentFromUser querrySentFromUser){
    querrySentFromUser.setQuery(queryDTO.getQuery());
        return querrySentFromUser;
    }

    public QuerrySent mapL2R(QuerrySentFromUser querrySentFromUser, QuerrySent querrySent){
        querrySent.setQ(querrySentFromUser.getQuery());

        return querrySent;
    }
    public QuerrySentFromUser mapL2R(QuerrySent querrySent,QuerrySentFromUser querrySentFromUser){
        querrySentFromUser.setQuery(querrySent.getQ());
        return querrySentFromUser;
    }
    public UrlSentForRanking mapL2R(UrlResult urlResult, UrlSentForRanking urlSentForRanking){
        urlSentForRanking.setLink(urlResult.getLink());
        urlSentForRanking.setSnippet(urlResult.getSnippet());
        urlSentForRanking.setLink(urlResult.getLink());

        return urlSentForRanking;
    }
    public UrlResult mapL2R(UrlSentForRanking urlSentForRanking,UrlResult urlResult){

        urlResult.setLink(urlSentForRanking.getLink());
        urlResult.setSnippet(urlSentForRanking.getSnippet());
        urlResult.setTitle(urlSentForRanking.getTitle());
        return urlResult;

    }
}

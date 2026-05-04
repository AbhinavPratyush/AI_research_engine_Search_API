package Ai_Research_Engine.Orchestration_Api.Services;

import Ai_Research_Engine.Orchestration_Api.DTO.QueryDTO;
import Ai_Research_Engine.Orchestration_Api.Repo.QuerrySentFromUser;
import Ai_Research_Engine.Orchestration_Api.Repo.QuerrySentFromUser_impl;
import Ai_Research_Engine.Orchestration_Api.Repo.UrlSentForRanking;
import Ai_Research_Engine.Orchestration_Api.DuckDuckGo.QuerrySent;
import Ai_Research_Engine.Orchestration_Api.Repo.UrlSentForRanking_impl;
import Ai_Research_Engine.Orchestration_Api.Services.DuckDuckGoApiSpecificServices.ApiCallPrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkOnThisQuery {

    @Autowired
    Mapper mapper;

    @Autowired
    ApiCallPrep apiCallPrep;

    @Autowired
    UrlSentForRanking_impl urlSentForRankingImpl;



    @Autowired
    QuerrySentFromUser_impl querrySentFromUserImpl;

    public List<UrlSentForRanking> readyTheData(QueryDTO queryDTO){
        QuerrySent querrySent=new QuerrySent();
        querrySent=mapper.mapL2R(queryDTO,querrySent);

        List<UrlSentForRanking> SafeToCallDb= apiCallPrep.preparation(querrySent);
        urlSentForRankingImpl.saveAll(SafeToCallDb);

        QuerrySentFromUser querrySentFromUser=new QuerrySentFromUser();
        for(UrlSentForRanking u:SafeToCallDb){
            if(querrySentFromUser.getUrlAssociated()==null){
                querrySentFromUser.setUrlAssociated(new ArrayList<>());
            }
  querrySentFromUser.getUrlAssociated().add(u.getLink());
        }
        querrySentFromUserImpl.save(querrySentFromUser);

        return SafeToCallDb;
    }
}

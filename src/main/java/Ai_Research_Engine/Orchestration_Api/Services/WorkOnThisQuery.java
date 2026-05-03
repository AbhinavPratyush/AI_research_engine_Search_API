package Ai_Research_Engine.Orchestration_Api.Services;

import Ai_Research_Engine.Orchestration_Api.DTO.QueryDTO;
import Ai_Research_Engine.Orchestration_Api.Repo.UrlSentForRanking;
import Ai_Research_Engine.Orchestration_Api.SerperApi.QuerrySent;
import Ai_Research_Engine.Orchestration_Api.Services.ApiSpecificServices.ApiCallPrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkOnThisQuery {

    @Autowired
    Mapper mapper;

    @Autowired
    ApiCallPrep apiCallPrep;

    public UrlSentForRanking readyTheData(QueryDTO queryDTO){
        QuerrySent querrySent=new QuerrySent();
        querrySent=mapper.mapL2R(queryDTO,querrySent);
        apiCallPrep.preparation(querrySent);
        return new UrlSentForRanking();
    }
}

package Ai_Research_Engine.Orchestration_Api.Services.ApiSpecificServices;

import Ai_Research_Engine.Orchestration_Api.DTO.QueryDTO;
import Ai_Research_Engine.Orchestration_Api.Repo.QuerrySentFromUser;
import Ai_Research_Engine.Orchestration_Api.Repo.UrlSentForRanking;
import Ai_Research_Engine.Orchestration_Api.SerperApi.QuerrySent;
import Ai_Research_Engine.Orchestration_Api.SerperApi.UrlResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiCallPrep {
    @Autowired
    FillUpTheQuerry fillUpTheQuerry;
    @Autowired
    SendingService sendingService;

    public ArrayList<UrlSentForRanking> preparation(QuerrySent querrySent){// this has to return db ready object so that it can be saved in db in next step
        querrySent=fillUpTheQuerry.fillQuerry(querrySent);
        ArrayList<UrlSentForRanking> urlResults=sendingService.sendToGetRankedUrl(querrySent);



        return urlResults;
    }
}

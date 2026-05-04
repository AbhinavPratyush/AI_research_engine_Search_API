package Ai_Research_Engine.Orchestration_Api.Services.DuckDuckGoApiSpecificServices;

import Ai_Research_Engine.Orchestration_Api.Repo.UrlSentForRanking;
import Ai_Research_Engine.Orchestration_Api.DuckDuckGo.QuerrySent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

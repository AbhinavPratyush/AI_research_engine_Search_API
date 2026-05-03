package Ai_Research_Engine.Orchestration_Api.Services.ApiSpecificServices;

import Ai_Research_Engine.Orchestration_Api.Repo.UrlSentForRanking;
import Ai_Research_Engine.Orchestration_Api.SerperApi.QuerrySent;
import Ai_Research_Engine.Orchestration_Api.SerperApi.UrlResult;
import Ai_Research_Engine.Orchestration_Api.Services.Mapper;
import Ai_Research_Engine.Orchestration_Api.Services.RankingAlgo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SendingService {
    
    @Autowired
    ApiCalling apiCalling;
    
    @Autowired
    RankingAlgo rankingAlgo;
    
    @Autowired
    Mapper mapper;
    
    public ArrayList<UrlSentForRanking> sendToGetRankedUrl(QuerrySent querrySent) {
        ///  in this line we will call api calling,
        List<UrlResult> urlResults=apiCalling.serpApi(querrySent);
        

        ArrayList<UrlSentForRanking> urlSentForRankingList = new ArrayList<UrlSentForRanking>();
        for( UrlResult u:urlResults){
            UrlSentForRanking urlSentForRanking=new UrlSentForRanking();
            urlSentForRanking=mapper.mapL2R(u,urlSentForRanking);
            urlSentForRankingList.add(urlSentForRanking);
            System.out.println(u.toString());
        }

        /// in this line we will call the ranking service
//        rankingAlgo.rank(urlSentForRankingList,querrySent);
        
        
        return urlSentForRankingList;
    }
}

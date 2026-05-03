package Ai_Research_Engine.Orchestration_Api.Control;

import Ai_Research_Engine.Orchestration_Api.DTO.QueryDTO;
import Ai_Research_Engine.Orchestration_Api.Repo.UrlSentForRanking;
import Ai_Research_Engine.Orchestration_Api.Repo.QuerrySentFromUser;
import Ai_Research_Engine.Orchestration_Api.Services.WorkOnThisQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIcontroller {

    @Autowired
    WorkOnThisQuery workOnThisQuery;

    @PostMapping("/search")
    public UrlSentForRanking serach(@RequestBody QueryDTO queryDTO){
        //i need to refactor names
        UrlSentForRanking urlSentForRanking= workOnThisQuery.readyTheData(queryDTO);
        return urlSentForRanking;//this is random and unrelated
    }
}

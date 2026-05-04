package Ai_Research_Engine.Orchestration_Api.Control;

import Ai_Research_Engine.Orchestration_Api.DTO.QueryDTO;
import Ai_Research_Engine.Orchestration_Api.Repo.JSResponse;
import Ai_Research_Engine.Orchestration_Api.Repo.UrlSentForRanking;
import Ai_Research_Engine.Orchestration_Api.Repo.QuerrySentFromUser;
import Ai_Research_Engine.Orchestration_Api.Services.WorkOnThisQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class APIcontroller {

    @Autowired
    WorkOnThisQuery workOnThisQuery;

    @PostMapping("/search")
    public JSResponse serach(@RequestBody QueryDTO queryDTO){
        //i need to refactor names
       JSResponse jsResponse= new JSResponse(workOnThisQuery.readyTheData(queryDTO));
        return jsResponse;//this is random and unrelated
    }
}

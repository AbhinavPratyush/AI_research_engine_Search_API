package Ai_Research_Engine.Orchestration_Api.Services.DuckDuckGoApiSpecificServices;

import Ai_Research_Engine.Orchestration_Api.DuckDuckGo.QuerrySent;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FillUpTheQuerry {
    @Value("${serp.api.key}")
    private String Api_key;
    public QuerrySent fillQuerry(@NotNull QuerrySent querrySent){

        //here we will be using what we know about the querry that needs to be sent
        querrySent.setApiKey(Api_key);
        querrySent.setEngine("duckduckgo");
        querrySent.setKl("in-en");
        querrySent.setStart(0);


        return querrySent;
    }
}

package Ai_Research_Engine.Orchestration_Api.Services.ApiSpecificServices;

import Ai_Research_Engine.Orchestration_Api.SerperApi.QuerrySent;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FillUpTheQuerry {
    @Value("${spring.api.key}")
    private String Api_key;
    public QuerrySent fillQuerry(@NotNull QuerrySent querrySent){

        //here we will be using what we know about the querry that needs to be sent
        querrySent.setApiKey(Api_key);
        querrySent.setEngine("google_light");
        querrySent.setLocation_requested("India");
        querrySent.setLocation_used("India");
        querrySent.setGl("in");
        querrySent.setHl("en");


        return querrySent;
    }
}

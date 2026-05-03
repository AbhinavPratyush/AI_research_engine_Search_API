package Ai_Research_Engine.Orchestration_Api.Services.ApiSpecificServices;

import Ai_Research_Engine.Orchestration_Api.Repo.ServerResponse;
import Ai_Research_Engine.Orchestration_Api.SerperApi.QuerrySent;
import Ai_Research_Engine.Orchestration_Api.SerperApi.UrlResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Collections;
import java.util.List;

@Service
public class ApiCalling {

    @Value("${base.url}")
    private String Base_Url;


@Autowired
    RestClient restClient;

    public List<UrlResult> serpApi(QuerrySent querrySent){
//       private final ElasticsearchProperties.Restclient restclient= Rest

        URI uri = UriComponentsBuilder.fromUriString(Base_Url)
                .queryParam("engine", querrySent.getEngine())
                .queryParam("q", querrySent.getQ())
                .queryParam("api_key", querrySent.getApiKey())
                .queryParam("num", querrySent.getNum())
                .queryParam("start", querrySent.getStart())
                .build()
                .toUri();



        ServerResponse response = restClient.get().uri(
                uri
        ).retrieve().body(ServerResponse.class);
        assert response != null;
        return response.getOrganic_results();


    }
}

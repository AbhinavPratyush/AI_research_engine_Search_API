package Ai_Research_Engine.Orchestration_Api.Services.DuckDuckGoApiSpecificServices;

import Ai_Research_Engine.Orchestration_Api.Repo.ServerResponse;
import Ai_Research_Engine.Orchestration_Api.DuckDuckGo.QuerrySent;
import Ai_Research_Engine.Orchestration_Api.DuckDuckGo.UrlResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Service
public class ApiCalling {

    @Value("${base.url}")
    private String Base_Url;


@Autowired
    RestClient restClient;

    public List<UrlResult> duckDuckGoApi(QuerrySent querrySent){
//       private final ElasticsearchProperties.Restclient restclient= Rest

        URI uri = UriComponentsBuilder.fromUriString(Base_Url)
                .queryParam("engine", querrySent.getEngine())
                .queryParam("q", querrySent.getQ())
                .queryParam("api_key", querrySent.getApiKey())
                .queryParam("num", querrySent.getM())
                .queryParam("kl",querrySent.getKl())
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

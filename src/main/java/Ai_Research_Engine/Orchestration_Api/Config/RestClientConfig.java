package Ai_Research_Engine.Orchestration_Api.Config;

import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {


        @Bean
    public RestClient restClient(){
            return RestClient.create();
        }
}

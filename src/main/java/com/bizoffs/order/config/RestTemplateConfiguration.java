package com.bizoffs.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {
    @Bean("CustomRestTemplate")
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}

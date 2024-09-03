package com.example.indianCalender.configration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class resttemplateconfgration {
    @Bean
    public RestTemplate getRestTemplate(RestTemplateBuilder rtb){
        return rtb.build();
    }
}

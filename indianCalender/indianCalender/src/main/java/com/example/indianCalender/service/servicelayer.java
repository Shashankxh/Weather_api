package com.example.indianCalender.service;

import com.example.indianCalender.responce.totalresponce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class servicelayer {
    @Autowired
    RestTemplate rt;
    String baseurl ="http://api.weatherapi.com/v1/astronomy.json";
    public Object getrt(String key, String Country, String Date){
String url= con(key,Country,Date);
        return rt.getForObject(url,Object.class);
    }

    private String con(String key, String country, String date) {
        String url = baseurl+"?key="+key+"&q="+country+"&dt="+date;
        return url;
    }
}

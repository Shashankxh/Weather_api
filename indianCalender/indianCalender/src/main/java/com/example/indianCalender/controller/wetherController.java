package com.example.indianCalender.controller;

import com.example.indianCalender.responce.totalresponce;
import com.example.indianCalender.service.servicelayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/wether")
public class wetherController {
    @Autowired
    servicelayer ser;
    @GetMapping
    public Object getWether(@RequestParam("key") String key, @RequestParam("country") String country, @RequestParam("date") String date){
return ser.getrt(key,country,date);
    }

}

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
@Service
public class SchoolServiceClient {

    @Autowired
    private RestTemplate restTemplate;

    public Map<String, Object> getSchoolById(Long id) {
        String url = "http://localhost:8081/schools/" + id;
        return restTemplate.getForObject(url, Map.class);
    }
}

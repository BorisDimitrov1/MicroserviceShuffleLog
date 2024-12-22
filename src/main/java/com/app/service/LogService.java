package com.app.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class LogService {

    @Value("${log.service.url}")
    private String logServiceUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    @Async
    public void sendLog(int number, int[] shuffledArray) {
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("number", number);
        requestBody.put("shuffledArray", shuffledArray);

        // Do a POST request /log with information about the input and the array itself as body
        restTemplate.postForObject(logServiceUrl + "/log", requestBody, Void.class);
    }
}
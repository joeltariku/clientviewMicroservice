package com.example.clientviewMicroservice;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ReviewPopupService {
    public FeedbackData getFeedbackData(long id) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            String url = "http://localhost:8084/getFeedback/%s".formatted(id);
            return restTemplate.getForObject(url, FeedbackData.class);
        } catch (Exception e) {
            String url = "http://localhost:8081/id?id=%s".formatted(id);
            return restTemplate.getForObject(url, FeedbackData.class);
        }
    }
}

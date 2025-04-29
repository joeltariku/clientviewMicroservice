package com.example.clientviewMicroservice;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProviderService {
    public FeedbackData getAdditionalInfo(long uid, String productName) {
        RestTemplate restTemplate = new RestTemplate();

        String getUserUrl = "http://localhost:8081/users/id?id=%s".formatted(uid);
        UserData userData = restTemplate.getForObject(getUserUrl, UserData.class);

        try {
            for (FeedbackData feedbackData : userData.getFeedbackData()) {
                if (feedbackData.getProductName().equals(productName)) {
                    feedbackData.getAuthor().setName(userData.getName());
                    feedbackData.getAuthor().setEmail(userData.getEmail());
                    return feedbackData;
                }
            }
        } catch (Exception e) {
            System.out.println("Either user id doesn't exist, or product name doesn't exist for specified user.");
        }
        return null;
    }
}

package com.example.clientviewMicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MicroserviceController {
    @Autowired ProviderService ps;
    @Autowired ReviewPopupService rps;

    @GetMapping("/additionalInfo/{uid}/{product}")
    public String getAdditionalInfo(Model model, @PathVariable long uid, @PathVariable String product) {
        model.addAttribute("feedbackData", ps.getAdditionalInfo(uid, product));
        model.addAttribute("additionalInfo", new AdditionalInfo());
        //providerService.getAdditionalInfo(uid, product);
        return "info";
    }

    @GetMapping("/getFeedbackData/{id}")
    public FeedbackData getFeedbackData(@PathVariable long id) {
        return rps.getFeedbackData(id);
    }

    @PostMapping("/additionalInfo/added")
    public FeedbackData addAdditionalInfo(Model model,  Long uid,  String product, String content) {
        return new FeedbackData();
    }
}

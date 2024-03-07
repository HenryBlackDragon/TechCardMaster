package com.chaban.techcardmaster.service.impl;

import com.chaban.techcardmaster.service.GptService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;

@Service
@RequiredArgsConstructor
public class GptServiceImpl implements GptService {

    @Value("${app.openai.api.url}")
    private String openaiApiUrl;

    private final RestTemplate restGptTemplate;

//    private final AsyncRestTemplate asyncRestTemplate;

    @Override
    public String generateResponse(String prompt) {
//        var requestJson = "{\"prompt\": \"" + prompt + "\", \"max_tokens\": 50}";
////        HttpHeaders.of()
//        headers.set("Authorization", "Bearer " + OPENAI_API_KEY);
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<String> entity = new HttpEntity<>(requestJson, headers);
//        ResponseEntity<String> response = restGptTemplate.exchange(OPENAI_API_URL, HttpMethod.POST, entity, String.class);
//        return response.getBody();

        return "";
    }
}

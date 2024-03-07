package com.chaban.techcardmaster.controller;

import com.chaban.techcardmaster.service.GptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequiredArgsConstructor
public class GptController {

    private final GptService gptService;

    @PostMapping("/generate")
    public CompletableFuture<String> generateResponse(@RequestBody String input) {
//        return gptService.generateResponseAsync(input);
        return null;
    }
}

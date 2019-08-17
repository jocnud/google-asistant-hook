package com.assistant.expenseManager.controllers;

import com.assistant.expenseManager.models.FulfillmentRequest;
import com.assistant.expenseManager.models.FulfillmentResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AssistantController {

    @GetMapping(path = "/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("UP");

    }

    @GetMapping(path = "/")
    public ResponseEntity<String> defaultHealth() {
        return ResponseEntity.ok("UP");

    }

    @PostMapping(path = "/expense", produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<FulfillmentResponse> assistantRequest(@RequestBody FulfillmentRequest fulfillmentRequest) {

        String name = fulfillmentRequest.getQueryResult().getIntent().getName();


        FulfillmentResponse response = FulfillmentResponse.builder()
                .fulfillmentText(" Hello your intent is " + name)
                .build();

        return ResponseEntity.ok(response);
    }
}

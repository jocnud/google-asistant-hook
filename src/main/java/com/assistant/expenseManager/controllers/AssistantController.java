package com.assistant.expenseManager.controllers;

import com.google.actions.api.App;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;


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
    public ResponseEntity<String> assistantRequest(@RequestBody String body)
            throws ExecutionException, InterruptedException {
        App actionApp = new ExpenseApp();
        String resp = actionApp.handleRequest(body, null).get();
        return ResponseEntity.ok(resp);
    }
}

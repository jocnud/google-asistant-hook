package com.assistant.expenseManager.controllers;

import com.assistant.expenseManager.models.FF;
import com.assistant.expenseManager.models.FulfillmentRequest;
import com.assistant.expenseManager.models.FulfillmentResponse;
import com.assistant.expenseManager.models.GooglePayload;
import com.assistant.expenseManager.models.Holder;
import com.assistant.expenseManager.models.Payload;
import com.assistant.expenseManager.models.RichResponse;
import com.assistant.expenseManager.models.SimpleResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


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

        String name = fulfillmentRequest.getQueryResult().getIntent().getDisplayName();
        FF ff = new FF(fulfillmentRequest);
        FulfillmentResponse ffR = ff.getResponse();


        RichResponse richResponse = new RichResponse();

        Holder holder = new Holder();
        holder.setSimpleResponse(
                SimpleResponse.builder().displayText("Works").textToSpeech("Nirvik it works it worked").build());


        richResponse.setItems(Arrays.asList(holder));

        GooglePayload googlePayload = new GooglePayload();
        googlePayload.setRichResponse(richResponse);


        ffR.setPayload(Payload.builder().google(googlePayload).build());
        ffR.setFulfillmentText(" sendinf");

        return ResponseEntity.ok(ffR);
    }
}

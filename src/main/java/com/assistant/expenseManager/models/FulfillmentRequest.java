package com.assistant.expenseManager.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FulfillmentRequest {

//    private UUID responseId;
    private String session;
    private QueryResult queryResult;
    private OriginalDetectIntentRequest originalDetectIntentRequest;
}

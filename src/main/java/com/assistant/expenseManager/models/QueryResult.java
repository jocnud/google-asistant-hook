package com.assistant.expenseManager.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryResult {
    private String queryText;
    private Map<String, Object> parameters;
    private boolean allRequiredParamsPresent;
    private String fulfillmentText;
    private List<FulfillmentMessage> fulfillmentMessages;
    private List<OutputContext> outputContexts;
    private Intent intent;
    private float intentDetectionConfidence;
    private String languageCode;
    private Object diagnosticInfo;
}

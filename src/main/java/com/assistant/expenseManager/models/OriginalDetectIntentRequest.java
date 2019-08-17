package com.assistant.expenseManager.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OriginalDetectIntentRequest {
    private String source;
    private String version;
    private Object payload;
}

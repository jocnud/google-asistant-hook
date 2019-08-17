package com.assistant.expenseManager.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class SlackPayload {
    private String text;
}

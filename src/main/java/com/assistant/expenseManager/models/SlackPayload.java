package com.assistant.expenseManager.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@Data
public class SlackPayload {
    private String text;
}

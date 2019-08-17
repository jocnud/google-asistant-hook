package com.assistant.expenseManager.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Payload {
    private GooglePayload google;
    private FacebookPayload facebook;
    private SlackPayload slack;
}

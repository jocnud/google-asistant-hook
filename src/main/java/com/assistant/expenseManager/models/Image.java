package com.assistant.expenseManager.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Image {
    private String imageUri;
    private String accessibilityText;
}

package com.assistant.expenseManager.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class BasicCard {
    private String title;
    private String subtitle;
    private String formattedText;
    private Image image;
    private List<Button> buttons;
}

package com.assistant.expenseManager.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * The card response message.
 */
@Setter
@Getter
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    private String title;
    private String subtitle;

    /**
     * Optional. The public URI to an image file for the card.
     */
    private String imageUri;

    private List<Button> buttons;
}

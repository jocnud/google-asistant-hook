package com.assistant.expenseManager.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Rich message to show the user. Corresponds to the Response field in the Dialogflow console.
 */
@Setter
@Getter
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FulfillmentMessage {

    /**
     * Only one of the following
     */
    private TextMessage text;
    private Image image;
    private QuickReplies quickReplies;
    private Card card;
    private SimpleResponses simpleResponses;
    private BasicCard basicCard;
    private Suggestions suggestions;
    private LinkOutSuggestion linkOutSuggestion;
    private ListSelect listSelect;
    private CarouselSelect carouselSelect;
}

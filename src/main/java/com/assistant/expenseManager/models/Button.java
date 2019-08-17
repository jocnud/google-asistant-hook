package com.assistant.expenseManager.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Button {

    /**
     * Optional. The text to show on the button.
     */
    private String text;

    /**
     * Optional. The text to send back to the Dialogflow API or a URI to open.
     */
    private String postback;
}

package com.assistant.expenseManager.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The suggestion CHIP message that the user can tap to quickly post a reply to the conversation.
 */
@Setter
@Getter
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Suggestion {
    /**
     * The text shown the in the suggestion chip.
     */
    private String title;
}

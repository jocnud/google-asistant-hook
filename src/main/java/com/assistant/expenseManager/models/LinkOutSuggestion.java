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
public class LinkOutSuggestion {
    /**
     * Required. The name of the app or site this chip is linking to.
     */
    private String destinationName;

    /**
     * Required. The URI of the app or site to open when the user taps the suggestion chip.
     */
    private String uri;
}

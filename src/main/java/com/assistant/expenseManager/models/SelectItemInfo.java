package com.assistant.expenseManager.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * Additional info about the select item for when it is triggered in a dialog.
 */
public class SelectItemInfo {
    /**
     * Required. A unique key that will be sent back to the agent if this response is given.
     */
    private String key;

    /**
     * A list of synonyms that can also be used to trigger this item in dialog.
     */
    private List<String> synonyms;
}

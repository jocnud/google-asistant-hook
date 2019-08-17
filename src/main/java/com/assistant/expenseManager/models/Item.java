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
public class Item {
    /**
     * Required. Additional information about this option.
     */
    private SelectItemInfo info;

    /**
     * Required. The title of the list item.
     */
    private String title;

    /**
     * Optional. The main text describing the item.
     */
    private String description;

    /**
     * The image to display
     */
    private Image image;

}

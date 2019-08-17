package com.assistant.expenseManager.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * The card for presenting a carousel of options to select from.
 */
@Setter
@Getter
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarouselSelect {
    private List<Item> items;
}

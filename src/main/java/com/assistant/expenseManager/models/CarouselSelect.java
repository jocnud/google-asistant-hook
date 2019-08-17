package com.assistant.expenseManager.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * The card for presenting a carousel of options to select from.
 */
@Setter
@Getter
@Builder
public class CarouselSelect {
    private List<Item> items;
}

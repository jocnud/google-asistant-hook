package com.assistant.expenseManager.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class ListSelect {
    private String title;
    private List<Item> items;
}

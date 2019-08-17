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
public class ListSelect {
    private String title;
    private List<Item> items;
}

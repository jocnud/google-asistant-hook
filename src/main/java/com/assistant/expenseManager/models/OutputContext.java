package com.assistant.expenseManager.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Setter
@Getter
@ToString
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OutputContext {
    private String name;
    private int lifespanCount;
    private Map<String, String> parameters;
}

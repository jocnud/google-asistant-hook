package com.assistant.expenseManager.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by omar on 19/05/17.
 */
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FieldErrorResource {
    private String resource;
    private String field;
    private String code;
    private String message;

    @Override
    public String toString() {
        return "FieldErrorResource{" +
                "resource='" + resource + '\'' +
                ", field='" + field + '\'' +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

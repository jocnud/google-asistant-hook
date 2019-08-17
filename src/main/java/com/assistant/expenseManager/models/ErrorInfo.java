package com.assistant.expenseManager.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by omar on 19/05/17.
 */
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorInfo {
    private String path;
    private String code;
    private String message;
    private List<FieldErrorResource> fieldErrors;

    @Override
    public String toString() {
        return "ErrorInfo{" +
                "path='" + path + '\'' +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", fieldErrors=" + fieldErrors +
                '}';
    }
}

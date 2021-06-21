package com.hary.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

/**
 * @author 70982
 */
@Data
@AllArgsConstructor
public class JsonResult {

    private String message;
    private int code;
    private Map<String, Object> data;

    public void data(String key, Object value) {
        this.data.put(key, value);
    }
}

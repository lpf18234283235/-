package com.test.util;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class StringToMap {
	public static Map<String, Object> map(String str_json) {
        Map<String, Object> map = null;
        try {
            Gson gson = new Gson();
            map = gson.fromJson(str_json, new TypeToken<Map<String, Object>>() {
            }.getType());
        } catch (JsonSyntaxException e) {
        	e.printStackTrace();
        }
        return map;
    }
	
	public static Map<String, String> maps(String str_json) {
        Map<String, String> map = null;
        try {
            Gson gson = new Gson();
            map = gson.fromJson(str_json, new TypeToken<Map<String, String>>() {
            }.getType());
        } catch (JsonSyntaxException e) {
        	e.printStackTrace();
        }
        return map;
    }
}


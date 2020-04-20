package com.test.util.Gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.sf.json.JSONObject;

public class Gsons {
	public static Gson buildGson() {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapterFactory(ResponseDataTypeAdaptor.FACTORY);
		return gsonBuilder.create();
	}
	public static JSONObject data(JSONObject json1) {
		JSONObject json = new JSONObject();
		Gson gson = Gsons.buildGson();
		ResponseData data = gson.fromJson(json1.toString(), ResponseData.class);
//		if (data.getStatus() == 0) {
////			json.put("return_code", 0);
////			json.put("return_msg", data.getMsg());
////			json.put("list", data.getData());
////		} else if (data.getStatus() == 2) {
////			json.put("return_code", 2);
////			json.put("return_msg", data.getMsg());
////		} else if (data.getStatus() == 3) {
////			json.put("return_code", 3);
////			json.put("return_msg", data.getMsg());
////
////		} else if (data.getStatus() == 4) {
////			json.put("return_code", 4);
////			json.put("return_msg", data.getMsg());
////		} else {
////			json.put("return_code", 1);
////			json.put("return_msg", data.getMsg());
////		}if (data.getStatus() == 0) {
////			json.put("return_code", 0);
////			json.put("return_msg", data.getMsg());
////		} else {
////			json.put("return_code", 1);
////			json.put("return_msg", data.getMsg());
////			json.put("list", data.getData());
////		}
		if (data.getStatus() == 0) {
			json.put("return_code", 0);
			json.put("return_msg", data.getMsg());
			json.put("list", data.getData());
		} else if (data.getStatus() == 2) {
			json.put("return_code", 2);
			json.put("return_msg", data.getMsg());
		} else if (data.getStatus() == 3) {
			json.put("return_code", 3);
			json.put("return_msg", data.getMsg());
		} else if (data.getStatus() == 4) {
			json.put("return_code", 4);
			json.put("return_msg", data.getMsg());
		} else {
			json.put("return_code", 1);
			json.put("return_msg", data.getMsg());
		}
		return json;
	}
}

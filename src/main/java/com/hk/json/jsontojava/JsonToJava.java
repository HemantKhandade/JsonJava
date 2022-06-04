package com.hk.json.jsontojava;

import java.util.Map;

import org.json.JSONObject;

public class JsonToJava {

	public static void main(String[] args) {
		JsonToJava jtoj = new JsonToJava();
		jtoj.processJson("json");

	}
	
	public void processJson(Object requestJson) {
		System.out.println("Input String : " + requestJson.toString());
		//JSONObject product = new JSONObject(getJson());
		JSONObject product = new JSONObject(requestJson.toString());
		String id = product.get("id").toString();
		String name = product.get("name").toString();
		System.out.println(id + " : " + name);
		Map<String, Object> brand = product.getJSONObject("brand").toMap();
		System.out.println("Brand :: " + brand);
		JSONObject brandJsonObj = new JSONObject(brand);
		System.out.println("BranJsonObj :: " + brandJsonObj);
		Map<String, Object> owner = brandJsonObj.getJSONObject("owner").toMap();
		JSONObject ownerJsonObj = new JSONObject(owner);
		System.out.println("OwnerJsonObj :: " + ownerJsonObj);
	}
	private String getJson()
	{
		return "{\r\n"
				+ "    \"id\": \"957c43f2-fa2e-42f9-bf75-6e3d5bb6960a\",\r\n"
				+ "    \"name\": \"The Best Product\",\r\n"
				+ "    \"brand\": {\r\n"
				+ "        \"id\": \"9bcd817d-0141-42e6-8f04-e5aaab0980b6\",\r\n"
				+ "        \"name\": \"ACME Products\",\r\n"
				+ "        \"owner\": {\r\n"
				+ "            \"id\": \"b21a80b1-0c09-4be3-9ebd-ea3653511c13\",\r\n"
				+ "            \"name\": \"Ultimate Corp, Inc.\"\r\n"
				+ "        }\r\n"
				+ "    }  \r\n"
				+ "}";
	}
	
	
	
}

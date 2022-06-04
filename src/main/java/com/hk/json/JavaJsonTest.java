package com.hk.json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class JavaJsonTest {

	public static void main(String[] args) 
	{
		JavaJsonTest jsonTest = new JavaJsonTest();
		jsonTest.javaToJson();
		//jsonTest.jsonToJava();
	}
	
	public void javaToJson() 
	{
		JSONObject jo = new JSONObject();
		jo.put("name", "jon doe");
		jo.put("age", "22");
		jo.put("company", "TechMahindra");
		
		
		HashMap<String, String> house = new HashMap<String, String>();
		house.put("flat", "B-101");
		house.put("society", "Nisarg City-2");
		house.put("village", "Kaspate Wasti, Wakad");
		house.put("district","Pune");
		jo.accumulate("address", house);
		
		System.out.println("Json :: " + jo);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "jon doe");
		map.put("age", "22");
		map.put("city", "chicago");
		jo = new JSONObject(map);
		
		System.out.println("Json :: " + jo);
	}
	public void jsonToJava() {
		String inputString = "{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}";
		JSONObject jo = new JSONObject(inputString);	
		String value = jo.get("city").toString();
		System.out.println("City :: " + value);
	}

}

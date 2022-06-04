package com.hk.json;

import org.json.JSONObject;

public class LinkedHashMap_Read {

	public static void main(String[] args) {
		LoadData data = new LoadData();
		Employee employee = data.loadEmployeeData();
		JSONObject json = new JSONObject(employee);
		System.out.printf("Ordered Json : %s", json.toString());
	}

}

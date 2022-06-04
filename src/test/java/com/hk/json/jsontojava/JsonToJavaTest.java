package com.hk.json.jsontojava;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class JsonToJavaTest {

	@Test
	void processJsonTest() {
		JsonToJava jtj = new JsonToJava();
		jtj.processJson(requestJson());
	}
	private String requestJson()
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

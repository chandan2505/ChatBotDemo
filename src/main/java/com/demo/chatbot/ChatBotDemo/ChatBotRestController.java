package com.demo.chatbot.ChatBotDemo;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import ai.api.model.Fulfillment;

@RestController
public class ChatBotRestController {

	@RequestMapping(value = "/bot/calculatePrem", method = RequestMethod.POST)
	public Fulfillment calculatePremium(@RequestBody String request) {

		System.out.println("Request:::" + request);
		Fulfillment fulfillment = new Fulfillment();
		fulfillment.setDisplayText("welcome from java");

		Gson gson = new Gson();
		Map<String, Object> map = gson.fromJson(request, new TypeToken<Map<String, Object>>() {
		}.getType());
		@SuppressWarnings("unchecked")
		String prprtyVal = (String) ((Map<String, Object>) ((Map<String, Object>) map.get("result")).get("parameters"))
				.get("propertyValue");
		System.out.println(prprtyVal);
		if (prprtyVal.equalsIgnoreCase("5000000")) {
			fulfillment.setSpeech("Your Loan is 2000 AUD");
		} else if (prprtyVal.equalsIgnoreCase("7000000")) {
			fulfillment.setSpeech("Your Loan is 3000 AUD");
		} else if (prprtyVal.equalsIgnoreCase("9000000")) {
			fulfillment.setSpeech("Your Loan is 4000 AUD");
		}
		System.out.println("Response::::" + fulfillment.toString());
		return fulfillment;
	}
}

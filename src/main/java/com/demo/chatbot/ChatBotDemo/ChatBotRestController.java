package com.demo.chatbot.ChatBotDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ai.api.model.AIOriginalRequest;
import ai.api.model.Fulfillment;

@RestController
public class ChatBotRestController {

	@RequestMapping(value = "/bot/calculatePrem", method = RequestMethod.POST)
	public Fulfillment calculatePremium(AIOriginalRequest request) {

		System.out.println("Request::::" + request.toString());
		Fulfillment fulfillment = new Fulfillment();

		fulfillment.setDisplayText("welcome from java");
		fulfillment.setSpeech("Your Loan is 2000 AUD");
		System.out.println("Response::::" + fulfillment.toString());
		return fulfillment;
	}
}

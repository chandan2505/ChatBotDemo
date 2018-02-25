package com.demo.chatbot.ChatBotDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ai.api.model.AIRequest;
import ai.api.model.Fulfillment;

@RestController
public class ChatBotRestController {

	@RequestMapping(value = "/bot/calculatePrem", method = RequestMethod.POST)
	public Fulfillment calculatePremium(AIRequest request) {
		 System.out.println("In Test one Method");
		 System.out.println( "request::::"+request+"::::String"+request.toString());
				 System.out.println( "getEntities::::"+request.getEntities().size());
		    Fulfillment fulfillment = new Fulfillment();
		    
		    fulfillment.setDisplayText("welcome from java");
		    fulfillment.setSpeech("Your Loan is 2000 AUD");

		    return fulfillment;
	}
}

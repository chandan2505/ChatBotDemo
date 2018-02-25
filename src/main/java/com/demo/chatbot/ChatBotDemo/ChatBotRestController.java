package com.demo.chatbot.ChatBotDemo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatBotRestController {

	@RequestMapping(value = "/bot/calculatePrem", method = RequestMethod.POST)
	public String calculatePremium(@RequestBody String loan) {
		if (loan.equalsIgnoreCase("500000")) {
			return "Your Loan is 3000 AUD";
		}

		return "Your Loan is 2000 AUD";
	}
}

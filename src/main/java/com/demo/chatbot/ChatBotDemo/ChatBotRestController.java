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
		if (prprtyVal.equalsIgnoreCase("100000")) {
			fulfillment.setSpeech("Your estimated premium payable LMI(including GST) is $1,200.00 excluding stamp duty.");
		} else if (prprtyVal.equalsIgnoreCase("200000")) {
			fulfillment.setSpeech("Your estimated premium payable LMI(including GST) is $1,200.00 excluding stamp duty.");
		} else if (prprtyVal.equalsIgnoreCase("300000")) {
			fulfillment.setSpeech("Your estimated premium payable LMI(including GST) is $1,725.00 excluding stamp duty.");
		}else if (prprtyVal.equalsIgnoreCase("400000")) {
			fulfillment.setSpeech("Your estimated premium payable LMI(including GST) is $1,200.00 excluding stamp duty.");
		}else if (prprtyVal.equalsIgnoreCase("500000")) {
			fulfillment.setSpeech("Your estimated premium payable LMI(including GST) is $1,915.00 excluding stamp duty.");
		}else if (prprtyVal.equalsIgnoreCase("600000")) {
			fulfillment.setSpeech("Your estimated premium payable LMI(including GST) is $1,915.00 excluding stamp duty.");
		}else if (prprtyVal.equalsIgnoreCase("700000")) {
			fulfillment.setSpeech("Your estimated premium payable LMI(including GST) is $1,915.00 excluding stamp duty.");
		}else if (prprtyVal.equalsIgnoreCase("800000")) {
			fulfillment.setSpeech("Your estimated premium payable LMI(including GST) is $3,845.00 excluding stamp duty.");
		}else if (prprtyVal.equalsIgnoreCase("900000")) {
			fulfillment.setSpeech("Your estimated premium payable LMI(including GST) is $3,845.00 excluding stamp duty.");
		}else if (prprtyVal.equalsIgnoreCase("1000000")) {
			fulfillment.setSpeech("Your estimated premium payable LMI(including GST) is $3,845.00 excluding stamp duty.");
		}
		System.out.println("Response::::" + fulfillment.toString());
		return fulfillment;
	}
}

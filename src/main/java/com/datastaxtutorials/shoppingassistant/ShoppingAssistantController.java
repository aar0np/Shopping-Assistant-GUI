package com.datastaxtutorials.shoppingassistant;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingAssistantController {

	private RestTemplate restTemplate;
	
	private static final String LANGFLOW_URL = System.getenv("LANGFLOW_URL");
	
	public ShoppingAssistantController() {
		restTemplate = new RestTemplateBuilder().build();
	}
	
	public ShoppingAssistantResponse askQuestion (ShoppingAssistantRequest req) {
		
		LangflowResponse resp = restTemplate.postForObject(
				LANGFLOW_URL,
				req,
				LangflowResponse.class);
		
		LangflowOutput1[] outputs = resp.getOutputs();
		String strMessage = outputs[0].getOutputs()[0].getResults().getMessage().getData().getText();
		
		return new ShoppingAssistantResponse(strMessage);
	}
}

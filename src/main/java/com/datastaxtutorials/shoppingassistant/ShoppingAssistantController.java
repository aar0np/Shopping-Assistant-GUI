package com.datastaxtutorials.shoppingassistant;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

@RestController
public class ShoppingAssistantController {

	private RestTemplate restTemplate;
	private HttpHeaders customHeader;
	
	private static final String LANGFLOW_URL = System.getenv("ASTRA_LANGFLOW_URL");
	private static final String BEARER_TOKEN = System.getenv("BEARER_TOKEN");
	
	public ShoppingAssistantController() {
		restTemplate = new RestTemplateBuilder().build();
		
		// headers
		// -H "Authorization: Bearer <YOUR_APPLICATION_TOKEN>"\
		customHeader = new HttpHeaders();
		customHeader.setContentType(MediaType.APPLICATION_JSON);
		customHeader.add("Authorization", "Bearer " + BEARER_TOKEN);
	}
	
	public ShoppingAssistantResponse askQuestion (ShoppingAssistantRequest req) {
		
		String reqJSON = new Gson().toJson(req);
		HttpEntity<String> requestEntity = new HttpEntity<>(reqJSON, customHeader);

		//System.out.println(requestEntity);
		
		ResponseEntity<LangflowResponse> resp = restTemplate.exchange(LANGFLOW_URL,
				HttpMethod.POST,
				requestEntity,
				LangflowResponse.class
				);
		
		LangflowResponse lfResp = resp.getBody();
		LangflowOutput1[] outputs = lfResp.getOutputs();
		String strMessage = outputs[0].getOutputs()[0].getResults().getMessage().getData().getText();
		
		return new ShoppingAssistantResponse(strMessage);
	}
}

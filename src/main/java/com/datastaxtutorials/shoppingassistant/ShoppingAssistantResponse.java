package com.datastaxtutorials.shoppingassistant;

public class ShoppingAssistantResponse {

	private String message;
	
	public ShoppingAssistantResponse() {
		
	}
	
	public ShoppingAssistantResponse(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}

package com.datastaxtutorials.shoppingassistant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShoppingAssistantRequest {
	@JsonProperty("input_value")
	private String inputValue;
	@JsonProperty("output_type")
	private String outputType;
	@JsonProperty("input_type")
	private String inputType;
	
	public ShoppingAssistantRequest(String message) {
		inputValue = message;
		outputType = "chat";
		inputType = "chat";
	}
	
	public String getOutputType() {
		return outputType;
	}

	public void setOutputType(String outputType) {
		this.outputType = outputType;
	}

	public String getInputType() {
		return inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	public String getInputValue() {
		return this.inputValue;
	}
	
	public void setInputValue(String inputValue) {
		this.inputValue = inputValue;
	}
}

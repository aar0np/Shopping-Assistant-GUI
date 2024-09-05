package com.datastaxtutorials.shoppingassistant;

import com.google.gson.annotations.SerializedName;

public class ShoppingAssistantRequest {
	@SerializedName("input_value")
	private String inputValue;
	@SerializedName("output_type")
	private String outputType;
	@SerializedName("input_type")
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

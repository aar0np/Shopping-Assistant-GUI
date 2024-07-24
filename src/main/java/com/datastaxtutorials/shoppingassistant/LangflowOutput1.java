package com.datastaxtutorials.shoppingassistant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LangflowOutput1 {

	private record Input(@JsonProperty("input_value") String inputValue) {}

	private Input inputs;
	private LangflowOutput2[] outputs;
	
	public Input getInputs() {
		return inputs;
	}
	public void setInputs(Input inputs) {
		this.inputs = inputs;
	}
	public LangflowOutput2[] getOutputs() {
		return outputs;
	}
	public void setOutputs(LangflowOutput2[] outputs) {
		this.outputs = outputs;
	}
}

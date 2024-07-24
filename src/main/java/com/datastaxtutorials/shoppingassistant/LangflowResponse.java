package com.datastaxtutorials.shoppingassistant;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LangflowResponse {
	
	@JsonProperty("session_id")
	private UUID sessionId;
	private LangflowOutput1[] outputs;
	
	public UUID getSessionId() {
		return sessionId;
	}
	
	public void setSessionId(UUID sessionId) {
		this.sessionId = sessionId;
	}
	
	public LangflowOutput1[] getOutputs() {
		return outputs;
	}
	
	public void setInput(LangflowOutput1[] outputs) {
		this.outputs = outputs;
	}
}

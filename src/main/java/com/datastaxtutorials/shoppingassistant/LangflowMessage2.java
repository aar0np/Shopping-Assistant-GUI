package com.datastaxtutorials.shoppingassistant;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LangflowMessage2 {

	private String message;
	private String sender;
	@JsonProperty("sender_name")
	private String senderName;
	private String[] files;
	@JsonProperty("session_id")
	private UUID sessionId;
	private String componentId;
	private String type;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String[] getFiles() {
		return files;
	}
	public void setFiles(String[] files) {
		this.files = files;
	}
	public UUID getSessionId() {
		return sessionId;
	}
	public void setSessionId(UUID sessionId) {
		this.sessionId = sessionId;
	}
}

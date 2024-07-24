package com.datastaxtutorials.shoppingassistant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LangflowArtifact {

	private String message;
	private String sender;
	@JsonProperty("sender_name")
	private String senderName;
	private String[] files;
	private String type;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}

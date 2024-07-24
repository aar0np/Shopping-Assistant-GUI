package com.datastaxtutorials.shoppingassistant;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LangflowData {

	private String text;
	private String sender;
	@JsonProperty("sender_name")
	private String senderName;
	@JsonProperty("session_id")
	private UUID sessionId;
	private String[] files;
	private String timestamp;
	@JsonProperty("flow_id")
	private UUID flowId;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
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
	public UUID getSessionId() {
		return sessionId;
	}
	public void setSessionId(UUID sessionId) {
		this.sessionId = sessionId;
	}
	public String[] getFiles() {
		return files;
	}
	public void setFiles(String[] files) {
		this.files = files;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public UUID getFlowId() {
		return flowId;
	}
	public void setFlowId(UUID flowId) {
		this.flowId = flowId;
	}
}

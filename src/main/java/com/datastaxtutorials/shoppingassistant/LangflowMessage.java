package com.datastaxtutorials.shoppingassistant;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LangflowMessage {

	@JsonProperty("text_key")
	private String textKey;
	private LangflowData data;
	@JsonProperty("default_value")
	private String defaultValue;
	private String sender;
	@JsonProperty("sender_name")
	private String senderName;
	private String[] files;
	@JsonProperty("session_id")
	private UUID sessionId;
	private String timestamp;
	@JsonProperty("flow_id")
	private UUID flowId;
	
	public String getTextKey() {
		return textKey;
	}
	public void setTextKey(String textKey) {
		this.textKey = textKey;
	}
	public LangflowData getData() {
		return data;
	}
	public void setData(LangflowData data) {
		this.data = data;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
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

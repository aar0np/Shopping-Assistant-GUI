package com.datastaxtutorials.shoppingassistant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LangflowOutput2 {

	private LangflowResults results;
	private LangflowArtifact artifacts;
	@JsonProperty("component_display_name")
	private String componentDisplayName;
	@JsonProperty("component_id")
	private String componentId;
	@JsonProperty("unused_frozen_result")
	private boolean unusedFrozenResult;
	
	public LangflowResults getResults() {
		return results;
	}
	public void setResults(LangflowResults results) {
		this.results = results;
	}
	public LangflowArtifact getArtifacts() {
		return artifacts;
	}
	public void setArtifacts(LangflowArtifact artifacts) {
		this.artifacts = artifacts;
	}
	public String getComponentDisplayName() {
		return componentDisplayName;
	}
	public void setComponentDisplayName(String componentDisplayName) {
		this.componentDisplayName = componentDisplayName;
	}
	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}
	public boolean isUnusedFrozenResult() {
		return unusedFrozenResult;
	}
	public void setUnusedFrozenResult(boolean unusedFrozenResult) {
		this.unusedFrozenResult = unusedFrozenResult;
	}
}

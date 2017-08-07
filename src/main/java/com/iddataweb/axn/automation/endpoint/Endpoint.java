package com.iddataweb.axn.automation.endpoint;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({"idpType","credential","mbun","maxToken","dateCreated","userAttributes","userAssertionList"})
public class Endpoint implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2190174938733120912L;
	private String credential;
	private String idpType;
	private String maxToken;
	private String mbun;
	private String dateCreated;
	private String credentialCreationDate;
	private List<EndPointAttribute> userAttributes;
	private List<EndPointAssertion> userAssertionList;
	private List<EndPointAttribute> acquiredAttributes;
	private List<EndPointAttribute> preferenceAttributes;

	private String status="success";
	private String errorCode="";
	private String errorDescription="";
	
	
	@JsonProperty("credential")
	public String getCredential() {
		return credential;
	}
	public void setCredential(String credential) {
		this.credential = credential;
	}
	
	@JsonProperty("idpType")
	public String getIdpType() {
		return idpType;
	}
	public void setIdpType(String idpType) {
		this.idpType = idpType;
	}
	
	@JsonProperty("credentialCreationDate")
	public String getCredentialCreationDate() {
		return credentialCreationDate;
	}
	public void setCredentialCreationDate(String credentialCreationDate) {
		this.credentialCreationDate = credentialCreationDate;
	}

	@JsonProperty("userAttributes")
	public List<EndPointAttribute> getUserAttributes() {
		return userAttributes;
	}
	public void setUserAttributes(List<EndPointAttribute> userAttributes) {
		this.userAttributes = userAttributes;
	}
	
	@JsonProperty("userAssertionList")
	public List<EndPointAssertion> getUserAssertionList() {
		return userAssertionList;
	}
	
	public void setUserAssertionList(List<EndPointAssertion> userAssertionList) {
		this.userAssertionList = userAssertionList;
	}
	
	@JsonProperty("dateCreated")
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	@JsonProperty("maxToken")
	public String getMaxToken() {
		return maxToken;
	}
	public void setMaxToken(String maxToken) {
		this.maxToken = maxToken;
	}
	
	@JsonProperty("mbun")
	public String getMbun() {
		return mbun;
	}
	public void setMbun(String mbun) {
		this.mbun = mbun;
	}
	
	@JsonProperty("acquiredAttributes")
	public List<EndPointAttribute> getAcquiredAttributes() {
		return acquiredAttributes;
	}
	public void setAcquiredAttributes(List<EndPointAttribute> acquiredAttributes) {
		this.acquiredAttributes = acquiredAttributes;
	}
	@JsonProperty("preferenceAttributes")
	public List<EndPointAttribute> getPreferenceAttributes() {
		return preferenceAttributes;
	}
	public void setPreferenceAttributes(List<EndPointAttribute> preferenceAttributes) {
		this.preferenceAttributes = preferenceAttributes;
	}
	

	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

/**
 * 
 */
package com.iddataweb.axn.automation.endpoint;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;



/**
 * 
 * @author vinesh.kaveti
 *
 */
@JsonPropertyOrder({"provider","serviceOffering","dateAsserted","assertions"})
public class EndPointAssertion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1787003849333334244L;
	private String provider;
	private String serviceOffering;
	private String dateAsserted;
	private List<Map<String,String>> assertions;
	
	@JsonProperty("provider")
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	@JsonProperty("serviceOffering")
	public String getServiceOffering() {
		return serviceOffering;
	}
	public void setServiceOffering(String serviceOffering) {
		this.serviceOffering = serviceOffering;
	}
	
	@JsonProperty("assertions")
	public List<Map<String, String>> getAssertions() {
		return assertions;
	}
	public void setAssertions(List<Map<String, String>> assertions) {
		this.assertions = assertions;
	}

	@JsonProperty("dateAsserted")
	public String getDateAsserted() {
		return dateAsserted;
	}
	public void setDateAsserted(String dateAsserted) {
		this.dateAsserted = dateAsserted;
	}	
}

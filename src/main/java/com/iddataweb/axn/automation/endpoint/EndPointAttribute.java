
package com.iddataweb.axn.automation.endpoint;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;



/**
 * 
 * @author vinesh.kaveti
 *
 */
@JsonPropertyOrder({"attributeType","dateCreated","values"})
public class EndPointAttribute implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7168805910161536278L;
	private String attributeType;
	private List<Map<String,String>> values;
	private String dateCreated;
	public String getAttributeType() {
		return attributeType;
	}
	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}
	public List<Map<String, String>> getValues() {
		return values;
	}
	public void setValues(List<Map<String, String>> values) {
		this.values = values;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
	
}

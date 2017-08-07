package com.iddataweb.axn.automation.uiActions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iddataweb.axn.automation.common.common;
import com.iddataweb.axn.automation.endpoint.Endpoint;



public class assertions  extends common 
{
	@FindBy(id= "assertionResults")
	WebElement Endpoint;
	
	public void endpoint() 
	{
		
		Endpoint.getText();
		System.out.println(Endpoint.getText());
		log.info("endpoint details as "+Endpoint.getText());
	
	}
		
	
public  void assertionResult()
 {
	
	String Endpoint =driver.findElement(By.id("assertionResults")).getText();
	
	System.out.println(Endpoint);
	
	Endpoint = Endpoint.replaceAll("EndPointData:", "");
	System.out.println(Endpoint);
	
	Endpoint parsedEndpoint = readJson(Endpoint);
	
	List<com.iddataweb.axn.automation.endpoint.EndPointAssertion> returnedAssertions = parsedEndpoint.getUserAssertionList();
	System.out.println(returnedAssertions);
	for (com.iddataweb.axn.automation.endpoint.EndPointAssertion assr : returnedAssertions)
	{
		List<Map<String,String>> assertionsForThisSO = assr.getAssertions();
		log.info(assr.getAssertions());
		for (Map<String, String> assertionValuesMap : assertionsForThisSO)
		{
			for(String assertionName : assertionValuesMap.keySet())
			{
				
				String thisAssertionName = assertionName;
				//logger.info(assertionValuesMap.keySet());
				String assertionValue = assertionValuesMap.get(thisAssertionName);
				System.out.println("Checking Assertion Values. Name: "+assertionName +" Value: "+assertionValue);
				log.info(assertionName );
				log.info(assertionValue);
				System.out.println(" Value: "+assertionValue);
				
				if (assertionName.equals("The Phone Number Matches the Last Name Value"))
			   {					 
					//make sure is pass
					
					
					if (assertionValue.equals("pass"))
					{	
						System.out.println("FAIL");
						
					}
			   }
		   }			
		}
    } 
 }



  public static Endpoint readJson(String json)
  {
		try{
			ObjectMapper mapper = new ObjectMapper();
			Endpoint ep = mapper.readValue(json, Endpoint.class);
			return ep;
		}
		catch (IOException ex)
		{
			System.err.println(ex.getMessage());
			return null;
		}
  }


}

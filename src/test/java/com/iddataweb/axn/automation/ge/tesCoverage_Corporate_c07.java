package com.iddataweb.axn.automation.ge;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.iddataweb.axn.automation.common.common;
import com.iddataweb.axn.automation.uiActions.webelements;


public class tesCoverage_Corporate_c07 extends common


{
	 public static final Logger log=Logger.getLogger(tesCoverage_Corporate_c07.class.getName());
	webelements webelements;
	
// call excel test data by this provider
	
	@DataProvider(name="Corporate test")
	
	public String[][] getTestData()
	 {
		log.info("reading exceldata");
		String[][] testRecords=getData("Other.xlsx", "Corporate");
		return testRecords;
	 }	
	

	@Test(dataProvider ="Corporate test")
	
	public void tesCoverageCorporate(String Country,String scenario,  String firstname,String middle,  String lastname, String companyname,  String streetnumber, String streetname, String cityname, String statename , 
			String postalcode,String CountryCode, String phonenum,String Email, String RunTime ) throws IOException
	
	{
		init_Corporate(CountryCode, Email);
		webelements=new webelements(driver);
		webelements.formVerificationCorporate(firstname, lastname, companyname, streetnumber, streetname, cityname, statename, postalcode, phonenum);
		webelements.verifyButton();
		webelements.secondformt_Corporate();
		webelements.endpointrst();
		//getScreenShot("scenario details tested as  " + firstname);
		driver.close();
	}
    
 }






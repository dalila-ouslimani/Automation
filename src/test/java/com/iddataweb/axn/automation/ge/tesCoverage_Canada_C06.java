package com.iddataweb.axn.automation.ge;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.iddataweb.axn.automation.common.common;
import com.iddataweb.axn.automation.uiActions.webelements;


public class tesCoverage_Canada_C06 extends common


{
	 public static final Logger log=Logger.getLogger(tesCoverage_Canada_C06.class.getName());
	webelements webelements;
	
// call excel test data by this provider
	
	@DataProvider(name="canadatest")
	
	public String[][] getTestData()
	 {
		log.info("reading exceldata");
		String[][] testRecords=getData("GE_US.xlsx", "canada");
		return testRecords;
	 }	
	

	@Test(dataProvider ="canadatest")
	
	public void tesCoverageCanadaC06(String Country,String scenario,  String firstname,String middle,  String lastname,  String streetnumber, String streetname, String cityname, String statename , 
			String postalcode,String phonenum,  String companyname, String CountryCode,String RunTime ) throws IOException
	
	{
		init_ca(CountryCode);
		webelements=new webelements(driver);
		webelements.formVerificationCA(firstname, lastname, streetnumber, streetname, cityname, statename, postalcode, phonenum, companyname);
		webelements.verifyButton();
		webelements.secondformcanada();
		webelements.endpointrst();
		getScreenShot("scenario details tested as  " + firstname);
		driver.close();
	}
    
 }






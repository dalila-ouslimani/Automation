package com.iddataweb.axn.automation.ge;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.iddataweb.axn.automation.common.common;
import com.iddataweb.axn.automation.uiActions.webelements;

public class testCoverag_Trulioo_c02 extends common


{
	 public static final Logger log=Logger.getLogger(testCoverag_Trulioo_c02.class.getName());
	 webelements webelements;
	
// call excel test data by this provider
	
	@DataProvider(name="TruliooC02data")
	public String[][] getTestData()
	     {
			log.info("reading exceldata");
			String[][] testRecords=getData("GE_Trulioo_C02.xlsx", "Countries_c02");
			return testRecords;
	     }	
	

	@Test(dataProvider ="TruliooC02data")
	public void testCoveragTruliooc02 (String Country,String scenario,  String firstname,String middle,  String lastname,  String streetnumber, String streetname, String cityname, String statename, 
			String postalcode,String CountryCode, String phonenum,  String companyname, String RunTime) throws IOException 
	
	{
		init_TC02(CountryCode);
		webelements=new webelements(driver);
		webelements.formVerificationC02(firstname, lastname, streetnumber, streetname, postalcode, cityname, phonenum, companyname);
		webelements.verifyButton();
		webelements.secondformtrulioo_co2();
		webelements.endpointrst();
		getScreenShot("scenario details tested as  " + firstname);
		driver.close();
	}

 }

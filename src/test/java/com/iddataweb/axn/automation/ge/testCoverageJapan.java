package com.iddataweb.axn.automation.ge;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.iddataweb.axn.automation.common.common;
import com.iddataweb.axn.automation.uiActions.webelements;

public class testCoverageJapan extends common


{
	 public static final Logger log=Logger.getLogger(testCoverageJapan.class.getName());
	 webelements webelements;
	
// call excel test data by this provider
	
	@DataProvider(name="Japandata")
	public String[][] getTestData()
	     {
			log.info("reading exceldata");
			String[][] testRecords=getData("GE_Trulioo_C01.xlsx", "Japan");
			return testRecords;
	     }	
	

	@Test(dataProvider ="Japandata")
	public void italy(String Country,String scenario,  String firstname,String middle,  String lastname, String dob,  String districtname, String buildingname, String cityname, String statename, 
			String postalcode,String CountryCode, String phonenum,  String companyname, String RunTime) throws IOException 
	
	{
		init_TC01(CountryCode);
		webelements=new webelements(driver);
		webelements.formVerificationJapan(firstname, lastname, dob, buildingname, districtname, cityname, statename, postalcode, phonenum, companyname);
		webelements.verifyButton();
		webelements.secondformtrulioo();
		webelements.endpointrst();
		getScreenShot("scenario details tested as  " + firstname);
		driver.close();
	}

 }

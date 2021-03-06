package com.iddataweb.axn.automation.ge;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.iddataweb.axn.automation.common.common;
import com.iddataweb.axn.automation.uiActions.webelements;

public class testCoverage_Trulioo_HK_c03 extends common


{
	 public static final Logger log=Logger.getLogger(testCoverage_Trulioo_HK_c03.class.getName());
	 webelements webelements;
	
// call excel test data by this provider
	
	@DataProvider(name="trulioo HongKong C03")
	public String[][] getTestData()
	 {
		log.info("reading exceldata");
		String[][] testRecords=getData("GE_Trulioo_C03.xlsx", "HongKong");
		return testRecords;
	 }	
	

	@Test(dataProvider ="trulioo HongKong C03")
	
	public void testCoverageTruliooHKc03(String Country,String scenario,  String firstname,String middle,  String lastname, String dob, String nationalidnum,  String streetnumber, String streetname, String cityname, String statename , 
			String postalcode,String CountryCode, String phonenum,  String companyname, String RunTime ) throws IOException 
	
	{
		init_TC03(CountryCode);
		webelements=new webelements(driver);
		webelements.formVerificationHK(firstname, lastname, dob, nationalidnum, streetnumber, streetname, cityname, statename, postalcode, phonenum, companyname);
		webelements.verifyButton();
		webelements.secondformtrulioo_co3();
		webelements.endpointrst();
		getScreenShot("scenario details tested as  " + firstname);
		driver.close();
	}

 }

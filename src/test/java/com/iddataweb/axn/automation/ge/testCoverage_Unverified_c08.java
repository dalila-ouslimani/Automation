package com.iddataweb.axn.automation.ge;


import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.iddataweb.axn.automation.common.common;

import com.iddataweb.axn.automation.uiActions.assertions;
import com.iddataweb.axn.automation.uiActions.dataBase;
import com.iddataweb.axn.automation.uiActions.webelements;


public class testCoverage_Unverified_c08  extends common
{
	 public final Logger log=Logger.getLogger(testCoverage_Unverified_c08.class.getName());
	webelements webelements;
	 dataBase dataBase;
// call excel test data by this provider
	
	@DataProvider(name="Unverified test data")
	
	public String[][] getTestData()
	 {
		log.info("reading exceldata");
		String[][] testRecords=getData("Other.xlsx", "Unverified");
		return testRecords;
	 }	
	@Test	

	public void testCoverageUnverified(String Country,String scenario,  String firstname,String middle,  String lastname,String dob,  String streetnumber, String streetname, String cityname, String statename , 
			String postalcode, String CountryCode, String phonenum,  String companyname,String RunTime ) throws  ClassNotFoundException, IOException, SQLException
	
	{
		
		init_Unverified(CountryCode);
		webelements=new webelements(driver);
		webelements.formVerificationUnverified(firstname, lastname, dob, streetnumber, streetname, cityname, statename, postalcode, phonenum, companyname, RunTime);
		webelements.verifyButton();
		webelements.secondformt_unver();
		//dataBase.SendformPin();
		assertions.class.getName();
		getScreenShot("scenario details tested as  " + firstname);
		driver.close();
	}
	
    
 }



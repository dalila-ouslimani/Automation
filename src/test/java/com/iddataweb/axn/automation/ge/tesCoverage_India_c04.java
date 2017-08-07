package com.iddataweb.axn.automation.ge;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.iddataweb.axn.automation.common.common;
import com.iddataweb.axn.automation.uiActions.webelements;


public class tesCoverage_India_c04 extends common


{
	 public static final Logger log=Logger.getLogger(tesCoverage_India_c04.class.getName());
	webelements webelements;
	
// call excel test data by this provider
	
	@DataProvider(name="India test")
	
	public String[][] getTestData()
	 {
		log.info("reading exceldata");
		String[][] testRecords=getData("Other.xlsx", "India");
		return testRecords;
	 }	
	

	@Test(dataProvider ="India test")
	
	public void tesCoverageCanadaC06(String Country,String scenario,  String firstname,String middle,  String lastname,String pannum, String nameoncardname, String dob,  String streetnumber, String streetname, String cityname, String statename , 
			String postalcode,String CountryCode, String phonenum,  String companyname, String RunTime ) throws IOException
	
	{
		init_INC04(CountryCode);
		webelements=new webelements(driver);
		webelements.formVerificationIndia(firstname, lastname, pannum, nameoncardname, dob, streetnumber, streetname, cityname, statename, postalcode, phonenum, companyname);
		webelements.verifyButton();
		webelements.secondformt_india();
		webelements.endpointrst();
		getScreenShot("scenario details tested as  " + firstname);
		driver.close();
	}
    
 }






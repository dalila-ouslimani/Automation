package com.iddataweb.axn.automation.ge;


import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.iddataweb.axn.automation.common.common;
import com.iddataweb.axn.automation.uiActions.webelements;

public class testCoverage_US_C05  extends common
{
	 public static final Logger log=Logger.getLogger(testCoverage_US_C05.class.getName());
	webelements webelements;
	
// call excel test data by this provider
	
	@DataProvider(name="testdata")
	
	public String[][] getTestData()
	 {
		log.info("reading exceldata");
		String[][] testRecords=getData("GE_US.xlsx", "USData");
		return testRecords;
	 }	
	

	@Test(dataProvider ="testdata")
	
	
	public void testCoverageUSC05(String Country,String scenario,  String firstname,String middle,  String lastname,  String streetnumber, String streetname, String cityname, String statename , 
			String postalcode,String phonenum,  String companyname, String CountryCode,String RunTime ) throws IOException
	
	{
		
		
		
		
        init(CountryCode);
		webelements=new webelements(driver);
		webelements.formVerificationUS(firstname, lastname, streetnumber, streetname, cityname, statename, postalcode, phonenum, companyname); 
		webelements.verifyButton();
		 webelements.secondform();
        webelements.verifyButton();
		webelements.endpointrst();
		getScreenShot("scenario details tested as  " + firstname);
		driver.close();
	}
	
    
 }



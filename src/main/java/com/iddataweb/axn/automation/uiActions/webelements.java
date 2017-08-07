package com.iddataweb.axn.automation.uiActions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.iddataweb.axn.automation.common.common;



public class webelements  extends common
{
	 public  final Logger log=Logger.getLogger(webelements.class.getName());

	WebDriver driver;
	
	@FindBy(id="fname")
	WebElement first;
	
	@FindBy(id="lname")
	WebElement last;
	
	@FindBy(id="date52401")
	WebElement dob_unver;
	
	@FindBy(id= "date52251")
	WebElement dob_c03;
	
	@FindBy(id= "date52301")
	WebElement dob_c01;
	
	@FindBy(id="date52502")
	WebElement dob_c04;
	
	@FindBy(linkText="Enter address manually")
	WebElement enterAddressManually;
	
	@FindBy(xpath= ".//*[@id='autofill-address-to-manual']/a")
	WebElement enterAddressManu;
	
	@FindBy(id="street_number")
	WebElement streetNumber;
	
	@FindBy(id="route")
	WebElement streetName;
	
	@FindBy(id="locality")
	WebElement city;

    @FindBy(id="administrative_area_level_1")
	WebElement state;
    
	@FindBy(id="postal_code")
	WebElement postal;
	
	@FindBy(id="intlTelephone")
	WebElement phone;
	
	@FindBy(id="alphanumeric52005")
	WebElement company;
	
	@FindBy(id="alphanumeric52105")
	WebElement company_ca;
	
	@FindBy(id="alphanumeric52257")
	WebElement company_c03;
	
	@FindBy(id="verify-all")
	WebElement verifyButton;
	
	@FindBy(id ="attr52002-PIN-input")
	WebElement pincodev;
	
	@FindBy (id ="attr52102-PIN-input")
	WebElement canadapin;
	
	@FindBy(id = "attr52152-PIN-input")
	WebElement pin_co2;
	
	@FindBy(id = "attr52254-PIN-input")
	WebElement pin_c03;
	
	@FindBy(id ="attr52303-PIN-input")
	WebElement pinAR;
	
	@FindBy(id="attr52505-PIN-input")
	WebElement pin_india;
	
	@FindBy(id = "attr52053-PIN-input")
	WebElement pin_corp;
	
	@FindBy(id="attr52055-PIN-input")
	WebElement pin_email;
	
	@FindBy(id= "attr52403-PIN-input")
	WebElement pin_unver;
	
	@FindBy(id ="alphanumeric52306")
	WebElement company_c01;
	
	@FindBy(id = "alphanumeric52155")
	WebElement company_c02;
	
	@FindBy(id="alphanumeric52508")
	WebElement company_c04;
	
	@FindBy(id="alphanumeric52051")
	WebElement company_corp;
	
	@FindBy(id="alphanumeric52406")
	WebElement company_unver;
	
	@FindBy(id = "administrative_area_level_2")
	WebElement county;
	
	@FindBy(id ="sublocality_level_4")
	WebElement district;
	
	@FindBy(id = "sublocality_level_5")
	WebElement building;
	
	@FindBy(id = "nationalid52252")
	WebElement nationalid;
	
	@FindBy(id= "assertionResults")
	WebElement endpoint;
	
	@FindBy(id = "premise")
	WebElement promise;
	
	@FindBy(id= "taxid52500")
	WebElement pan;
	@FindBy(id = "alphanumeric52501")
	WebElement nameoncard;
	
	
////////add a Constractor 
	
	public webelements(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
// United States  form verification  function 
	
	public void formVerificationUS(String firstname, String lastname,  String streetnumber, String streetname, String cityname, String statename, String postalcode , String phonenum, String companyname)
	{
		first.sendKeys(firstname);
		log.info("Enter First Name as:" +firstname );
		
		last.sendKeys(lastname);
		log.info("Enter Last name as:" +lastname );
		
		enterAddressManu.click();
		log.info("click on manually enter address link");
		
		streetNumber.sendKeys(streetnumber);
		log.info("entered street number:" +streetnumber );
		
		streetName.sendKeys(streetname);
		log.info("entered street name:" +streetname );
		
		city.sendKeys(cityname);
		log.info("entered city name:" +cityname );
		
		state.sendKeys(statename);
		log.info("entered state name:" +statename );
		
		postal.sendKeys(postalcode);
		log.info("entered postal code:" +postalcode );
		
		phone.sendKeys(phonenum);
		log.info("entered phone number:" +phonenum );
		
		company.sendKeys(companyname);
		log.info("entered company name:" +companyname );
	
	}
	
	public void formVerificationUnverified(String firstname, String lastname, String dob,  String streetnumber, String streetname, String cityname, String statename, String postalcode , String phonenum, String companyname, String RunTime)
	{
		first.sendKeys(firstname);
		log.info("Enter First name as:" +firstname );
		
		last.sendKeys(lastname);
		log.info("Enter Last name as:" +lastname );
		
		dob_unver.sendKeys(dob);
		log.info("Enter date of birth as:" +dob );
		
		enterAddressManu.click();
		log.info("click on manually enter address link");
		
		streetNumber.sendKeys(streetnumber);
		log.info("entered street number:" +streetnumber );
		
		streetName.sendKeys(streetname);
		log.info("entered street name:" +streetname );
		
		city.sendKeys(cityname);
		log.info("entered city name:" +cityname );
		
		state.sendKeys(statename);
		log.info("entered state name:" +statename );
		
		postal.sendKeys(postalcode);
		log.info("entered postal code:" +postalcode );
		
		phone.sendKeys(phonenum);
		log.info("entered phone number:" +phonenum );
		
		company_unver.sendKeys(companyname);
		log.info("entered compant name asr:" +companyname );
	
	}
//canada form verification  function 	 
	
	public void formVerificationCA(String firstname, String lastname, String streetnumber, String streetname, String cityname, String statename, String postalcode , String phonenum, String companyname)
	{
		first.sendKeys(firstname);
		log.info("Enter First Name as:" +firstname );
		
		last.sendKeys(lastname);
		log.info("Enter Last name as:" +lastname );
		
		enterAddressManu.click();
		log.info("click on manually enter address link");
		
		streetNumber.sendKeys(streetnumber);
		log.info("entered street number:" +streetnumber );
		
		streetName.sendKeys(streetname);
		log.info("entered street name:" +streetname );
		
		city.sendKeys(cityname);
		log.info("entered city name:" +cityname );
		
		state.sendKeys(statename);
		log.info("entered state name:" +statename );
		
		postal.sendKeys(postalcode);
		log.info("entered postal code:" +postalcode );
		
		phone.sendKeys(phonenum);
		log.info("entered phone number:" +phonenum );
		
		company_ca.sendKeys(companyname);
		log.info("entered company name:" +companyname );		
	}
	
// Trulioo category 1 form verification  function 
	
	public void formVerificationC01(String firstname, String lastname, String dob, String streetnumber, String streetname, String postalcode, String cityname , String phonenum, String companyname)
	{
		first.sendKeys(firstname);
		log.info("Enter First Name as:" +firstname );
		
		last.sendKeys(lastname);
		log.info("Enter last name as:" +lastname );
		
		dob_c01.sendKeys(dob);
		log.info("Enter Last name as:" +dob );
		
		enterAddressManu.click();
		log.info("click on manually enter address link");
		
		streetNumber.sendKeys(streetnumber);
		log.info("entered street number:" +streetnumber );
		
		streetName.sendKeys(streetname);
		log.info("entered street name:" +streetname );
		
		postal.sendKeys(postalcode);
		log.info("entered postal code:" +postalcode );
		
		city.sendKeys(cityname);
		log.info("entered city name:" +cityname );

		phone.sendKeys(phonenum);
		log.info("entered phone number:" +phonenum );
		
		company_c01.sendKeys(companyname);
		log.info("entered company name:" +companyname );		
	}
	
	
	public void formVerificationIreland(String firstname, String lastname, String dob, String streetnumber, String streetname,String cityname , String statename,  String phonenum, String companyname)
	{
		first.sendKeys(firstname);
		log.info("Enter First Name as:" +firstname );
		
		last.sendKeys(lastname);
		log.info("Enter Date of Birth as:" +lastname );
		
		dob_c01.sendKeys(dob);
		log.info("Enter Last name as:" +dob );
		
		enterAddressManu.click();
		log.info("click on manually enter address link");
		
		streetNumber.sendKeys(streetnumber);
		log.info("entered street number:" +streetnumber );
		
		streetName.sendKeys(streetname);
		log.info("entered street name:" +streetname );
		
		city.sendKeys(cityname);
		log.info("entered city name:" +cityname );
		
		state.sendKeys(statename);
		log.info("entered state name:" +statename );
		
		phone.sendKeys(phonenum);
		log.info("entered phone number:" +phonenum );
		
		company_c01.sendKeys(companyname);
		log.info("entered company name:" +companyname );		
	}
	
	
	public void formVerificationItaly(String firstname, String lastname, String dob, String streetnumber, String streetname,String postalcode , String countyname,  String phonenum, String companyname)
	{
		first.sendKeys(firstname);
		log.info("Enter First Name as:" +firstname );
		
		last.sendKeys(lastname);
		log.info("Enter Date of Birth as:" +lastname );
		
		dob_c01.sendKeys(dob);
		log.info("Enter Last name as:" +dob );
		
		enterAddressManu.click();
		log.info("click on manually enter address link");
		
		streetNumber.sendKeys(streetnumber);
		log.info("entered street number:" +streetnumber );
		
		streetName.sendKeys(streetname);
		log.info("entered street name:" +streetname );
		
		postal.sendKeys(postalcode);
		log.info("entered postal code:" +postalcode );
		
		county.sendKeys(countyname);
		log.info("entered state name:" +countyname );
		
		phone.sendKeys(phonenum);
		log.info("entered phone number:" +phonenum );
		
		company_c01.sendKeys(companyname);
		log.info("entered company name:" +companyname );		
	}
	
	
	public void formVerificationJapan(String firstname, String lastname,String dob, String buildingname, String districtname, String cityname, String statename, String postalcode , String phonenum, String companyname)
	{
		first.sendKeys(firstname);
		log.info("Enter First Name as:" +firstname );
		
		last.sendKeys(lastname);
		log.info("Enter Last name as:" +lastname );
		
		dob_c01.sendKeys(dob);
		log.info("Enter Last name as:" +dob );
		
		enterAddressManu.click();
		log.info("click on manually enter address link");
		
		district.sendKeys(districtname);
		log.info("entered street number:" +districtname );
		
		building.sendKeys(buildingname);
		log.info("entered street name:" +buildingname );
		
		postal.sendKeys(postalcode);
		log.info("entered postal code:" +postalcode );
		
		city.sendKeys(cityname);
		log.info("entered city name:" +cityname );
		
		state.sendKeys(statename);
		log.info("entered state name:" +statename );
		
		phone.sendKeys(phonenum);
		log.info("entered phone number:" +phonenum );
		
		company_c01.sendKeys(companyname);
		log.info("entered company name:" +companyname );		
	}
	
	
	public void formVerificationC02(String firstname, String lastname, String streetnumber, String streetname, String postalcode, String cityname , String phonenum, String companyname)
	{
		first.sendKeys(firstname);
		log.info("Enter First Name as:" +firstname );
		
		last.sendKeys(lastname);
		log.info("Enter Date of Birth as:" +lastname );
		
		enterAddressManu.click();
		log.info("click on manually enter address link");
		
		streetNumber.sendKeys(streetnumber);
		log.info("entered street number:" +streetnumber );
		
		streetName.sendKeys(streetname);
		log.info("entered street name:" +streetname );
		
		postal.sendKeys(postalcode);
		log.info("entered postal code:" +postalcode );
		
		city.sendKeys(cityname);
		log.info("entered city name:" +cityname );

		phone.sendKeys(phonenum);
		log.info("entered phone number:" +phonenum );
		
		company_c02.sendKeys(companyname);
		log.info("entered company name:" +companyname );		
	}
	
	
	public void formVerificationC03(String firstname, String lastname, String dob, String nationalidnum, String streetnumber, String streetname,String cityname, String statename, String postalcode,  String phonenum, String companyname)
	{
		first.sendKeys(firstname);
		log.info("Enter First Name as:" +firstname );
		
		last.sendKeys(lastname);
		log.info("Enter Date of Birth as:" +lastname );
		
		dob_c03.sendKeys(dob);
		log.info("Enter Last name as:" +dob );
		
		nationalid.sendKeys(nationalidnum);
		log.info("Enter Last name as:" +nationalidnum );
		
		enterAddressManu.click();
		log.info("click on manually enter address link");
		
		streetNumber.sendKeys(streetnumber);
		log.info("entered street number:" +streetnumber );
		
		streetName.sendKeys(streetname);
		log.info("entered street name:" +streetname );
		
		city.sendKeys(cityname);
		log.info("entered city name:" +cityname );
		
		state.sendKeys(statename);
		log.info("entered state name:" +statename );
		
		postal.sendKeys(postalcode);
		log.info("entered postal code:" +postalcode );
		
		phone.sendKeys(phonenum);
		log.info("entered phone number:" +phonenum );
		
		company_c03.sendKeys(companyname);
		log.info("entered company name:" +companyname );		
	}
	
	public void formVerificationDenmark(String firstname, String lastname, String dob, String nationalidnum, String streetnumber, String streetname,String cityname, String postalcode,  String phonenum, String companyname)
	{
		first.sendKeys(firstname);
		log.info("Enter First Name as:" +firstname );
		
		last.sendKeys(lastname);
		log.info("Enter Date of Birth as:" +lastname );
		
		dob_c03.sendKeys(dob);
		log.info("Enter Last name as:" +dob );
		
		nationalid.sendKeys(nationalidnum);
		log.info("Enter Last name as:" +nationalidnum );
		
		enterAddressManu.click();
		log.info("click on manually enter address link");
		
		streetNumber.sendKeys(streetnumber);
		log.info("entered street number:" +streetnumber );
		
		streetName.sendKeys(streetname);
		log.info("entered street name:" +streetname );
		
		postal.sendKeys(postalcode);
		log.info("entered postal code:" +postalcode );
		
		city.sendKeys(cityname);
		log.info("entered city name:" +cityname );
		
		phone.sendKeys(phonenum);
		log.info("entered phone number:" +phonenum );
		
		company_c03.sendKeys(companyname);
		log.info("entered company name:" +companyname );		
	}
	
	
	public void formVerificationHK(String firstname, String lastname, String dob, String nationalidnum, String streetnumber, String streetname,String cityname, String statename, String postalcode,  String phonenum, String companyname)
	{
		first.sendKeys(firstname);
		log.info("Enter First Name as:" +firstname );
		
		last.sendKeys(lastname);
		log.info("Enter Date of Birth as:" +lastname );
		
		dob_c03.sendKeys(dob);
		log.info("Enter Last name as:" +dob );
		
		nationalid.sendKeys(nationalidnum);
		log.info("Enter Last name as:" +nationalidnum );
		
		enterAddressManu.click();
		log.info("click on manually enter address link");
		
		streetNumber.sendKeys(streetnumber);
		log.info("entered street number:" +streetnumber );
		
		streetName.sendKeys(streetname);
		log.info("entered street name:" +streetname );
		
		city.sendKeys(cityname);
		log.info("entered city name:" +cityname );
		
		state.sendKeys(statename);
		log.info("entered state name:" +statename );
		
		phone.sendKeys(phonenum);
		log.info("entered phone number:" +phonenum );
		
		company_c03.sendKeys(companyname);
		log.info("entered company name:" +companyname );		
	}
	
	public void formVerificationLebanon(String firstname, String lastname, String dob, String nationalidnum, String streetnumber, String streetname,String cityname, String statename, String postalcode,  String phonenum, String companyname)
	{
		first.sendKeys(firstname);
		log.info("Enter First Name as:" +firstname );
		
		last.sendKeys(lastname);
		log.info("Enter Date of Birth as:" +lastname );
		
		dob_c03.sendKeys(dob);
		log.info("Enter Last name as:" +dob );
		
		nationalid.sendKeys(nationalidnum);
		log.info("Enter Last name as:" +nationalidnum );
		
		enterAddressManu.click();
		log.info("click on manually enter address link");
		
		streetNumber.sendKeys(streetnumber);
		log.info("entered street number:" +streetnumber );
		
		streetName.sendKeys(streetname);
		log.info("entered street name:" +streetname );
		
		city.sendKeys(cityname);
		log.info("entered city name:" +cityname );
		
		postal.sendKeys(postalcode);
		log.info("entered state name:" +postalcode);
		
		phone.sendKeys(phonenum);
		log.info("entered phone number:" +phonenum );
		
		company_c03.sendKeys(companyname);
		log.info("entered company name:" +companyname );		
	}	
	
	
	public void formVerificationSingapore(String firstname, String lastname, String dob, String nationalidnum, String streetnumber, String streetname, String postalcode,  String phonenum, String companyname)
	{
		first.sendKeys(firstname);
		log.info("Enter First Name as:" +firstname );
		
		last.sendKeys(lastname);
		log.info("Enter Date of Birth as:" +lastname );
		
		dob_c03.sendKeys(dob);
		log.info("Enter Last name as:" +dob );
		
		nationalid.sendKeys(nationalidnum);
		log.info("Enter Last name as:" +nationalidnum );
		
		enterAddressManu.click();
		log.info("click on manually enter address link");
		
		streetNumber.sendKeys(streetnumber);
		log.info("entered street number:" +streetnumber );
		
		streetName.sendKeys(streetname);
		log.info("entered street name:" +streetname );
		
		postal.sendKeys(postalcode);
		log.info("entered state name:" +postalcode);
		
		phone.sendKeys(phonenum);
		log.info("entered phone number:" +phonenum );
		
		company_c03.sendKeys(companyname);
		log.info("entered company name:" +companyname );		
	}	
	
	
	public void formVerificationUAE(String firstname, String lastname, String dob, String nationalidnum, String streetnumber, String streetname,String promisename,String statename,  String postalcode,  String phonenum, String companyname)
	{
		first.sendKeys(firstname);
		log.info("Enter First Name as:" +firstname );
		
		last.sendKeys(lastname);
		log.info("Enter Date of Birth as:" +lastname );
		
		dob_c03.sendKeys(dob);
		log.info("Enter Last name as:" +dob );
		
		nationalid.sendKeys(nationalidnum);
		log.info("Enter Last name as:" +nationalidnum );
		
		enterAddressManu.click();
		log.info("click on manually enter address link");
		
		streetNumber.sendKeys(streetnumber);
		log.info("entered street number:" +streetnumber );
		
		streetName.sendKeys(streetname);
		log.info("entered street name:" +streetname );
		
		promise.sendKeys(promisename);
		log.info("entered city name:" +promisename );
		
		state.sendKeys(statename);
		log.info("entered state name:" +statename );
				
		//postal.sendKeys(postalcode);
		//log.info("entered state name:" +postalcode);
		
		phone.sendKeys(phonenum);
		log.info("entered phone number:" +phonenum );
		
		company_c03.sendKeys(companyname);
		log.info("entered company name:" +companyname );		
	}	
	
	public void formVerificationIndia(String firstname, String lastname,String pannum,String nameoncardname, String dob, String streetnumber, String streetname,
			String cityname,String statename,  String postalcode,  String phonenum, String companyname)
	{
		first.sendKeys(firstname);
		log.info("Enter First Name as:" +firstname );
		
		last.sendKeys(lastname);
		log.info("Enter Lat Name as:" +lastname );
		
		pan.sendKeys(pannum);
		log.info("Enter Permanent Account Number as:" +pannum );
		
		nameoncard.sendKeys(nameoncardname);
		log.info("Enter Name on Card as:" +nameoncardname );
		
		dob_c04.sendKeys(dob);
		log.info("Enter Date of Birth as :" +dob );
		
		enterAddressManu.click();
		log.info("click on manually enter address link");
		
		streetNumber.sendKeys(streetnumber);
		log.info("entered street number:" +streetnumber );
		
		streetName.sendKeys(streetname);
		log.info("entered street name:" +streetname );
		
		city.sendKeys(cityname);
		log.info("entered city name:" +cityname );
		
		state.sendKeys(statename);
		log.info("entered state name:" +statename );
				
		postal.sendKeys(postalcode);
		log.info("entered state name:" +postalcode);
		
		phone.sendKeys(phonenum);
		log.info("entered phone number:" +phonenum );
		
		company_c04.sendKeys(companyname);
		log.info("entered company name:" +companyname );		
	}	
	
	
	
	public void formVerificationCorporate(String firstname, String lastname, String companyname, String streetnumber, String streetname,
			String cityname,String statename,  String postalcode,  String phonenum)
	{
		first.sendKeys(firstname);
		log.info("Enter First Name as:" +firstname );
		
		last.sendKeys(lastname);
		log.info("Enter Lat Name as:" +lastname );
		
		company_corp.sendKeys(companyname);
		log.info("Enter company name as :" +companyname );
		
		enterAddressManu.click();
		log.info("click on manually enter address link");
		
		streetNumber.sendKeys(streetnumber);
		log.info("entered street number:" +streetnumber );
		
		streetName.sendKeys(streetname);
		log.info("entered street name:" +streetname );
		
		city.sendKeys(cityname);
		log.info("entered city name:" +cityname );
		
		state.sendKeys(statename);
		log.info("entered state name:" +statename );
				
		postal.sendKeys(postalcode);
		log.info("entered state name:" +postalcode);
		
		phone.sendKeys(phonenum);
		log.info("entered phone number:" +phonenum );
				
	}	
	
	
	public void verifyButton()
	{
		verifyButton.click();
		log.info("click verify button");
	}
	
	
//second verification form US
	public void secondform()
	{
		
		pincodev.sendKeys("1234");
		log.info(pincodev);
		
		verifyButton.click();
		log.info("click verify button");
	}
	
	

//second verification fome canada 	
	public void secondformcanada()
	{
		
		canadapin.sendKeys("1234");
		log.info(canadapin);
		
		verifyButton.click();
		log.info("click verify button");
	}

	
	
// second verification form trulioo c01 
	public void secondformtrulioo()
	{
		
		pinAR.sendKeys("1234");
		log.info(pinAR);
		
		verifyButton.click();
		log.info("click verify button");
	}

	
	
	// second verification form trulioo c01 
		public void secondformtrulioo_co2()
		{
			
			pin_co2.sendKeys("1234");
			log.info(pin_co2);
			
			verifyButton.click();
			log.info("click verify button");
		}
	
		
		public void secondformtrulioo_co3()
		{
			
			pin_c03.sendKeys("1234");
			log.info(pin_c03);
			
			verifyButton.click();
			log.info("click verify button");
		}
		
		
		public void secondformt_india()
		{
			
			pin_india.sendKeys("1234");
			log.info(pin_india);
			
			verifyButton.click();
			log.info("click verify button");
		}
		
		
		public void secondformt_unver()
		{
			
			pin_unver.sendKeys("1234");
			log.info(pin_unver);
			
			verifyButton.click();
			log.info("click verify button");
		}
		
		public void secondformt_Corporate()
		{
			
			pin_corp.sendKeys("1234");
			log.info(pin_corp);
			
			pin_email.sendKeys("1234");
			log.info(pin_email);
			
			verifyButton.click();
			log.info("click verify button");
		}
		

	// endpoint result capture
	public void endpointrst() 
	{
		
		endpoint.getText();
		System.out.println(endpoint.getText());
		log.info("endpoint details as "+endpoint.getText());
	
	}
	
	
	// wait for element function
	public void waitForElement(int timeOutInSeconds, WebElement element)
	{
		WebDriverWait wait =new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
}

	










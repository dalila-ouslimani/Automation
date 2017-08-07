package com.iddataweb.axn.automation.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;

import com.iddataweb.axn.automation.customListner.Listener;
import com.iddataweb.axn.automation.customListner.WebEventListener;
import com.iddataweb.axn.automation.excelReader.read_excel;



public class common  
{
	
  public  final Logger log=Logger.getLogger(common.class.getName());
	
	public   WebDriver dr;

	String browsername; 
	read_excel excel;
	Listener lis;
	String environment;
	String urlhost;
	String email;
	String idptype ; 
	protected String dbhost; 	
	protected String dbusername;	
	protected String dbpassword;	

	//apikeys
	String usapikey;
	String tdobapikey;
	String tdobnationalidapikey;
	String tapikey;
	String canadaapikey;
	String unverifiedapikey;
	String indiaapikey;
	String corporateapikey;
	
	
	public EventFiringWebDriver driver;
	public WebEventListener eventlistener;

	
	public EventFiringWebDriver getDriver(){
		return driver;
	}
	
	public void setDriver(EventFiringWebDriver driver)
	{
		this.driver = driver;
	}
	
// Initiate Browser  United States 
	
	public void init(String CountryCode) throws IOException
	{
		testenvironment("PreProd");
		chromebrowser();
		lis = new Listener();
	    driver.manage().window().maximize();
        driver.get(urlhost+"idptype="+idptype+"&apikey="+usapikey+"&email="+email+"&country="+CountryCode);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        log.info("pass url as " );
		String log4jConfPath="log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);	
	}
	
//Initiate Browser canada 
	
	public void init_ca(String CountryCode) throws IOException
	{
		testenvironment("PreProd");
		chromebrowser();
		//lis = new Listener(driver);
	    driver.manage().window().maximize();     
        driver.get(urlhost+"idptype="+idptype+"&apikey="+canadaapikey+"&email="+email+"&country="+CountryCode);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        log.info("pass url as " );
		String log4jConfPath="log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);	
	}

//Initiate Browser for Trulioo Category 1 
	
	public void init_TC01(String CountryCode) throws IOException
	{
		testenvironment("PreProd");
		chromebrowser();
		//lis = new Listener(driver);
	    driver.manage().window().maximize();     
        driver.get(urlhost+"idptype="+idptype+"&apikey="+tdobapikey+"&email="+email+"&country="+CountryCode);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        log.info("pass url " );
		String log4jConfPath="log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);	
	}
	
///Initiate Browser for Trulioo Category 2	
	public void init_TC02(String CountryCode) throws IOException
	{
		testenvironment("PreProd");
		chromebrowser();
		//lis = new Listener(driver);
	    driver.manage().window().maximize();     
        driver.get(urlhost+"idptype="+idptype+"&apikey="+tapikey+"&email="+email+"&country="+CountryCode);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        log.info("pass url " );
		String log4jConfPath="log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);	
	}
	
	
	
	public void init_TC03(String CountryCode) throws IOException
	{
		testenvironment("PreProd");
		//chromebrowser();
		selectBrowser("Chrome");
		//lis = new Listener(driver);
	    driver.manage().window().maximize();     
        driver.get(urlhost+"idptype="+idptype+"&apikey="+tdobnationalidapikey+"&email="+email+"&country="+CountryCode);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        log.info("pass url " );
		String log4jConfPath="log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);	
	}
	
	
	public void init_INC04(String CountryCode) throws IOException
	{
		testenvironment("PreProd");
		//chromebrowser();
		selectBrowser("Chrome");
		//lis = new Listener(dr);
	    driver.manage().window().maximize();     
        driver.get(urlhost+"idptype="+idptype+"&apikey="+indiaapikey+"&email="+email+"&country="+CountryCode);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        log.info("pass url " );
		String log4jConfPath="log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);	
	}	
	
	
	public void init_Corporate(String CountryCode , String Email) throws IOException
	{
		testenvironment("PreProd");
		//chromebrowser();
		selectBrowser("Chrome");
		//lis = new Listener(driver);
	    driver.manage().window().maximize();     
        driver.get(urlhost+"idptype="+idptype+"&apikey="+corporateapikey+"&email="+Email+"&country="+CountryCode);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        log.info("pass url " );
		String log4jConfPath="log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);	
	}
	
	
	public void init_Unverified(String CountryCode) throws IOException
	{
		testenvironment("PreProd");
		//chromebrowser();
		selectBrowser("Chrome");
		//lis = new Listener(driver);
	    driver.manage().window().maximize();     
        driver.get(urlhost+"idptype="+idptype+"&apikey="+unverifiedapikey+"&email="+email+"&country="+CountryCode);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        log.info("pass url " );
		String log4jConfPath="log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);	
	}
	
//define Browser
	public void selectBrowser(String browsername) throws IOException
	  {
		    
		    if (browsername.equalsIgnoreCase("Firefox")) 
		 {
		    
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
			log.info("select Browser as" + browsername);
			dr=new FirefoxDriver();	
			driver = new EventFiringWebDriver(dr);
			eventlistener= new WebEventListener();
			driver.register(eventlistener);
		 }
		else if (browsername.equalsIgnoreCase("Chrome"))
		   { 
			 
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
			 log.info("select Browser as" + browsername);
			 dr = new ChromeDriver();
			 driver = new EventFiringWebDriver(dr);
			 eventlistener= new WebEventListener();
			 //driver.register(eventlistener);
		   }
		else if(browsername.equalsIgnoreCase("IE"))
		    {
			  dr=new InternetExplorerDriver();
			  driver = new EventFiringWebDriver(dr);
			  eventlistener= new WebEventListener();
			  driver.register(eventlistener);
		   
		    }
	  }
	
	
	
	//read data from any excel by giving excel name and sheet name
	public String[][]  getData(String ExcelName, String sheetName)
	{
		String path = System.getProperty("user.dir")+"/src/main/java/com/iddataweb/axn/automation/data/"+ExcelName;
		excel= new read_excel(path);
		String[][] data = excel.getDataFromSheet(sheetName, ExcelName);
		return data;		
	}
	
	// Capture Screenshot 
	
	public void getScreenShot(String name)
	{
		Calendar calendar= Calendar.getInstance();
		SimpleDateFormat formater= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			String reportDirectory= new File(System.getProperty("user.dir")).getAbsolutePath() + "/src/main/java/com/iddataweb/axn/automation/screeshot/";
			File destFile = new File((String) reportDirectory + name + "_" + formater.format(calendar.getTime())+ ".png");
			FileUtils.copyFile(scrFile,  destFile);
			// this will help us to link the screenshot to test NG report 
			Reporter.log("<a href='" + destFile.getAbsolutePath() + "'><img scr= '" + destFile.getAbsolutePath()+ " height = '100' width = '100'/> </a>");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	// define test env and properties 
	
	public void testenvironment(String environment) throws IOException
	{
		 Properties property;
		 FileInputStream fs = null;
		fs=new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/iddataweb/axn/automation/config/config.properties");
	    property= new Properties();
	    property.load(fs);
	 	  
		if (environment.equalsIgnoreCase("PreProd")) 
		 {
			 urlhost=property.getProperty("preprod.host");     
			 email= property.getProperty("preprod.email");	
			 idptype = property.getProperty("preprod.idptype"); 
			 dbhost= property.getProperty("preprod.dbhost"); 	
			 dbusername= property.getProperty("preprod.dbusername");	
			 dbpassword= property.getProperty("preprod.dbpassword");	
			//apikeys
			 usapikey= property.getProperty("preprod.usapikey");
			 tdobapikey= property.getProperty("preprod.tdobapikey");
			 tdobnationalidapikey= property.getProperty("preprod.tdobnationalidapikey");
			 tapikey= property.getProperty("preprod.tapikey");
			 canadaapikey= property.getProperty("preprod.canadaapikey");
			 unverifiedapikey= property.getProperty("preprod.unverifiedapikey");
			 indiaapikey= property.getProperty("preprod.indiaapikey");
			 corporateapikey= property.getProperty("preprod.corporateapikey");
					
		 }
		else if (environment.equalsIgnoreCase("Test"))
		   { 
			 urlhost=property.getProperty("test.host");     
			 email= property.getProperty("test.email");	
			 idptype = property.getProperty("test.idptype"); 
			 dbhost= property.getProperty("test.dbhost"); 	
			 dbusername= property.getProperty("test.dbusername");	
			 dbpassword= property.getProperty("test.dbpassword");	
			//apikeys
			 usapikey= property.getProperty("test.usapikey");
			 tdobapikey= property.getProperty("test.tdobapikey");
			 tdobnationalidapikey= property.getProperty("test.tdobnationalidapikey");
			 tapikey= property.getProperty("test.tapikey");
			 canadaapikey= property.getProperty("test.canadaapikey");
			 unverifiedapikey= property.getProperty("test.unverifiedapikey");
			 indiaapikey= property.getProperty("test.indiaapikey");
			corporateapikey= property.getProperty("test.corporateapikey");
		   }
		else if (environment.equalsIgnoreCase("Sandbox"))
		   { 
			 urlhost=property.getProperty("sandbox.host");     
			 email= property.getProperty("sandbox.email");	
			 idptype = property.getProperty("sandbox.idptype"); 
			 dbhost= property.getProperty("sandbox.dbhost"); 	
			 dbusername= property.getProperty("sandbox.dbusername");	
			 dbpassword= property.getProperty("sandbox.dbpassword");	
			//apikeys
			 usapikey= property.getProperty("sandbox.usapikey");
			 tdobapikey= property.getProperty("sandbox.tdobapikey");
			 tdobnationalidapikey= property.getProperty("sandbox.tdobnationalidapikey");
			 tapikey= property.getProperty("sandbox.tapikey");
			 canadaapikey= property.getProperty("sandbox.canadaapikey");
			 unverifiedapikey= property.getProperty("sandbox.unverifiedapikey");
			 indiaapikey= property.getProperty("sandbox.indiaapikey");
			corporateapikey= property.getProperty("sandbox.corporateapikey");
		   }
	  }
	
	
	
	public void chromebrowser() throws IOException
	{
	 Properties property;
	 FileInputStream fs = null;
	 
		fs=new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/iddataweb/axn/automation/config/config.properties");
	    property= new Properties();
	    property.load(fs);	    
	     browsername=property.getProperty("chromebrowser");  
	     System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		 log.info("select Browser as" + browsername);
		 dr = new ChromeDriver();
		 driver = new EventFiringWebDriver(dr);
		 eventlistener= new WebEventListener();
		 driver.register(eventlistener);
   }
	
	
	
	public void  firefixbrowser() throws IOException
	{
	 Properties property;
	 FileInputStream fs = null;
	 
		fs=new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/iddataweb/axn/automation/config/config.properties");
	    property= new Properties();
	    property.load(fs);	    
	     browsername=property.getProperty("firefoxbrowser");
	     System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
			log.info("select Browser as" + browsername);
			dr=new FirefoxDriver();	
			driver = new EventFiringWebDriver(dr);
			eventlistener= new WebEventListener();
			driver.register(eventlistener);  
   }
	

			
	 
}





















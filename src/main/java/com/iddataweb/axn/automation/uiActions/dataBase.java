package com.iddataweb.axn.automation.uiActions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.iddataweb.axn.automation.common.common;



public class dataBase extends common

{
	
	 @FindBy(id= "attr52403-PIN-input") 
		WebElement pin_unver;
	 
	 @FindBy(id="verify-all")
		WebElement verifyButton;
 public  final Logger log=Logger.getLogger(dataBase.class.getName());

 String PincodeValue;
	
 
@Test
public void SendformPin()  throws  ClassNotFoundException, SQLException 
	
	{    
		
	 Connection myConn;
	 Statement myStmt;
			//myConn = DriverManager.getConnection("jdbc:mysql://rds-mysql-preprod-axn.cwlm9uctmv3i.us-east-1.rds.amazonaws.com:3306/axn","preprodaxn","A11IsWe11");

				//1. get a connection to data base
				Class.forName("com.mysql.jdbc.Driver");
				myConn = DriverManager.getConnection("jdbc:mysql://rds-mysql-preprod-axn.cwlm9uctmv3i.us-east-1.rds.amazonaws.com:3306/axn","preprodaxn","A11IsWe11");
				System.out.println(myConn);
				//myConn = DriverManager.getConnection(dbhost,dbusername,dbpassword);
				log.info(myConn);
				
				myStmt = myConn.createStatement();
				log.info(myStmt);
				
				ResultSet myRs= myStmt.executeQuery("select *  from axn.pinverification nolock order by datecreated desc limit 1");
				log.info(myStmt.executeQuery("select * from axn.pinverification nolock order by datecreated desc limit 1 "));
			 
				//4. Process the result set 
				while(myRs.next())
				{
					String Pin= myRs.getString("PinCode");
					//PincodeValue = myRs.getString("PINCode");
					System.out.println(Pin);
					log.info(Pin);		
				}
				  			   
		
				//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//pin_unver.sendKeys("PincodeValue" );
			   // log.info( "enter pin as" +PincodeValue );
			    
			    //verifyButton.click();
				//log.info("click verify button");
			     
			} 

}

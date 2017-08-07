package com.iddataweb.axn.automation.ge;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.iddataweb.axn.automation.common.common;
import com.iddataweb.axn.automation.uiActions.dataBase;


public class rundatabase extends common {
	
	 public final Logger log=Logger.getLogger(testCoverage_Unverified_c08.class.getName());
		
		 dataBase dataBase;
		 
		 @Test
		 public void rundatase() throws IOException, SQLException, ClassNotFoundException
		 {
			
			 dataBase.SendformPin();
		 }
		 

}

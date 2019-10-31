package Automation.PHP_Automation_testscript;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Loginpage extends Base
{

	Properties pro=new Properties();
	Logger l=Logger.getLogger("Loginpage");

@Test
	public  void login() throws Exception {
	
		PropertyConfigurator.configure("C:\\New folder\\PHP_Automation_testscript\\Log4J.properties");
		 FileInputStream f=new FileInputStream("C:\\New folder\\PHP_Automation_testscript\\Base.properties");
	     pro.load(f);
	   launchbrowser();
		driver.findElement(Myaccount).click();

		driver.findElement(login).click();		
		
		driver.findElement(Emailid).sendKeys(pro.getProperty("Emailid"));
		driver.findElement(pwd).sendKeys(pro.getProperty("password"));
		driver.findElement(logbt).click();
		
		String str=driver.getTitle();
		l.info(str);
		if(str.equals("Login")) {
			l.info("userable to login successfully");
		}
		else {
			l.info("login fail");
		}
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.quit();
		 
		  
		   }
		
		
		
	}




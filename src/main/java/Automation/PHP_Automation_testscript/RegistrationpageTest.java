 package Automation.PHP_Automation_testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class RegistrationpageTest  extends Base{
	
	
	
	Properties pro=new Properties();
	Logger l=Logger.getLogger("RegistrationpageTest");
	

	@Test
	public  void testcase() throws Exception  {
		
		PropertyConfigurator.configure("C:\\New folder\\PHP_Automation_testscript\\Log4J.properties");
		FileInputStream f=new FileInputStream("C:\\New folder\\PHP_Automation_testscript\\Base.properties");
			pro.load(f);
			launchbrowser();
				
		driver.findElement(Myaccount).click();

		driver.findElement(Signup).click();

		driver.findElement(Firstname).sendKeys(pro.getProperty("Firstname"));
		driver.findElement(Lastname).sendKeys(pro.getProperty("Lastname"));
		driver.findElement(Mobilenumber).sendKeys(pro.getProperty("Mobilenumber"));
	driver.findElement(Email).sendKeys(pro.getProperty("Emailid"));
	driver.findElement(Password).sendKeys(pro.getProperty("password"));
	driver.findElement(Confirm).sendKeys(pro.getProperty("confirmpassword"));

	driver.findElement(Submit).sendKeys(Keys.ENTER);
	
	String str=driver.getTitle();
  l.info(str);

if(str.equals("Register"))
{
l.info("Userablr to Registered Successfully");
}
else {
	l.info("fail");
}
driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
driver.quit();
	
	   
	   }
  
}

	
	
	


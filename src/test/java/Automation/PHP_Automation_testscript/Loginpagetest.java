package Automation.PHP_Automation_testscript;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginpagetest extends Loginpage
{
	@BeforeTest
	public void before() throws Exception {
	launchbrowser();
	}
    @Test
 
public void testcase() throws Exception{
    	
    	login();
  	
    	
}
    @AfterTest
    public void last() {
    	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    	driver.quit();
    }
}
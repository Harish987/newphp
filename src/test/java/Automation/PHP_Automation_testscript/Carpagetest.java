package Automation.PHP_Automation_testscript;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Carpagetest extends PHP_Transfer
{
@BeforeTest
public void before() throws Exception {
	launchbrowser();
}
    @Test
 
public void testcase5() throws Exception {
    	
    	carsearch();
}
    @AfterTest
    public void last() {
    	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    	driver.quit();
    }
}
package Automation.PHP_Automation_testscript;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlightTest extends Flight_search
{
	@BeforeTest
	public void before() throws Exception {
		launchbrowser();
	}
@Test
public void test() throws Exception
{
	
	flightsearch();
	
}
@AfterTest
public void last() {
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.quit();
}
}

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



public class PHP_Tour extends Base
{

	Properties pro=new Properties();
	Logger l=Logger.getLogger("PHP_Tour");
	
	   @Test
	public  void Toursearch() throws Exception {
		
	
	 
		 PropertyConfigurator.configure("C:\\New folder\\PHP_Automation_testscript\\Log4J.properties");
			FileInputStream f=new FileInputStream("C:\\New folder\\PHP_Automation_testscript\\Base.properties");
				pro.load(f);
				launchbrowser();
	
	driver.findElement(Toures).click();
    driver.findElement(loca).click();
	driver.findElement(entertour).click();
	driver.findElement(tourtype).click();
	
    driver.findElement(toursele).click();
	
    driver.findElement(tourchecin).click();
   driver.findElement(movenx).click();
   driver.findElement(tourdate).click();
    
    driver.findElement(adults).click();
    driver.findElement(adpluse).click();
    driver.findElement(toursearch).click();
    
   String str=driver.getTitle();
   l.info(str);
   if(str.equals("Day Visit of Petra from Oman"))
   {
	   l.info("happy journey");
   }
   else {
	   l.info("better luck next time");
   }
   driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.quit();
   
  
   }
    
	   
	
	}
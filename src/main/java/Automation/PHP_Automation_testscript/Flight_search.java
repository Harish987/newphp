package Automation.PHP_Automation_testscript;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class Flight_search extends Base
{
	
	Properties pro=new Properties();
	Logger l=Logger.getLogger("Flight_search");
	
	
	
 public void flightsearch() throws Exception
 {
	 PropertyConfigurator.configure("C:\\New folder\\PHP_Automation_testscript\\Log4J.properties");
	 driver.findElement(Flight).click();
	 driver.findElement(flightcla).click();
	 driver.findElement(flig).click();
     
	  driver.findElement( Fromcity).click();
      
      driver.findElement( Fromcity1).sendKeys(pro.getProperty("cityname1"));
      driver.findElement(Fromcity1).sendKeys((Keys.DOWN));
      Thread.sleep(1000);
      driver.findElement(Fromcity1).sendKeys(Keys.ENTER);
      
      
    //tocity
      driver.findElement(Tocity).click();
      driver.findElement(Tocity1).sendKeys(pro.getProperty("cityname2"));
      driver.findElement(Tocity1).sendKeys((Keys.DOWN));
      Thread.sleep(1000);
      driver.findElement(Tocity1).sendKeys(Keys.ENTER);
      //date
      driver.findElement(By.xpath("//input[@id='FlightsDateStart']")).click();
      driver.findElement(By.xpath("//div[7]//nav[1]//div[2]")).click();
      driver.findElement(By.xpath("//div[contains(text(),'Nov')]")).click();
      for(int i = 1 ; i<=35 ; i++) {             
           String str1 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+i+"]")).getText();             
           if(str1.equals("1")) {                 
               for(int j = i ; j<=35 ; j++) {                     
                   str1 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).getText();                                         
                   if(str1.equals(pro.getProperty("checkin_day1"))) {                         
                       driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).click();                         
                       break;
                       
                   }
               }
                   }
           
      //adults
      
     driver.findElement(By.xpath("//div[contains(@class,'row gap-5')]//div[1]//div[1]//div[1]//div[1]//span[3]//button[1]")).click(); 
   
      //child
      driver.findElement(By.xpath("//div[contains(@class,'row gap-10 mb-15 align-items-end')]//div[2]//div[1]//div[1]//div[1]//span[3]//button[1]")).click();     
      //infant
      driver.findElement(By.xpath("//div[contains(@class,'col-md-3 col-xs-12')]//div[3]//div[1]//div[1]//div[1]//span[3]//button[1]")).click();     
//search
      driver.findElement(By.xpath("//div[contains(@class,'col-xs-12 col-md-1')]//button[contains(@class,'btn-primary btn btn-block')][contains(text(),'Search')]")).click();
 }
 

 //to verificatiion
     
     String str=driver.findElement(By.xpath("//h3[@class='heading-title']")).getText();
     l.info(str);

     if(str.equals(pro.getProperty("cityname1") +" to "+ pro.getProperty("cityname2"))) {
    	 l.info("testcasepass");
    	
     }
     else {
    	 l.info("testcasefail");
     }
 
 
     
     
      
 }
}

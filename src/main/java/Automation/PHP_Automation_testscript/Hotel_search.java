package Automation.PHP_Automation_testscript;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Hotel_search extends Base
{
	
	Properties pro=new Properties();
	Logger l=Logger.getLogger("Hotel_search");
	
	   @Test
	public  void hotelsearch() throws Exception {
	     
		   PropertyConfigurator.configure("C:\\New folder\\PHP_Automation_testscript\\Log4J.properties");
			FileInputStream f=new FileInputStream("C:\\New folder\\PHP_Automation_testscript\\Base.properties");
				pro.load(f);
				launchbrowser();
	
				driver.findElement(Hotel_name).click();
				driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/input[1]")).sendKeys(pro.getProperty("hotel_name"));
			     driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/input[1]")).sendKeys((Keys.DOWN));
			     Thread.sleep(1000);
			     driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/input[1]")).sendKeys(Keys.ENTER);
		         
			     
		          driver.findElement(Check_in).click();
		          Thread.sleep(1000);
		         
		          String s1=driver.findElement(By.xpath("//div[1]//nav[1]//div[2] ")).getText();//month
		             do
		          {
		              driver.findElement(By.xpath("//body[contains(@class,'with-waypoint-sticky')]/div[@id='datepickers-container']/div[1]/nav[1]/div[3]/*[1]")).click();//next
		              s1=driver.findElement(By.xpath("//div[1]//nav[1]//div[2]")).getText();//month}
		              
		          }
		             while(s1.equalsIgnoreCase(pro.getProperty("check_in")));
		             List<WebElement> dates=driver.findElements(By.xpath("//*[@id='datepickers-container']/div[1]/div/div[1]/div[2]/div"));
		             int count=driver.findElements(By.xpath("//*[@id='datepickers-container']/div[1]/div/div[1]/div[2]/div")).size();
		             System.out.println("count"+count);
		             for(int i=0;i<count;i++)
		             {
		                 String date=driver.findElements(By.xpath("//*[@id='datepickers-container']/div[1]/div/div[1]/div[2]/div")).get(i).getText();
		                 if(date.equals(pro.getProperty("indate")))
		                 {
		                     driver.findElement(By.xpath("//*[@id='datepickers-container']/div[1]/div/div[1]/div[2]/div[contains(text(),"+pro.getProperty("indate")+")]")).click();

		     

		                 
		                 }
		             }
		            
		         
	   driver.findElement(Check_out).click();
       Thread.sleep(1000);
      
       String s2=driver.findElement(By.xpath("//div[@id='datepickers-container']//div[2]//nav[1]//div[2]")).getText();//month
          do
       {
           driver.findElement(By.xpath("//body[@class='with-waypoint-sticky']/div[@id='datepickers-container']/div[2]/nav[1]/div[3]/*[1]")).click();//next
           s1=driver.findElement(By.xpath("//div[@id='datepickers-container']//div[2]//nav[1]//div[2]")).getText();//month}
           
       }
          while(s1.equalsIgnoreCase(pro.getProperty("check_out")));
          List<WebElement> dates1=driver.findElements(By.xpath("//*[@id='datepickers-container']/div[1]/div/div[1]/div[2]/div"));
          int count1=driver.findElements(By.xpath("//*[@id='datepickers-container']/div[1]/div/div[1]/div[2]/div")).size();
          System.out.println("count"+count1);
          
      
       for(int i=0;i<count;i++)
       {
           String date=driver.findElements(By.xpath("//*[@id='datepickers-container']/div[2]/div/div/div[2]/div")).get(i).getText();
           if(date.equals(pro.getProperty("outdate")))
           {
               driver.findElement(By.xpath("//*[@id='datepickers-container']/div[2]/div/div/div[2]/div[contains(text(),"+pro.getProperty("outdate")+")]")).click();



           
           }
       }
      
       driver.findElement(Adult).click();
       driver.findElement(By.xpath("//div[contains(@class,'col o2')]//button[contains(@class,'btn btn-white bootstrap-touchspin-up')][contains(text(),'+')]")).click();
       driver.findElement(Child).click();
       driver.findElement(By.xpath("//div[contains(@class,'col 01')]//button[contains(@class,'btn btn-white bootstrap-touchspin-up')][contains(text(),'+')]")).click();
       driver.findElement(search).click();
      
       //verification
     
       String str=driver.getTitle();
       l.info(str);
       
       if(str.equals("Hotels Results"))
       {
       l.info("userable to see the hotel page");
       }
       else {
       	l.info("fail");
       	}
	 
       driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
   	driver.quit();
       
      
       }
      
       
       
       
   }
		         




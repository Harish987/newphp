package Automation.PHP_Automation_testscript;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class PHP_Transfer extends Base
{
	Properties pro=new Properties();
	Logger l=Logger.getLogger("PHP_Transfer");
	
	
	@Test
	public  void carsearch() throws Exception {
	
	PropertyConfigurator.configure("C:\\New folder\\PHP_Automation_testscript\\Log4J.properties");
		 FileInputStream f=new FileInputStream("C:\\New folder\\PHP_Automation_testscript\\Base.properties");
			pro.load(f);
		launchbrowser();
			
	        driver.findElement(CarBtn).click();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	       
	        driver.findElement(PickUp).click();
	        driver.findElement(By.xpath("//li[contains(text(),'Manchester')]")).click();
	       
	        /*driver.findElement(By.xpath("//input[@id='dropdate']")).click();
	        while(!driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/nav[1]/div[2]")).getText().contains(pro.getProperty("Pick_up_month")))
	        {
	            driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/nav[1]/div[3]")).click();
	        }
	       
	        int count = driver.findElements(By.xpath("//div[@class='datepicker--cell datepicker--cell-day']")).size();
	        System.out.println(count);
	        for(int i=0;i<count;i++)
	        {
	            String text = driver.findElements(By.xpath("//div[@class='datepicker--cell datepicker--cell-day']")).get(i).getText();
	            if(text.equals(pro.getProperty("Pick_up_date")))
	            {
	                driver.findElements(By.xpath("//div[@class='datepicker--cell datepicker--cell-day']")).get(i).click();
	            }
	        }
	        int j=0;
	        while(!driver.findElement(By.xpath("//div[4]//nav[1]//div[2]")).getText().contains(prop.getProperty("drop_up_month")))
	        {
	            driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[4]/nav[1]/div[3]")).click();
	            j++;
	            if(j>5) break;
	        }
	        while(!driver.findElement(By.xpath("//div[4]//nav[1]//div[2]")).getText().contains("drop_up_month"))
	        {
	            driver.findElement(By.xpath("//div[4]//nav[1]//div[3]")).click();
	        }
	        for(int i=0;i<count;i++)
	        {
	            String text = driver.findElements(By.xpath("//div[@class='datepicker--cell datepicker--cell-day']")).get(i).getText();
	            if(text.equals(pro.getProperty("drop_up_date")))
	            {
	                driver.findElements(By.xpath("//div[@class='datepicker--cell datepicker--cell-day']")).get(i).click();
	            }*/
	        
	        driver.findElement(PickUpTime).click();
	        driver.findElement(By.xpath("//div[@id='transfer']//div[3]//div[1]//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")).sendKeys("09:00");
	        driver.findElement(By.xpath("//div[@id='transfer']//div[3]//div[1]//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")).sendKeys(Keys.ENTER);
	   
	        driver.findElement(DropTime).click();
	        driver.findElement(By.xpath("//div[@id='transfer']//div[4]//div[1]//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")).sendKeys("18:00");
	        driver.findElement(By.xpath("//div[@id='transfer']//div[4]//div[1]//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")).sendKeys(Keys.ENTER);
	       
	        driver.findElement(Submitcar).click();
	        String str=driver.getTitle();
	        l.info(str);
	        if(str.equals("Search Results")) {
	        	l.info("book the car successfully");
	        }
	        else {
	        	l.info("sorry u not able to book the car");
	        }
	       
	       
	    
	
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.quit();


}
}
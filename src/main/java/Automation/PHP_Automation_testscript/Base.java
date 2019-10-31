package Automation.PHP_Automation_testscript;



import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base {
	
	Properties pro=new Properties();
	Logger l=Logger.getLogger("Base");
	
public static	WebDriver driver;


	//Registration Page 
	By Myaccount =By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	By Signup =By.xpath("//a[@class='dropdown-item tr']");
    By Firstname=By.xpath("//input[@placeholder='First Name']");
    By Lastname=By.xpath("//input[@placeholder='Last Name']");
    By Mobilenumber=By.xpath("//input[@placeholder='Mobile Number']");
    By Email=By.xpath("//input[@placeholder='Email']");
    By Password=By.xpath("//input[@placeholder='Password']");
    By Confirm=By.xpath("//input[@placeholder='Confirm Password']");
    By Submit=By.xpath("//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']");
    
    
    
    //Login Page 
    By login=By.xpath("//a[@class='dropdown-item active tr']");
    By Emailid=By.xpath("//input[@placeholder='Email']");
	By pwd=By.xpath("//input[@placeholder='Password']");
	By logbt=By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']");
	
	
	
	//Hotel Page
	By Hotel_name=By.xpath("//div[@id='s2id_autogen1']");
    By Check_in=By.xpath("//input[@id='checkin']");
    By Check_out=By.xpath("//input[@id='checkout']");
    By Adult=By.xpath("//div[contains(@class,'col o2')]//input[contains(@placeholder,'0')]");
    By Child=By.xpath("//div[contains(@class,'col 01')]//input[contains(@placeholder,'0')]");
    
    By search=By.xpath("//div[contains(@class,'col-md-2 col-xs-12 o1')]//button[contains(@class,'btn btn-primary btn-block')][contains(text(),'Search')]");
    
	//Flight
     By Flight=By.xpath("//a[contains(@class,'text-center flights')]");
     By flightcla=By.xpath("//span[contains(text(),'Economy')]");
     By flig=By.xpath("//li[contains(text(),'Business')]");
     By Fromcity=By.xpath("//div[@id='s2id_location_from']");
    By Fromcity1=By.xpath("//div[@id='s2id_location_from']//a[@class='select2-choice']");
    By Tocity=By.xpath("//div[@id='s2id_location_to']");
    By Tocity1=By.xpath("//div[@id='s2id_location_to']//a[@class='select2-choice']");
    By check_in=By.xpath("//input[@id='departure']");
    By guest=By.xpath("//div[@class='col-md-1 form-group go-right col-xs-12']//input[@placeholder='0']");
	
	
	//Tour Page
	By Toures=By.xpath("//a[contains(@class,'text-center tours')]");
	By loca=By.xpath("//span[contains(text(),'Search by Listing or City Name')]");
	By entertour=By.xpath("//div[contains(text(),'Day Visit of Petra from Oman')]");
	By tourtype=By.xpath("//span[contains(text(),'Select')]");
	By tour=By.xpath("//div[@id='tourtype_chosen']//input[@class='chosen-search-input']");
	By toursele=By.xpath("//*[@id=\"tourtype_chosen\"]/div/ul/li[4]");
	By tourchecin=By.xpath("//input[@id='DateTours']");
	By checkinmon=By.xpath("/html[1]/body[1]/div[3]/div[4]/nav[1]/div[2]");
	By movenx=By.xpath("/html[1]/body[1]/div[2]/div[6]/nav[1]/div[3]/*");
	By tourdate=By.xpath("/html[1]/body[1]/div[2]/div[6]/div[1]/div[1]/div[2]/div[19]");
	By checkintour=By.xpath("//div[3]//tr[1]//td[2][contains(text(),"+pro.getProperty("checkin")+")]");
	By adults=By.xpath("//div[contains(@class,'col-md-12')]//input[contains(@placeholder,'0')]");
	By adpluse=By.xpath("//div[contains(@class,'col-md-12')]//button[contains(@class,'btn btn-white bootstrap-touchspin-up')][contains(text(),'+')]");
	//By guest=By.xpath("//*[@id=\"adults\"]");
	//By guestno=By.xpath("//*[@id=\"adults\"]/option[4]");
	//By toursel=By.xpath("//select[@id='tourtype']");
	//By types=By.xpath("//option[contains(text(),'Holidays')]");
	By toursearch=By.xpath("//div[contains(@class,'ftab-inner menu-horizontal-content')]//button[contains(@class,'btn btn-primary btn-block')][contains(text(),'Search')]");
	
	
	//Car page
	By carssss=By.xpath("//a[contains(text(),'Transfer')]");
	By carpicup=By.xpath("//div[@id='carlocations_chosen']");
	By carsearch=By.xpath("//div[@id='carlocations_chosen']//input[contains(@class,'chosen-search-input')]");
	By picupcity=By.xpath("//li[@data-option-array-index='3']");
	By droploc=By.xpath("//div[@id='select2-drop']//input[contains(@class,'select2-input')]");
	By cardate=By.xpath("//*[@id=\"dropdate\"]");
	By  carmonth=By.xpath("/html/body/div[12]/div[1]/table/thead/tr[1]/th[2]");
	By movenxt=By.xpath("/html[1]/body[1]/div[2]/div[3]/nav[1]/div[3]/*");
	By carindate=By.xpath("//div[3]//div[1]//div[1]//div[2]//div[19]");
	By picuptime=By.xpath("//div[@id='transfer']//div[3]//div[1]//div[1]//div[2]//div[1]//div[2]//div[1]//a[1]//span[1]");
	By timesele=By.xpath("//div[@class='chosen-container chosen-container-single chosen-with-drop chosen-container-active']//input[@class='chosen-search-input']");
	By picsele=By.xpath("//li[@data-option-array-index='7']");
	By carmonthre=By.xpath("/html/body/div[13]/div[1]/table/thead/tr[1]/th[2]");
	By movenext=By.xpath("/html[1]/body[1]/div[2]/div[4]/nav[1]/div[3]/*");
	By carredate=By.xpath("//div[4]//div[1]//div[1]//div[2]//div[6]");
	By droptimesele=By.xpath("//span[contains(text(),'Time')]");
	By dropsele=By.xpath("//div[@id='transfer']//div[4]//div[1]//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]");
	By droptime=By.xpath("//select[contains(@name,'dropoffTime')]");
	By dropretime=By.xpath("//li[@data-option-array-index=\"'29']");
	By searchcar=By.xpath("//*[@id=\"transfer\"]/div/div/form/div/div/div[5]/button");
	 By CarBtn = By.xpath("//a[contains(text(),'Transfer')]");
	    By PickUp = By.xpath("//div[@id='carlocations_chosen']");
	    By PickUpTime = By.xpath("//div[@id='transfer']//div[3]//div[1]//div[1]//div[2]//div[1]//div[2]");
	    By DropTime = By.xpath("//div[@id='transfer']//div[4]//div[1]//div[1]//div[2]//div[1]//div[2]");
	    By Cookie = By.xpath("//button[@class='cc-btn cc-dismiss']");
	    By Submitcar = By.xpath("//div[@class='col-md-2 col-xs-12']//button[@class='btn-primary btn btn-block'][contains(text(),'Search')]");
	    By Details = By.xpath("//a[@class='btn btn-primary btn-sm btn-wide']");
	    By BookNow = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/aside[1]/form[1]/div[1]/div[2]/button[1]");
	//tour booking page
	By tourbook=By.xpath("//*[@id=\"body-section\"]/div[3]/div[2]/div[2]/div/form/div[4]/button");
	By tourfirstname=By.xpath("//input[@placeholder='First Name']");
	By tourlastname=By.xpath("//input[@placeholder='Last Name']");
	By touremail=By.xpath("//div[@class='col-md-5 col-xs-12']//input[@placeholder='Email']");
	By tourcon=By.xpath("//input[@placeholder='Confirm Email']");
	By tourphone=By.xpath("//input[@placeholder='Contact Number']");
	By touradd=By.xpath("//input[@placeholder='Address']");
	By tourcoun=By.xpath("//input[@class='select2-input']");
	By tourci=By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]/div");
    //launch the Browser
    public void launchbrowser() throws Exception  {
    	
    	PropertyConfigurator.configure("C:\\New folder\\PHP_Automation_testscript\\Log4J.properties");
    	System.setProperty("webdriver.chrome.driver","C:\\Selenium Jar\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    FileInputStream f=new FileInputStream("C:\\New folder\\PHP_Automation_testscript\\Base.properties");
		    pro.load(f);
		   driver.get(pro.getProperty("URL"));
		 
			
	
	
	}


	
}
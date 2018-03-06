package Buyer;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleSearch {
	
	public static void main(String[] args) throws InterruptedException, AWTException{
	


	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.spicejet.com/");
	
	driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	
	/*

	Select select = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
	List<WebElement> options = select.getOptions();
	
	
	System.out.println(options.size());
	
	for(int i=0; i<options.size(); i++){
		
		System.out.println(options.get(i).getText());
	
		
	
		*/
	
	System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());
	driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).click();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());
	
	/*WebElement element = driver.findElement(By.xpath("//div[@class='row1 padding-bottom-3']/div[@id='SeniorCitizenDiv']/parent::div"));
	System.out.println(element.getAttribute("innerText"));
	Thread.sleep(2000);
	//element.click();

	/*
	
	
	driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[3]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//*[@id='dropdownGroup1']/div/ul[3]/li[3]/a)[2]")).click();	
	Thread.sleep(3000);
	
	*/
	
	
	
	
	
	
	
	}
	
	
     	}
	
	
	


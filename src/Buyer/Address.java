package Buyer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Address extends BuyerLogin{
	
	@BeforeTest
	public void openAddressPage() throws InterruptedException{
		
		aLogin();
	
	}
	
	@Test(priority=1)
	public void loginApplication(){
		
		System.out.println("Login into the Application");
	}
	
	@Test(priority=2)
	public void addAddress() throws InterruptedException{
	
	WebElement element = driver.findElement(By.xpath("html/body/header/div[2]/div[2]/div[3]/ul/li[3]/a"));
	
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	
	
	
	driver.findElement(By.xpath("html/body/header/div[2]/div[2]/div[3]/ul/li[3]/ul/li[3]/a")).click();
	
	Thread.sleep(2000);
	

	
	}
	

}
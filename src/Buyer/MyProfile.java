package Buyer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyProfile extends BuyerLogin{
	

			
	
	@Test(priority=3)
	public void editProfile() throws InterruptedException{
		
		WebElement element = driver.findElement(By.xpath("html/body/header/div[2]/div[2]/div[3]/ul/li[3]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		
		
		driver.findElement(By.xpath("html/body/header/div[2]/div[2]/div[3]/ul/li[3]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
	}
	

}

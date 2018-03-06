package Buyer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class formMethods {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/flights");
		System.out.println("Before clicking on Multi City");
		System.out.println(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
		
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
		driver.findElement(By.xpath(".//*[@id='multicity']/label")).click();
		System.out.println("After clicking on Multi City");
		Assert.assertFalse((driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed()));
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
		//System.out.println(driver.findElement(By.xpath(".//*[@id='muticity']/label")).isDisplayed());
		
		int count = driver.findElements(By.xpath(".//*[@id='multicity']/label")).size();
		
		if(count == 0){
			
			System.out.println("Verified");
		}else
			
			System.out.println("Not Verified");
		
	}

}

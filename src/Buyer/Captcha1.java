package Buyer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Captcha1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/recaptcha/api2/demo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		
		
		 int size = driver.findElements(By.tagName("iframe")).size();
		    System.out.println("Total Frames --" + size);
	               
			// prints the total number of frames 
			driver.switchTo().frame(0); // Switching the Outer Frame    		
		    System.out.println (driver.findElement(By.cssSelector(".recaptcha-checkbox-checkmark")).isDisplayed());
		    driver.findElement(By.cssSelector(".recaptcha-checkbox-checkmark")).click();
		    Thread.sleep(2000);
		   driver.switchTo().frame(0);
		    System.out.println (driver.findElement(By.xpath("//*[@id='rc-imageselect']/div[3]/div[2]")).isDisplayed());
			 
		    
		    //driver.switchTo().defaultContent();
			//Printing the text in outer frame
		    
			int size1= driver.findElements(By.tagName("iframe")).size();
		    // prints the total number of frames inside outer frame           
	                                                                                                          
		   System.out.println("Total Frames --" + size1);
		   // driver.switchTo().frame(0); // Switching to innerframe
		    //System.out.println(driver.findElement(By.xpath(".//*[@id='recaptcha-reload-button']")).isDisplayed());
		    //driver.findElement(By.linkText("our help page")).click();
		    //driver.findElement(By.xpath("//*[@id='rc-imageselect']/div[3]/div[2]")).click();
		    Thread.sleep(2000);
		    
	}

}

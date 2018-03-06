package Buyer;

import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DecodePassword {
	
	public static String decode(String encodedPassword){
		
		byte[] valueDecoded = Base64.decodeBase64(encodedPassword);
		//System.out.println("Decoded value is " + new String(valueDecoded));
		return new String(valueDecoded);
	}

	public static void main(String[] args) throws InterruptedException {

		

		WebDriver driver = new FirefoxDriver();
		driver.get("https://beta.vendorsdepot.com/");
		
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='topmenu-nav']/ul/li[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='topmenu-nav']/ul/li[3]/ul/li[1]/a")).click();
		
		System.out.println("Open the Login Screen");
		
		WebElement element1 = driver.findElement(By.xpath("html/body/header/div[2]/div[1]/div[1]/a/img"));
		String tooltip = element1.getAttribute("title");
		System.out.println(tooltip);
		
		WebElement elemt=driver.findElement(By.id("email"));
		elemt.sendKeys("KenWilliamson");
		String lastname=elemt.getCssValue("//*[@id='email']");
		System.out.println(lastname);
		System.out.println(driver.findElement(By.id("email")).getText());
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys(decode("aW5kaWFuaWM="));
		
		
//		byte[]   bytesEncoded = Base64.encodeBase64("indianic" .getBytes());
//		System.out.println("ecncoded value is " + new String(bytesEncoded ));
//
//		// Decode data on other side, by processing encoded data
//		byte[] valueDecoded= Base64.decodeBase64(bytesEncoded );
//		System.out.println("Decoded value is " + new String(valueDecoded));
		
		driver.findElement(By.xpath(".//*[@id='signInForm']/div[5]/button")).click();
		Thread.sleep(2000);
		
		//System.out.println(decode("aW5kaWFuaWM="));
//		
	}

}

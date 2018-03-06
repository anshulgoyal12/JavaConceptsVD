package Buyer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://beta.vendorsdepot.com/");
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='srch-term']"))).click().keyDown(Keys.SHIFT).sendKeys("chair").doubleClick().build().perform();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath(".//*[@id='search_common']/div"));
		action.moveToElement(element).contextClick().build().perform();
		Thread.sleep(2000);
	}

}

package Buyer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

	public class BuyerLogin {
	
	public static WebDriver driver;

	@BeforeSuite
	public static void openBrowser() throws InterruptedException{
		
		driver = new FirefoxDriver();
		driver.get("https://beta.vendorsdepot.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		System.out.println("Open the Browser");
	
	   }
	
		
		public void aLogin() throws InterruptedException{
		

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
		driver.findElement(By.id("password")).sendKeys("indianic");
		driver.findElement(By.xpath(".//*[@id='signInForm']/div[5]/button")).click();
		Thread.sleep(2000);
			
	}
		
		@AfterSuite
		public static void closeBrowser(){
			
			driver.quit();
			System.out.println("Closing the Browser");
		}
		
	
}
	
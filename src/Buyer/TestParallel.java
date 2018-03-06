package Buyer;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestParallel {

	public static void main(String[] args) throws MalformedURLException, InterruptedException{

		WebDriver driver;
		String nodeURL;
		String baseUrl;
		
		//nodeURL="http://10.2.6.53:5566/wd/hub";
		
		DesiredCapabilities capabilites =  DesiredCapabilities.firefox();
		capabilites.setCapability(FirefoxDriver.BINARY, new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
		
		driver = new RemoteWebDriver(new URL("http://10.2.6.53:5566/wd/hub"), capabilites);
		
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.get("https://beta.vendorsdepot.com/");
		
		System.out.println(driver.getTitle());
		
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
		
		//driver.get(baseUrl + "/");
		
	}

}

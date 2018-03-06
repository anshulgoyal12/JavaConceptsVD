package Buyer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SslCertificate {

	public static void main(String[] args) {
	
//		DesiredCapabilities ch = DesiredCapabilities.chrome();
//		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
	//	ChromeOptions c = new ChromeOptions();
		
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\indianic\\Desktop\\Selenium\\chromedriver_win32 (4))\\chromedriver.exe");
		
		
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Desired capabilities=
		//general chrome profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//Belows to your local browser
		ChromeOptions c= new ChromeOptions();
		
		//System.setProperty("webdriver.chrome.driver", "");
		//WebDriver driver=new ChromeDriver(c);
		
		
		
		
	}

}

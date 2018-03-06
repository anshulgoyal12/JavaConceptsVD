package Buyer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestBase {
	
	WebDriver driver = null;
	
	@Test
	public void doLogin() throws IOException{
		
		
		
		Properties pro = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Workspace\\Maven\\Vendors_Depot\\src\\dataDriven.properties");
		
		pro.load(fis);
		
		System.out.println(pro.getProperty("username"));
		System.out.println(pro.getProperty("Password"));
		System.out.println(pro.getProperty("Url"));
		
		if(pro.getProperty("Browser").equals("Firefox"))
			
		{
			
			driver = new FirefoxDriver();
			
		} 
		
		else if(pro.getProperty("Browser").equals("chrome"))
			
			{
				
				driver = new ChromeDriver();
				
			}
		
		else
			
			{
				
				driver = new InternetExplorerDriver();
			}
		
		driver.get(pro.getProperty("Url"));
		
		}
		
		
		
		
}



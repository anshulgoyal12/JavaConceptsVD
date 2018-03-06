package Buyer;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
	//	Select select = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
		//select.selectByVisibleText("3");
		
		/*List<WebElement> element = select.getOptions();
		
		System.out.println("The Adults dropdown size is :"+element.size());
		System.out.println();
		
		for(int i=0;i<element.size();i++){
			
			System.out.println(element.get(i).getAttribute("value"));
			
		}*/
		/*WebElement element = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult"));
		List<WebElement> options = element.findElements(By.tagName("option"));
		System.out.println(options.size());
		
		for(int i=0; i<options.size();i++){
			
			System.out.println(options.get(i).getText());
			
		}*/
		
	//	WebElement links = driver.findElement(By.xpath("html/body/form/div[7]/div[2]/div[1]"));
		List<WebElement> element = driver.findElements(By.tagName("a"));
		System.out.println(element.size());
		
		for(int i=0; i<element.size();i++){
			
			System.out.println(element.get(i).getText());
		}
		
		driver.quit();
	}

}

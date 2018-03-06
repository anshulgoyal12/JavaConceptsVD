package Buyer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksCount {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://beta.vendorsdepot.com/");
		driver.manage().timeouts().implicitlyWait(12L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String BeforeClicking = null;
		String AfterClicking;
		
		WebElement element = driver.findElement(By.cssSelector("footer>div>div>.footer-nav"));
		System.out.println(element.findElements(By.tagName("a")).size());
		int count = element.findElements(By.tagName("a")).size();
		
		
		
		for(int i = 0; i<count; i++){
			
			//System.out.println(element.findElements(By.tagName("a")).get(i).getText());
			
			if(element.findElements(By.tagName("a")).get(i).getText().contains("Buying Guides")){
				
				BeforeClicking =  driver.getTitle();
				
				element.findElements(By.tagName("a")).get(i).click();
				break;
			}
			
			
			
			//System.out.println(element.findElements(By.tagName("a")).get(i).getText());
		}
		
		
		AfterClicking = driver.getTitle();
		
		if(BeforeClicking!=AfterClicking){
			
			//boolean ABC = driver.findElement(By.xpath("//div[@class='full-width']/h1")).isDisplayed();
			if(driver.getPageSource().contains("Buying")){
				
				System.out.println("Pass");	
			}
			
		}else{
			
			System.out.println("Fail");
		}
		
		//driver.findElement(By.cssSelector(".nav-block.customer-service>ul>li>a[title='Buying Guides']")).click();
		
			
	}
}

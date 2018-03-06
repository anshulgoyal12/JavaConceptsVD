package Buyer;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderPresentFuture {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		driver.findElement(By.xpath(".//*[@id='datepicker']")).click();
		
		
		
	for(; ;){
		
		String a = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div")).getText();
	
	//To select future date then enter future date in if conditions and enter next button xpath to click.
		 if(a.equals("December 2017")){
	 break;
		 }
		 driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]")).click();
		
		 // To select past date then enter past date in if conditions and enter previous button xpath to click
		 /*if(a.equals("December 2016")){
			 break;}
		 driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]")).click();
		 */
   }
		
	
		List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
		int count = dates.size();
		
		for(int i=0; i<count; i++){
			
			String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
			if(text.equalsIgnoreCase("26")){
				
				driver.findElements(By.className("ui-state-default")).get(i).click();
				break;
			}
				
		}
	}

}

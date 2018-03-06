package Buyer;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderHandles {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		driver.findElement(By.xpath(".//*[@id='datepicker']")).click();
		
		
		//String b;
	for(; ;){
		
		String a = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div")).getText();
		
		 
	//	driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]")).click();
		
	  
	   // b =  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div")).getText();
	    
	 //   .//*[@id='ui-datepicker-div']/div/div
		//System.out.println(b);
		 
		 if(a.equals("November 2019")){
			 //driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			
			 break;
			 
   }
		 driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]")).click();
   
   }
		
		/*//driver.findElement(By.cssSelector(".//*[@id='ui-datepicker-div']/div/div/span[@class='ui-datepicker-month' and 'ui-datepicker-year']")).getText().contains("April");
		
		while(!driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[@class='ui-datepicker-month']")).getText().contains("April"))
		{
			
			driver.findElement(By.cssSelector("div[id='ui-datepicker-div']>div>a[title='Next']")).click();
			if(driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[@class='ui-datepicker-year']")).getText().contains("2019")){
				
				driver.findElement(By.cssSelector("div[id='ui-datepicker-div']>div>a[title='Next']")).click();
				
			}
			
			
		}*/
		List<WebElement> element = driver.findElements(By.className("ui-state-default"));
		int count = driver.findElements(By.className("ui-state-default")).size();
		
		for(int i=0; i<count; i++){
			
			String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
			if(text.equalsIgnoreCase("27")){
				
				driver.findElements(By.className("ui-state-default")).get(i).click();
				break;
			}
				
		}
	}

}

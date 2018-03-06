package Buyer;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class Calenders {
		
		public static void main(String[] args) throws InterruptedException {
			
	
			
			WebDriver driver = new FirefoxDriver();
			driver.get("https://jqueryui.com/datepicker/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
			
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
			
			driver.findElement(By.xpath(".//*[@id='datepicker']")).click();
			
			String a = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div")).getText();
			
			String b;
		for(; ;){
			 
			driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]")).click();
			
		  
		    b =  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div")).getText();
		    
		 //   .//*[@id='ui-datepicker-div']/div/div
			//System.out.println(b);
			a=b;
			 if(a.equals("October 2019")){
				 driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
				 break;
				 
	   }
		   
	   
	   }
	  

			  WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));
				
				List<WebElement> rows=dateWidget.findElements(By.tagName("tr"));

				List<WebElement> columns=dateWidget.findElements(By.tagName("td"));
				  
				  for (WebElement cell: columns){
				   //Select 13th Date 
				   if (cell.getText().equals("30")){
				   cell.findElement(By.linkText("30")).click();
				   break;
					

		}
		
		

	}
System.out.println("Date has been selected successfully");
		}

	}

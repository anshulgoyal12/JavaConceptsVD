package Buyer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableHandle {
	
	public static void main(String args[]){
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18961/ind-vs-nz-3rd-t20i-new-zealand-tour-of-india-2017");
		
		
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		//int rowcount = table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms")).size();
		int count = table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms")).size();
		
		for(int i=0; i<count; i++){
			
			System.out.println(table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms")).get(i).getText());
			
		}
		
		//System.out.println(driver.findElement(By.xpath("//div[text()='Extras']")).getText());
		//System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/div")).getText());
		//System.out.println(driver.findElement(By.xpath("//div[text()='Total']")).getText());
		//System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
	}

}

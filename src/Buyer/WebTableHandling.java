package Buyer;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTableHandling {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/17840/rsa-vs-ban-1st-t20i-bangladesh-tour-of-south-africa-2017");
		
		
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	//	WindowsUtils.killByName("Notepad.exe");
		
		
		WebDriverWait wait = new WebDriverWait(driver,30);

		
		WebElement table = driver.findElement(By.xpath("//*[@id='innings_1']/div[1]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='innings_1']/div[1]")));
		List<WebElement> rows = table.findElements(By.xpath("div"));
		System.out.println("No. of counts are : "+rows.size());
		System.out.println();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\indianic\\Desktop\\Selenium\\Screenshot.png"));
		
		
		
		int i=0;
		for(WebElement eachrow : rows){
			
			List<WebElement> eachcolumn = eachrow.findElements(By.xpath("div"));
			i++;
			System.out.println("No of Columns in "+i+"th row are "+eachcolumn.size());
			System.out.println();
			
			for(WebElement text : eachcolumn){
				
				
				//System.out.println("\t");
				System.out.println(text.getText());
				//System.out.println();
				
		
			}
			
			//System.out.println("");
			System.out.println("------------------------"); 
			
			
			
		}
		
		
	}
	
	
	
}
	



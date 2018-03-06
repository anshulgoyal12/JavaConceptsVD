package Buyer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Captcha {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com/recaptcha/api2/demo");
		
		driver.get("https://www.google.com/recaptcha/api2/demo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		
		/*WebDriverWait wait = new WebDriverWait(driver, 10L);
		driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).sendKeys("asa");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul")));
		
		driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[4]/p")).click();
		*/
		
		
		int number = findFrameNumber(driver, By.cssSelector(".recaptcha-checkbox-checkmark"));
		driver.switchTo().frame(number);
		driver.findElement(By.cssSelector(".recaptcha-checkbox-checkmark")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		int number1 = findFrameNumber(driver, By.cssSelector("#recaptcha-help-button"));
		driver.switchTo().frame(number1);
		driver.findElement(By.cssSelector("#recaptcha-help-button")).click();
			
	}
	
	
	public static int findFrameNumber(WebDriver driver, By by){
		
		int i;
		int element = driver.findElements(By.tagName("iframe")).size();
		System.out.println(element);
		
		for(i = 0; i<element; i++){
			
			driver.switchTo().frame(i);

			
			int count = driver.findElements(by).size();
			
			if(count>0){
				
				break;
			}
			else{
				
				System.out.println("Not Present Element into the Website " +i);
				driver.switchTo().defaultContent();
				
			}
			
		}
	
		driver.switchTo().defaultContent();
		return i;
		

	}

}

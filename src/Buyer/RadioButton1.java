package Buyer;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
	/*	List<WebElement> element = driver.findElements(By.tagName("iframe"));
		System.out.println(element.size());
	*/	//driver.switchTo().frame(1);
		
		//driver.findElement(By.xpath("html/body/form/input[1]")).click();
		
		int radio_button = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0;i<radio_button;i++){
			
			//driver.findElements(By.xpath("//input[@name='group1']")).get(1).click();
			
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if (text.equals("Cheese")){
				
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
			
		}
		
		//System.out.println(radio_button.get(1).getAttribute("value"));
		
	//	System.out.println(radio_button.get(1).getAttribute("checked"));
		
	//	radio_button.get(1).click();
		
	//	System.out.println(radio_button.get(1).getAttribute("checked"));

	}

}

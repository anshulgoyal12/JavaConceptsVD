package Buyer;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {
	

	public static void main(String[] args) throws InterruptedException, AWTException{
	


	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.echoecho.com/htmlforms10.htm");
	
   List<WebElement> radio = driver.findElements(By.cssSelector(".table5>input[name='group1']"));
   
   System.out.println(radio.size());
   
   for(int i=0; i<radio.size(); i++){
	   
	   System.out.println(driver.findElements(By.cssSelector(".table5>input[name='group1']")).get(i).getAttribute("value"));
	   //driver.findElements(By.cssSelector(".table5>input[name='group1']")).get(0).click();
	
	   String value = driver.findElements(By.cssSelector(".table5>input[name='group1']")).get(i).getAttribute("value");
	   if(value.equals("Cheese")){
		   
		   driver.findElements(By.cssSelector(".table5>input[name='group1']")).get(i).click();
		   
		   
	   }
   }
   
   
   
	   
	  /* if{
	   radio.get(i).getText().contains("Milk");
	   radio.get(i).click();
	   break;
   }}*/
	


	}
	
}

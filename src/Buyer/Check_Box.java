package Buyer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_Box {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com/");
		
		driver.manage().window().maximize();
		
		//WebElement check_box = driver.findElement(By.xpath("html/body/form/div[6]/div[2]/div/div[5]/div[2]/div[1]/div[2]/div[3]/div/div[12]"));
		
	//	List<WebElement> elements = check_box.findElements(By.tagName("div"));
		//System.out.println(elements.size());
		
		//for(int i=0;i<elements.size();i++){
			
			/*

*/
		
		System.out.println(driver.findElement(By.xpath("html/body/form/div[6]/div[2]/div/div[5]/div[2]/div[1]/div[2]/div[3]/div/div[12]/div[1]/input")).isSelected());
		driver.findElement(By.xpath("html/body/form/div[6]/div[2]/div/div[5]/div[2]/div[1]/div[2]/div[3]/div/div[12]/div[1]/input")).click();
		System.out.println(driver.findElement(By.xpath("html/body/form/div[6]/div[2]/div/div[5]/div[2]/div[1]/div[2]/div[3]/div/div[12]/div[1]/input")).isSelected());
			
		}
				
	
		
	}
	



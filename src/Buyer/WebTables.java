package Buyer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/17840/rsa-vs-ban-1st-t20i-bangladesh-tour-of-south-africa-2017");
		
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//*[@id='innings_1']/div[1]/div[3]/div[1]
		
		String w_start = "//*[@id='innings_1']/div[1]/div[";
		String w_end = "]/div[1]";
		
		Thread.sleep(30L);
		
		int rowNum=1;
		for(int i =3; i<=8; i=i+1){
			String x = driver.findElement(By.xpath(w_start + i + w_end)).getText();
			rowNum++;
			System.out.println(x);
			
		}
		
		System.out.println("Row Count is "+rowNum);
		
		String wc_start = "//*[@id='innings_1']/div[1]/div[";
		String wc_end = "]";
		
		
		int colNum=1;
		for(int j =1; j<=6; j=j+1){
			String x = driver.findElement(By.xpath(wc_start + j + wc_end)).getText();
			colNum++;
			System.out.println(x);
			
		}
		
		System.out.println("Column Count is "+colNum);
		
		System.out.println("----------------------------");
		
		String xpth_start = "//*[@id='innings_1']/div[1]/div[";
		String xpth_mid = "]/div[";
		String xpth_end = "]";
		
		for(int rows = 1; rows<=rowNum; rows++){
			
			for(int cols = 1; cols<=colNum; cols++){
				
				String y = driver.findElement(By.xpath(xpth_start+rows+xpth_mid+cols+xpth_end)).getText();
				
				System.out.println(y+ "\t\t" );
				
				
			}
				
		}
		
	}

}

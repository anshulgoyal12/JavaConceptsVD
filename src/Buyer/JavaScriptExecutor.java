package Buyer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18958/ind-vs-nz-3rd-odi-new-zealand-tour-of-india-2017");
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

		WebElement element = driver.findElement(By.xpath(".//*[@id='teamDropDown']/a"));

		//Type cast the driver instance to 'JavascriptExecutor'.*/
		
		
		
	    // WebElement element = driver.findElement(By.xpath(Locator)); 
        JavascriptExecutor js = (JavascriptExecutor) driver; 
         //js.executeScript("arguments[0].click()", element); 
         
       //  ((JavascriptExecutor)driver).executeScript(javaScript, element);
         
         
         

		/*//Performs the mouseover operation using javascript.*/
         js.executeScript("arguments[0].onmouseover()", element); 
		
		//js.executeScript("window.scrollBy(0,500)");
		
		//string sText =  js.executeScript("return document.title;").toString();
		
		//Js.executeScript("alert('hello world')");
		
		//js.executeScript("arguments[0].click();", element);
		
		//driver.get("http://demo.guru99.com/V4/");	
		
		
        //WebElement button =driver.findElement(By.name("btnLogin"));			
        		
        //Login to Guru99 		
        //driver.findElement(By.name("uid")).sendKeys("mngr34926");					
        //driver.findElement(By.name("password")).sendKeys("amUpenu");					
        		
        //Perform Click on LOGIN button using JavascriptExecutor		
     // js.executeScript("arguments[0].click();", button);
                                
        //To generate Alert window using JavascriptExecutor. Display the alert message 			
        	//js.executeScript("alert('Welcome to Guru99');");   
        


        //js.executeScript("window.location = 'http://yahoo.com'");
        
        
        
        //js.executeScript("history.go(0)");
        
     //   String text = js.executeScript("return document.documentElement.innerText;").toString();
       // System.out.println(text);
        
        //String sText =  js.executeScript("return document.title;").toString();
    //    System.out.println(sText);
        
       //System.out.println(js.executeScript("return window.innerHeight"));

      // System.out.println(js.executeScript("return window.innerWidth"));
       
    //  System.out.println(js.executeScript("var btn=document.createElement('BUTTON');"
    		   
                   //  + "document.body.appendChild(btn)"));

      //js.executeScript("document.frames.length;");

	}

}

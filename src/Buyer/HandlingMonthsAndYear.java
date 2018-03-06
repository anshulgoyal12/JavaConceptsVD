	package Buyer;

	import java.util.Calendar;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class HandlingMonthsAndYear {
		
		
		public static WebDriver driver;
		
		static int targetDay = 0,
				   targetMonth = 0,
				   targetYear = 0;
		
		static int CurrentDay = 0,
				   CurrentMonth = 0,
				   CurrentYear = 0;
		
		static int jumpMonthsBy = 0;
		
		//static int jumpYearBy = 0;
		
		static boolean increment = true;
		//static boolean increment1 = true;		   

		public static void main(String[] args) throws InterruptedException {
			
			String dateToSet = "20/05/2018";
			getCurrentDateMonthYear();
			System.out.println(CurrentDay+"     "+CurrentMonth+"     "+CurrentYear);
			
			getTargetDayMonthYear(dateToSet);
			System.out.println(targetDay+"     "+targetMonth+"     "+targetYear);
			
			CalculateHowManyMonthsToJump();
			System.out.println(jumpMonthsBy);
			
			//CalculateHowManyYearsToJump();
			//System.out.println(jumpYearBy);
			
			System.out.println(increment);
			//System.out.println(increment1);
			
			driver = new FirefoxDriver();
			driver.get("https://jqueryui.com/datepicker/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
			
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
			
			driver.findElement(By.xpath(".//*[@id='datepicker']")).click();
				
			/*for (int j = 0; j<jumpYearBy; j++){
				
				if(increment1){
					
					driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]")).click();
					
				}else{
					
					driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]")).click();
					//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
				
					//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[4]/a")).click();
			break;		
				}
				
				
			}*/
			
			
			for(int i = 0; i<jumpMonthsBy; i++){
				
				if(increment){
					
					driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]")).click();
					
				}else{
					
					driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]")).click();
					//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
					//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[4]/a")).click();
				}
				
				Thread.sleep(1000);
				
			}
			
		//	}
				
				driver.findElement(By.linkText(Integer.toString(targetDay))).click();
			
				driver.quit();
			}
			
			
			
			
		
		public static void getCurrentDateMonthYear(){
			
			Calendar cal = Calendar.getInstance();
			CurrentDay = cal.get(Calendar.DAY_OF_MONTH);
			CurrentMonth = cal.get(Calendar.MONTH)+1;
			CurrentYear = cal.get(Calendar.YEAR);
			
			
			
		}
		
		public static void getTargetDayMonthYear(String dateString){
			
			int firstIndex = dateString.indexOf("/");
			int lastIndex = dateString.lastIndexOf("/");
			
			String day = dateString.substring(0, firstIndex);
			targetDay = Integer.parseInt(day);
			
			String month = dateString.substring(firstIndex+1, lastIndex);
			targetMonth = Integer.parseInt(month);
			
			String year = dateString.substring(lastIndex+1, dateString.length());
			targetYear = Integer.parseInt(year);
			
		}
		
		public static void CalculateHowManyMonthsToJump(){
			
			
			if(targetYear ==CurrentYear){
				if ((targetMonth - CurrentMonth) > 0) {

				jumpMonthsBy = (targetMonth - CurrentMonth);

				} else {

				jumpMonthsBy = (CurrentMonth - targetMonth);
				increment = false;
				}
				}else if(targetYear > CurrentYear){

				int i=0;
				while(driver.findElement(By.cssSelector(".ui-datepicker-year")).getText().equals("targetYear")){

				driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
				try {
				Thread.sleep(500);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				i++;


				}
		}
		
		/*public static void CalculateHowManyYearsToJump(){
			
			if((targetYear-CurrentYear) >= 0){
				
				jumpYearBy = (targetYear-CurrentYear);
				
			}else{
				
				jumpYearBy = (CurrentYear-targetYear);
				increment1 = false;
		*/		
			//}
			
		//}
		
		

		}
		
	}

	



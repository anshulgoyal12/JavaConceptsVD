package Buyer;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Listeners1 {
	
	
	
	
	
	@Test(priority=3)
	public void testProfile(){
		
		
	}
	
	@Test(priority=4)
	public void testUserReg(){
		
		
		Assert.fail();
	}
	
	@Test(priority=5)
	public void testCart(){
		
		
		throw new SkipException("Skipping the Application");
	}

}

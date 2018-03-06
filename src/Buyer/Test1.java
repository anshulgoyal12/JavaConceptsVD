package Buyer;

import java.io.IOException;

import org.testng.annotations.Test;

public class Test1 extends TestBase{
	
	@Test
	public void testProfile() throws IOException{
		
		doLogin();
		
		System.out.println("Test the Profile");
	}
	
	@Test
	public void testProfile1() throws IOException{
		
		doLogin();
		
		System.out.println("Test the Profile1");
	}

}

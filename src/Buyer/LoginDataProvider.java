package Buyer;

import org.testng.annotations.Test;

public class LoginDataProvider {
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="dp1")
	public void testLogin(String username, String Password){

		System.out.println(username+"-"+Password);
		
	}
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="dp1")
	public void testUserReg(String firstName, String lastName, String Email){

		System.out.println(firstName+"-"+lastName+"-"+Email);
		
	}

}

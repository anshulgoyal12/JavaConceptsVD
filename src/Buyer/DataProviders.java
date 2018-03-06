package Buyer;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name="dp1")
	public static Object[][] getData(Method m){
		
		Object[][] data = null;
		
		if(m.getName().equals("testLogin")){
		
		data = new Object[2][2];
		
		data[0][0] = "Raman";
		data[0][1] = "ASDFG";
		
		data[1][0] = "Rahul";
		data[1][1] = "ZXCVB";
		
 	}else if (m.getName().equals("testUserReg")){
 		
 		data = new Object[2][3];
		
		data[0][0] = "Raman";
		data[0][1] = "Arora";
		data[0][2] = "raman@gmail.com";
		
		data[1][0] = "Rahul";
		data[1][1] = "Shetty";
		data[1][2] = "rahul@gmail.com";
 	}
		
		return data;
	
	}
	
}

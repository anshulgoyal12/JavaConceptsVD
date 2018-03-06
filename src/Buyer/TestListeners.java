package Buyer;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListeners extends TestListenerAdapter{
	
	public void onTestFailure(ITestResult tr){
		
		System.out.println("Failing the test: "+tr.getName());

	}
	
	public void onTestSkipped(ITestResult tr){
		
		System.out.println("Skipping the test: "+tr.getName());

	}
	
	public void onTestSuccess(ITestResult tr){
		
		System.out.println("Success the test: "+tr.getName());

	}

}

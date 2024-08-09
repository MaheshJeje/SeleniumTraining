package java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class PS3 {
	
	@BeforeMethod
	public void beforeTest() {
		System.out.println("Run me first...");
	}
	
	@AfterMethod
	public void afterTest() {
		System.out.println("Run me last...");
	}

}

package testNG;

import org.testng.annotations.*;

public class TestNGProgram1 {
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod is executed.");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod is executed.");
	}
	
	@BeforeTest
	public void Test_BeforeTest() {
		System.out.println("BeforeTest is executed.");
	}
	
	@AfterTest
	public void Test_AfterTest() {
		System.out.println("AfterTest is executed.");
	}

	//Test Methods
	@Test(priority = 1, description = "This is login test.")
	public void Test_A() {
		System.out.println("Test A executed...");
	}
	
	@Test(priority = 2, description = "This is logout test.")
	public void Test_B() {
		System.out.println("Test B executed...");
	}
}

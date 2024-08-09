package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTestFive {
	
	@BeforeTest
	public void firstBeforeTest() {
		System.out.println("My first before test executed...");
	}
	
	@AfterTest
	public void firstAfterTest() {
		System.out.println("My first after text executed...");
	}
	
	@BeforeMethod
	public void firstBeforeMethod() {
		System.out.println("My first before method executed...");
	}
	
	@AfterMethod
	public void firstAfterMethod() {
		System.out.println("My first after method executed...");
	}
	
	@Test
	public void firstTest() {
		System.out.println("My first test case executed...");
	}
	
	@Test
	public void secondTest() {
		System.out.println("My second test case executed...");
	}

	@Test
	public void thirdTest() {
		System.out.println("My third test case executed...");
	}
}

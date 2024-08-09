package testNG;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(priority = 1, groups = "Regression")
	public void aTest() {
		System.out.println("Test A executed...");		
	}
	
	@Test(priority = 2, groups = "Sanity")
	public void bTest() {
		System.out.println("Test B executed...");		
	}
	
	@Test(priority = 3, groups = {"Regression", "Sanity"})
	public void cTest() {
		System.out.println("Test C executed...");
	}
	
	@Test(priority = 4, groups = "Regression")
	public void dTest() {
		System.out.println("Test D executed...");
	}
}

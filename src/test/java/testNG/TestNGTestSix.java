package testNG;

import org.testng.annotations.Test;

public class TestNGTestSix {
	
	@Test (groups = "Sanity")
	public void testMethod1() {
		System.out.println("testMethod1()");
	}

	@Test (groups = {"Smoke", "Sanity"})
	public void testMethod2() {
		System.out.println("testMethod2()");
	}
}

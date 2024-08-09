package testNG;

import org.testng.annotations.Test;

public class Login {
	
	@Test(priority = 1, groups = "Regression")
	public void loginByEmail() {
		System.out.println("This is login by EMail...");
	}
	
	@Test(priority = 2, groups = "Sanity")
	public void loginByFacebook() {
		System.out.println("This is login by Facebook...");
	}
	
	@Test(priority = 3, groups = "Regression")
	public void loginByTwitter() {
		System.out.println("This is login by Twitter...");
	}
}

package testNG;

import org.testng.annotations.Test;

public class Payment {
	@Test(groups = "Regression")
	public void paymentInDoller() {
		System.out.println("This is payment by doller method...");
	}
	
	@Test(groups = "Sanity")
	public void paymentInRupees() {
		System.out.println("This is payment by rupees method...");
	}

}

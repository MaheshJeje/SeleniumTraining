package testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	
	Boolean datasetup = false;
	
	@Test(enabled = false)
	public void methodA() {
		System.out.println("methodA() : Skipping the test as it's not completed.");
	}
	
	@Test
	public void methodB() {
		System.out.println("methodB() : Skipping the test forcefully.");
		throw new SkipException("Skping this test forcefully.");
	}
	
	@Test
	public void methodC() {
		if(datasetup==true) {
			System.out.println("Executed based on datasetup completed...");
		}
		else {
			System.out.println("Skipped as datasetup failed...");
		}
	}
}

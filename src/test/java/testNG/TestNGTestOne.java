package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTestOne {

	public String browserPath = System.getProperty("user.dir")+"\\browser-driver\\geckodriver.exe";
	public WebDriver driver;
	
	@BeforeTest
	public void setBrowser() {
		System.setProperty("webdriver.gecko.driver", browserPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
	}
	
	@AfterTest
	public void endSession() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void verifyHomePage() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}

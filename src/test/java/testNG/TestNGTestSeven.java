package testNG;

import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LaunchGoogleListener.class)

public class TestNGTestSeven {
	WebDriver driver;
	JavascriptExecutor js;
	String launchPageHeading = "//*[text()='Guru99 Bank']";
	String element_username = "//*[@name='uid']", 
			element_password = "//*[@name='password']", 
			element_signin = "//*[@name='btnLogin']",
			element_logout = "//*[text()='Log out']";
	String value_username = "mngr494347", value_password = "hApAhud";
	String managerid = "//*[contains(text(), 'Manger Id')]";
	
	@Test(groups = {"Bonding","StrongTies"}, priority = 0)
	public void openBrowser() throws Exception {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//browser-driver//geckodriver.exe");
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");
	}
	
	@Test(groups = {"Bonding"}, priority = 1)
	public void verifyHomePage() throws Exception {
		Thread.sleep(3000);
		boolean result = driver.findElement(By.xpath(launchPageHeading)).isDisplayed();
		Assert.assertTrue(result, "Home page heading is not dislayed...");
		System.out.println("Home page heading is displayed...");
	}
	
	@Test(groups = {"Bonding","StrongTies"}, priority = 2)
	public void enterCredentials() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath(element_username)).sendKeys(value_username);
		driver.findElement(By.xpath(element_password)).sendKeys(value_password);
		Thread.sleep(2000);
		driver.findElement(By.xpath(element_signin)).click();
	}
	
	@Test(groups = {"StrongTies"}, priority = 3)
	public void verifyLoggedinPage() throws Exception {
		Thread.sleep(2000);
		boolean result = driver.findElement(By.xpath(managerid)).isDisplayed();
		Assert.assertTrue(result, "Manager ID is not displayed...");
		System.out.println("Manager Id is displayed...");
	}
	
	@Test(groups = {"Bonding", "StrongTies"}, priority = 4)
	public void logoutUser() throws Exception {
		Thread.sleep(5000);
		WebElement logout = driver.findElement(By.xpath(element_logout));
		js.executeScript("arguments[0].scrollIntoView()", logout);
		logout.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	@Test(groups = {"Bonding","StrongTies"}, priority = 5)
	public void closeBrowser() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}
}

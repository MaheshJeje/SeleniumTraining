package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestNGTestTwo {
	String driverPath = System.getProperty("user.dir")+"//browser-driver//geckodriver.exe";
	String webURL = "https://demo.guru99.com/test/newtours/index.php";
	public WebDriver driver;
	public String expectedTitle = null;
	public String actualTitle = null;
	
	
	
	@BeforeTest
	public void lanuchBrowser() {
		System.out.println("Launching firfox browser...");
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(webURL);
	}

	@AfterTest
	public void closeBrowser() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}
	
	@BeforeMethod
	public void verifyHomePageTitle() throws Exception {
		Thread.sleep(5000);
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterMethod
	public void goBackToHomePage() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Home")).click();
	}
	
			
	@Test(priority = 0)
	public void register() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.linkText("REGISTER")).click();
		expectedTitle = "Register: Mercury Tours";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test (priority = 1)
	public void support() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.linkText("SUPPORT")).click();
		expectedTitle = "Under Construction: Mercury Tours";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}

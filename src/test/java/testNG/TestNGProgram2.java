package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGProgram2 {
	WebDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	
	@AfterTest
	public void closeApplication() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}
	
	@Test(priority = 1)
	public void verifyTitle() {
		String expectedTitle = "Register";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 2)
	public void verifyText() {
		String expectedText = "Automation Demo Site";
		String actualText = driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/h1")).getText();
		Assert.assertEquals(actualText, expectedText);
	}
}
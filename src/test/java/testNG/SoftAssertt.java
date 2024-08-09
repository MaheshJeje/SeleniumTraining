package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertt {
	@Test
	public void veriftTitle() throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		SoftAssert softassert = new SoftAssert();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		String expectedTitle = "Register";
		String expectedTextMsg = "Automation Demo Site";
		
		String actualTitle = driver.getTitle();
		String actualTextMsg = driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/h1")).getText();
		
		softassert.assertEquals(actualTitle, expectedTitle, "Title verification failed...");
		softassert.assertEquals(actualTextMsg, expectedTextMsg, "Text verification failed...");
		softassert.assertAll();
		
		Thread.sleep(5000);
		driver.close();
		
	}
}
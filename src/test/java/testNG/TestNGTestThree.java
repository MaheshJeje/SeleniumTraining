package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;



public class TestNGTestThree {
	public static void main(String a[]) throws Exception {
		String browserPath = System.getProperty("user.dir")+"//browser-driver//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", browserPath);
		String webPath = "https://www.google.com/";
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(webPath);
	
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Facebook", Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[1]/div[1]/div[2]/div/div/div/div/div/div[1]/a/div[1]/span")).click();
		Thread.sleep(5000);
		String expectedTitle = "Sign up for Facebook | Facebook";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		
	}
}

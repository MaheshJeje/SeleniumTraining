package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class submitForm {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/login.html");
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("passwd"));
		WebElement submit =  driver.findElement(By.id("SubmitLogin"));
		
		Thread.sleep(5000);
		
		email.sendKeys("abc.xyz@gmail.com");
		password.sendKeys("abc");
		Thread.sleep(2000);
		submit.click();;
		
		Thread.sleep(3000);
		driver.close();
	}
}
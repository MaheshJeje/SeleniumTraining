package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		System.out.println(driver.getTitle());
		
		WebElement elementUsername = driver.findElement(By.name("userName"));
		boolean username = elementUsername.isDisplayed();
		WebElement elementPassword = driver.findElement(By.name("password"));
		boolean password = elementPassword.isDisplayed();
		WebElement elementSubmit = driver.findElement(By.name("submit"));
		boolean submit= elementSubmit.isDisplayed();
		
		if(username == true && password == true && submit == true) {
			elementUsername.sendKeys("Chikku");
			elementPassword.sendKeys("Chikku");
			elementSubmit.click();
			System.out.println(driver.getTitle());
		}
		else {
			System.out.println("Webelement not displayed...");
		}
		
		Thread.sleep(5000);
		driver.close();
	}
}

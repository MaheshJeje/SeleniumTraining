package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverTest {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}

}

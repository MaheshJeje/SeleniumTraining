package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyDropDownOptions {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		WebElement days = driver.findElement(By.id("select-demo"));
		Select daysOptions = new Select(days);
		List<WebElement> options = daysOptions.getOptions();
		
		List originalList = new ArrayList();
		List tempList = new ArrayList();
		
		for(WebElement e : options) {
			originalList.add(e.getText());
			tempList.add(e.getText());
		}
		
		System.out.println(originalList);
		System.out.println(tempList);
		
		Collections.sort(tempList);
		
		System.out.println(tempList);
		

		Thread.sleep(5000);
		driver.close();
	}
}

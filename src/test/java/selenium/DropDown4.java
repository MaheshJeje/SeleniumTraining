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

import org.openqa.selenium.JavascriptExecutor;

public class DropDown4 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.xpath("//*[text()='Country:']"));
		js.executeScript("arguments[0].scrollIntoView();", country);
		
		WebElement dropdownCountry = driver.findElement(By.xpath("//*[@id='country']"));
		Select s = new Select(dropdownCountry);
		
		List<WebElement> listCountry = s.getOptions();
		
		List<String> originalList = new ArrayList<String>();
		List<String> tempList = new ArrayList<String>();
		
		
		for(WebElement e : listCountry) {
			originalList.add(e.getText());
			tempList.add(e.getText());
		}
		
		Collections.sort(tempList);
		
		System.out.println(originalList);
		System.out.println(tempList);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
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

public class DropDown {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='animals']"));
		dropdown.click();
		
		ArrayList<String> obtainedList = new ArrayList<String>(); 
		
		Select s = new Select(dropdown);
		List<WebElement> optionsElemment = s.getOptions();
		
		for(WebElement e : optionsElemment) {
			 obtainedList.add(e.getText());
		}
		System.out.println("Original List "+obtainedList);
		List tempList = new ArrayList(obtainedList);
		
		Collections.sort(tempList);
		System.out.println("Sorted List "+ tempList);
		
		if(obtainedList.equals(tempList)) {
			System.out.println("Webelements are sorted...");
		}
		else {
			System.out.println("Webelements are not sorted...");
		}
		Thread.sleep(5000);
		driver.close();
	}

}

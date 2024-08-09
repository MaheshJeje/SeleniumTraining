package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElements {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/ajax.html");
		List<WebElement> elements = driver.findElements(By.name("name"));	
		System.out.println(elements.size());
		
		for(int i=0; i<elements.size(); i++) {
			String str = elements.get(i).getAttribute("value");
			System.out.println(str);
		}

		Thread.sleep(3000);
		driver.close();
	}
}

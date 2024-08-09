package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	public static String browser = "Chrome";
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		if(browser.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		List<WebElement> weblinks = driver.findElements(By.tagName("a"));

		int i = 1;
		for(WebElement l : weblinks) {
			System.out.println(i+" : "+l.getAttribute("href")+" => "+l.getText());
			i++;
		}
	
		Thread.sleep(5000);
		driver.close();
	}
}
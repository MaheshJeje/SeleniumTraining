package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowsers {

	public static void main(String[] args) {
		
	/*	HtmlUnitDriver driver = new HtmlUnitDriver(true);
		driver.setJavascriptEnabled(true);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
 	*/		
	/*	System.setProperty("webdriver.gecko.driver", "C://Users//Mahesh//Downloads//BrowserDriver//geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	*/
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);	
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}

}

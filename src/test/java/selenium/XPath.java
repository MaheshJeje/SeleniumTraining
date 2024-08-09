package selenium;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {

	public static void main(String[] args) {
	Logger logger = Logger.getLogger("XPath");
	DOMConfigurator.configure("Log4j.xml");
		
	WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/newtours/login.php");
	
	logger.info("Browser Opened");
	
	driver.findElement(By.xpath("//*[starts-with(@name,'userNa')]")).sendKeys("Chikku");
	driver.findElement(By.xpath("//*[contains(@name,'asswor')]")).sendKeys("Chikku");
	driver.findElement(By.xpath("//*[@name='submit']")).click();
	
	}
}
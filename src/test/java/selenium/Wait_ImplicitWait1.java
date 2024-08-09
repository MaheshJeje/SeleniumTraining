package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_ImplicitWait1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
		WebElement electronics = driver.findElement(By.xpath("//*[@id='vl-flyout-nav']/ul/li[2]/a"));
		act.moveToElement(electronics).perform();
		
		driver.findElement(By.xpath("//*[@id='vl-flyout-nav']/ul/li[2]/div[2]/div[1]/nav[2]/ul/li[1]/a")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}

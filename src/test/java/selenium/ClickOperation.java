package selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOperation {

	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions act = new Actions(driver);
		Robot rbt = new Robot();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//*[@name='userName']"));
		wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("Chikku");
		
		Thread.sleep(1000);
		act.moveToElement(username).doubleClick(username).contextClick(username).build().perform();
		
		for(int i=1; i<=5; i++) {
			Thread.sleep(1000);
			rbt.keyPress(KeyEvent.VK_DOWN);
		}
		
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.close();
	}
}
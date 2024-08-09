package selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		Robot rt = new Robot();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		Thread.sleep(2000);
		
		WebElement username =  driver.findElement(By.xpath("//*[@name = 'userName']"));
		WebElement password = driver.findElement(By.xpath("//*[@name = 'password']"));
		
		username.sendKeys("Mahesh");
		Thread.sleep(2000);
		
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_A);
		rt.keyPress(KeyEvent.VK_C);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		
		act.moveToElement(password).click().build().perform();
		Thread.sleep(2000);
		
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		driver.close();
	}
}

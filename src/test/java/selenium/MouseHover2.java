package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		WebElement switchTo = driver.findElement(By.xpath("//*[text()='SwitchTo']"));
		WebElement frames =  driver.findElement(By.xpath("//*[text()='Frames']"));
		WebElement home = driver.findElement(By.xpath("//*[text()='Home']"));
		
		act.contextClick(home).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_DOWN).click().build().perform();
		
		//action.moveToElement(switchTo).moveToElement(frames).click().build().perform();
		
		Thread.sleep(5000);
		driver.close();
	}
}

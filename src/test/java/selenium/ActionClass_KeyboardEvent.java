package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass_KeyboardEvent {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.get("https://extendsclass.com/text-compare.html");
		Thread.sleep(2000);
		
		WebElement targetText = driver.findElement(By.xpath("//*[@id='dropZone2']/div[2]/div/div[6]/div[1]"));
		act.keyDown(targetText, Keys.CONTROL).sendKeys("a").sendKeys("delete");
		
		Thread.sleep(2000);
		
		WebElement sourceText = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]"));
		act.keyDown(sourceText, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		Thread.sleep(2000);
		
		act.keyDown(targetText, Keys.CONTROL).sendKeys("v").build().perform();
		
		Thread.sleep(2000);
		WebElement textCmp = driver.findElement(By.xpath("//*[@id='nb-diff']"));
		js.executeScript("arguments[0].scrollIntoView();", textCmp);
		
		Thread.sleep(3000);
		driver.close();
	}
}
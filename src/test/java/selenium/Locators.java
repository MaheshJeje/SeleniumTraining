package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws Exception {
		
		//ID, Name, ClassName, Css Selector, Link Text, Partial Link Text, Tag Name, Xpath
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
/*		driver.findElement(By.xpath("//*[@id='submitbtn']")).click();
		driver.findElement(By.cssSelector("#submitbtn")).click();
		driver.findElement(By.linkText("WebTable")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Intera")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Resi")).click();
*/		
		WebElement LastName = driver.findElement(By.xpath("//*[@placeholder='Last Name']"));
		
		Thread.sleep(2000);
		driver.close();

	}

}

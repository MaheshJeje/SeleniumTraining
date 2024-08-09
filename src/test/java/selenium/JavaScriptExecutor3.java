package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor3 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		Thread.sleep(5000);
		
		for(int i = 1; i<=7; i++) {	
			WebElement row_one = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr["+i+"]/td[1]"));
			Thread.sleep(1000);
			
			row_one.click();
			Thread.sleep(1000);
			
			js.executeScript("arguments[0].style.backgroundColor = 'red'" , row_one);
			Thread.sleep(1000);
		}

		Thread.sleep(5000);
		driver.close();
	}
}
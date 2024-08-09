package selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert4 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();	
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		String inputText = "Mahesh";
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		
		//1st time click on OK
		driver.findElement(By.xpath("//*[@id='Textbox']/button")).click();
		
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.sendKeys(inputText);
		Thread.sleep(2000);
		a.accept();
		
		String str = driver.findElement(By.xpath("//*[@id='demo1']")).getText();
		System.out.println(str);
		
		if(("Hello "+inputText+" How are you today").contains(str)) {
			System.out.println("Test Passed...");
		}
		else {
			System.out.println("Test Failed...");
		}
		
		//2nd time click on Cancel
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Textbox']/button")).click();
		Alert at = driver.switchTo().alert();
		Thread.sleep(2000);
		at.dismiss();
		
		String str2 = driver.findElement(By.xpath("//*[@id='demo1']")).getText();
		System.out.println(str2);
		
		if(("").contains(str2)) {
			System.out.println("Test Passed...");
		}
		else {
			System.out.println("Test Failed...");
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
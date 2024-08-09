package selenium;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Alert2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//BrowserDriver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Alert with OK ']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains (text(),'click the button to display an')]"))).click();
		
		//driver.findElement(By.linkText("Alert with OK")).click();
		//driver.findElement(By.xpath("//*[@id='OKTab']/button")).click();
		
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(a.getText());
		a.accept();

		Thread.sleep(2000);
		driver.quit();
	}
}
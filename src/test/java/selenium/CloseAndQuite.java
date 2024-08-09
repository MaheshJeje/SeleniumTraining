package selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseAndQuite {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@id='tabButton']")).click();
		//driver.findElement(By.xpath("//*[@id='windowButton']")).click();
		driver.findElement(By.xpath("//*[@id='messageWindowButton']")).click();
		Thread.sleep(10000);
		//driver.close();
		driver.quit();
	}
}

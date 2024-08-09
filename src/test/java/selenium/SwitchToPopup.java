package selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToPopup {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("http://output.jsbin.com/usidix/1");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/input")));
		driver.findElement(By.xpath("/html/body/input")).click();
		
		driver.switchTo().alert();
		Thread.sleep(3000);
		String str = driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().accept();
		driver.quit();
	}
}

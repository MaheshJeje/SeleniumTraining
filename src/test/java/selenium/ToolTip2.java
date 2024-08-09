package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/tooltip.html");
		
		WebElement download = driver.findElement(By.xpath("//*[@id='download_now']"));
		Actions act = new Actions(driver);
		act.moveToElement(download).clickAndHold(download).build().perform();
		Thread.sleep(3000);
		
		String str = driver.findElement(By.xpath("//*[@id='demo_content']/div/div/div/a")).getText();
		System.out.println(str);
		
		Thread.sleep(5000);
		driver.close();
	}
}
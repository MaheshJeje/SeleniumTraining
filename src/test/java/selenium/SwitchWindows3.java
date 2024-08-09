package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindows3 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='Multiple']/button")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String i : handles) {
			WebDriver d =  driver.switchTo().window(i);
			Thread.sleep(10000);
			System.out.println(d.getTitle());
			if((d.getTitle()).contains("Index")) {
				driver.findElement(By.xpath("//*[@id='email']")).sendKeys("m.j@gmail.com");
				driver.findElement(By.xpath("//*[@id='enterimg']")).click();
			}
		}

		Thread.sleep(10000);
		driver.quit();
	}
}

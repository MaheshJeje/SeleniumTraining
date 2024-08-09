package selenium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindows1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();
		
		Set<String> s = driver.getWindowHandles();
		System.out.println(s);
		
		for(String i : s) {
			WebDriver d = driver.switchTo().window(i);
			Thread.sleep(20000);
			System.out.println(d.getTitle());
		}
		
		driver.quit();
	}
}

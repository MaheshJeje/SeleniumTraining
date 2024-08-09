package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(5000);
		
		Set<String> s1  = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		
		while(i1.hasNext()) {
			String handle = i1.next();
			System.out.println(handle);
		}		
	}
}
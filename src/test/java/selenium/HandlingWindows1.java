package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/?ir=1");
		Thread.sleep(2000);
		//System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//*[@id='1675817562118_6zf']/div/article/div[2]/div/pbc-button[1]/a")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> nameOfWindows = windowHandles.iterator();	
		String parentWindow = nameOfWindows.next();
		String childWindow = nameOfWindows.next();
		
		driver.switchTo().window(childWindow);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='UserFirstName']")).sendKeys("Jack");
		driver.findElement(By.xpath("//*[@name='UserLastName']")).sendKeys("Sparrow");
		
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
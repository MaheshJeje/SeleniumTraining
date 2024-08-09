package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchBetweenWindow {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		Thread.sleep(2000);
		
			
		driver.findElement(By.xpath("//*[contains(text(),'click')]")).click();
		Thread.sleep(2000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String s : windowHandles) {
			String ss = driver.switchTo().window(s).getTitle();
			System.out.println(s +" <=> "+ ss);
		}
		
/*		for(String s : windowHandles) {
			if(driver.switchTo().window(s).getTitle().equals("Frames & windows")) {
				driver.close();
				System.out.println("Yes, it's closed...");
			}
		}
*/
		
		for(String s : windowHandles) {
			if(driver.switchTo().window(s).getTitle().equals("Frames & windows")) {
				System.out.println("Yes, it's switched back to parent window...");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[text()='Open New Seperate Windows']")).click();
			}
		}
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
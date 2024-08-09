package selenium1;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandler_SeleniumStudy2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(text(),'Seperate Windows')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Seperate']//button")).click();
		
		Set<String> s = driver.getWindowHandles();
		System.out.println(s);
		Iterator<String> itr = s.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		
		driver.switchTo().window(childWindow);
		driver.manage().window().maximize();
		String childWindowHeading = driver.findElement(By.xpath("//h1")).getText();
		System.out.println(childWindowHeading);
		
		driver.switchTo().window(parentWindow);
		String parentWindowHeading = driver.findElement(By.xpath("//h1")).getText();
		System.out.println(parentWindowHeading);
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
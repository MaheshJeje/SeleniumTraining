package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		Thread.sleep(2000);
		
		int size = driver.findElements(By.tagName("iframe")).size();
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("No. of frames available on page : "+size);
		
		for(int i=0; i<size; i++)
			System.out.println(i+" : "+frames.get(i).getAttribute("name")+" : "+ frames.get(i).getAttribute("src"));
		
		Thread.sleep(5000);
		driver.close();
	}
}
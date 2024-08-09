package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/social-icon.html");
		WebElement Github = driver.findElement(By.xpath("//*[@id='page']/div[2]/div/a[4]"));
		
		String title = Github.getAttribute("title");
		String class1 = Github.getAttribute("class");
		String href = Github.getAttribute("href");
		
		System.out.println(title+"\n"+class1+"\n"+href);
		
		Thread.sleep(3000);
		driver.close();
	}
}

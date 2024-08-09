package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		driver.get("https://demo.automationtesting.in/Resizable.html");
		
		Thread.sleep(2000);		
		WebElement Resizablebox = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		for(int i=50; i<=300; i++) {
			act.dragAndDropBy(Resizablebox, i, i).build().perform();
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}

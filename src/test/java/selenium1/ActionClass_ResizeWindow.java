package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass_ResizeWindow {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/ActionClass_ResizeWindow.html");
		Thread.sleep(3000);
		
		WebElement resizable = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		act.dragAndDropBy(resizable, 500, 250).build().perform();
		
		Thread.sleep(5000);
		driver.close();
	}
}
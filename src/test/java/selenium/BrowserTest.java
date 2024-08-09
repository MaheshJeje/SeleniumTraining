package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	static String browser = "Chrome";
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		if(browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else 
		if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		String windowHandles = driver.getWindowHandle();
		System.out.println(windowHandles);
		Thread.sleep(2000);
		
		WebElement button_sbt = driver.findElement(By.xpath("//*[@id='submitbtn']"));
		System.out.println(button_sbt.getLocation());
		System.out.println(button_sbt.getSize());
		System.out.println(button_sbt.getTagName());
		System.out.println(button_sbt.getAttribute("class"));
		System.out.println(button_sbt.getAttribute("value"));
		System.out.println(button_sbt.getText());
		System.out.println(button_sbt.getCssValue("background-color"));
		System.out.println(button_sbt.getCssValue("border-color"));
		System.out.println(button_sbt.getCssValue("padding"));
		
		System.out.println("Is Dislayed : "+button_sbt.isDisplayed());
		System.out.println("Is Enabled : " +button_sbt.isEnabled());
		System.out.println("Is Selected : "+button_sbt.isSelected());
		
		Thread.sleep(2000);
		driver.close();
	}
}
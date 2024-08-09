package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass_Slider {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/ActionClass_Slider.html");
		Thread.sleep(2000);

		WebElement Source = driver.findElement(By.xpath("//*[@id='slider']/a"));
		
		for(int i=0; i<=20; i++){
			act.dragAndDropBy(Source,i,0).build().perform();
		}
		
		act.contextClick().perform();
		
		Thread.sleep(5000);
		driver.close();
	}
}
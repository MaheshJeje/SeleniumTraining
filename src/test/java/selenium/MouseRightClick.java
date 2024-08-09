package selenium;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseRightClick {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(5000);
		
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"));
		act.contextClick(button).build().perform();
		
		List <WebElement> options = driver.findElements(By.xpath("/html/body/ul/li"));
		
		for(WebElement e : options) {
			if(("Copy").equals(e.getText())) {
				e.click();
				break;
			}
		}		
		
		Alert at = driver.switchTo().alert();
		System.out.println(at.getText());
		at.accept();
		Thread.sleep(3000);
		driver.close();
	}
}

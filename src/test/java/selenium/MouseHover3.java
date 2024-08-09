package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.interactions.Action;

public class MouseHover3 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
		WebElement home = driver.findElement(By.linkText("Home"));
		WebElement homeHead= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]"));
		System.out.println(homeHead.getCssValue("background-color"));
		
	
		Action mouseOverHome = act.moveToElement(home).build();
		mouseOverHome.perform();
		
		System.out.println(homeHead.getCssValue("background-color"));
		
		Thread.sleep(5000);
		driver.close();
	}
}
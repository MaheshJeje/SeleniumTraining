package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SelectAllTags {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
/*		
		driver.get("https://demo.guru99.com/test/newtours/");
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		int NoOfElement = alltags.size();
		System.out.println(NoOfElement);

		for(int i=0; i<NoOfElement; i++) {
			String URL = alltags.get(i).getAttribute("href");
			String Name = alltags.get(i).getText();
			
			System.out.println(i+" : "+URL+" : "+Name);
		}
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://demo.guru99.com/test/newtours/reservation.php");
		List<WebElement> AllOption = driver.findElements(By.tagName("option"));
		int NoOfOptions = AllOption.size();
		
		for(int i=0; i<NoOfOptions; i++) {
			System.out.println(AllOption.get(i).getAttribute("value"));
		}
*/
		driver.navigate().to("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement fromPort = driver.findElement(By.xpath("//*[@name='fromPort']"));
		Select s = new Select (fromPort);
		List<WebElement> ls = s.getOptions();
		System.out.println(ls.size());
		for (int i=0; i<ls.size(); i++) {
			System.out.println(ls.get(i).getText());
		}
		Thread.sleep(5000);
		driver.close();
	}
}

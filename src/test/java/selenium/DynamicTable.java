package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> rowCount = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println(rowCount.size());
		
		
		for(int i=1; i<=rowCount.size(); i++) {
			List<WebElement> columnCount = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td"));
			for(int j=1; j<=columnCount.size(); j++) {
				String data = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println();
		}
		
		Thread.sleep(5000);
		driver.close();
	}
}
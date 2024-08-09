package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowsCount = rows.size();
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
		int columnsCount = columns.size();
		
		System.out.println("No. of rows : "+rowsCount);
		System.out.println("No. of columns : "+columnsCount);
		
		for(int i=2; i<=rowsCount; i++) {
			for(int j=1; j<=columnsCount; j++) {
				String data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]/span")).getText();
				System.out.print(data+"\t");
			}
			System.out.println();
		}
	
		
		Thread.sleep(5000);
		driver.quit();
	}
}
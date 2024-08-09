package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");

		driver.findElement(By.xpath("//*[@id='datepicker2']")).click();

		WebElement month = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[1]"));
		Select s = new Select(month);
		s.selectByVisibleText("January");
		
		WebElement year = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[2]"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2024");
		
		List<WebElement> date2 = driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr/td"));
		for (WebElement d : date2)	{ 
		//System.out.println(d.getText());
			if(d.getText().equals("20")) {
				d.click();
				break;
			}
		}		
		Thread.sleep(3000);
		driver.close();
	}
}
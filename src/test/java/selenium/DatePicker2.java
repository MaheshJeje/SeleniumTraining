package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[2]/img")).click();
		
		do {
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			String month = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
			String year = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[2]")).getText();
			String my = month.concat(year);
			if(my.equals("August2023")) {
				System.out.println(my);
				break;
			}
		}while(true);
		
		List<WebElement> date2 = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td"));
		for (WebElement d : date2)	{ 
		//System.out.println(d.getText());
			if(d.getText().equals("20")) {
				d.click();
				break;
			}
		}	
		
		Thread.sleep(10000);
		driver.close();
	}
}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiselectDropdown {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.mobiscroll.com/javascript/select/multiple-select");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[2]/div[11]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/div/label/span[2]/span[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='mbsc-scrollview-scroll mbsc-ltr']//div[1]")).click();
	
		
		
/*		WebElement activity = driver.findElement(By.xpath("//*[@id='multiple-select-select']"));
		Select activitySelect = new Select (activity);
		activitySelect.selectByIndex(3);
		activitySelect.selectByIndex(2);
		activitySelect.selectByValue("8");
*/		
	}
}

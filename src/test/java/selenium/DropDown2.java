package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='speed']"));
		
		Select s = new Select(dropdown);
		int dropdownCount = s.getOptions().size();
		System.out.println(dropdownCount);
		
		List<WebElement> l = s.getOptions();
		
		for(WebElement e : l) {
			System.out.println(e.getText());
		}
		js.executeScript("window.scrollBy(0,800)");
		
		WebElement webFrame = driver.findElement(By.xpath("//*[@id='frame-one1434677811']"));
		driver.switchTo().frame(webFrame);
		

		
		WebElement rbuttonMale = driver.findElement(By.xpath("//*[@id='RESULT_RadioButton-7_0']"));
		WebElement rbuttonFemale = driver.findElement(By.xpath("//*[@id='RESULT_RadioButton-7_1']"));
		
		System.out.println(rbuttonMale.isSelected());
		System.out.println(rbuttonFemale.isSelected());
		
		if(rbuttonMale.isSelected()==false) {
			js.executeScript("arguments[0].click();", rbuttonMale);
		}
		
		driver.findElement(By.xpath("//*[@id='q15']/table/tbody/tr[1]/td/label")).click();

		Thread.sleep(10000);
		driver.close();
	}
}

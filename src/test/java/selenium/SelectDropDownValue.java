package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownValue {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement dropdownCountry = driver.findElement(By.xpath("//*[@name='country']"));
		Select selectOfCountry = new Select(dropdownCountry);
		System.out.println(selectOfCountry.isMultiple());
		
		List <WebElement> listOfElements = selectOfCountry.getOptions();
		System.out.println(listOfElements.size());
		
		selectOfCountry.selectByVisibleText("INDIA");
		Thread.sleep(3000);
		selectOfCountry.selectByIndex(13);
		Thread.sleep(3000);
		selectOfCountry.selectByValue("NORWAY");
		Thread.sleep(3000);		
		
/*		for(WebElement e : listOfElements) {
			System.out.println(e.getText());
		}
*/		
		Thread.sleep(5000);
		driver.close();
	}
}
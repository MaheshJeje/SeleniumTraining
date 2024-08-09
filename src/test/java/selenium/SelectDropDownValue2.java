package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownValue2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		WebElement dropdownFruits = driver.findElement(By.xpath("//*[@id='fruits']"));
		Select selectOfFruits = new Select(dropdownFruits);
		
		System.out.println("Is Multiselect Dropdown : "+ selectOfFruits.isMultiple());
		
		selectOfFruits.selectByVisibleText("Apple");
		Thread.sleep(3000);
		selectOfFruits.selectByValue("grape");
		Thread.sleep(3000);
		selectOfFruits.selectByIndex(0);
		Thread.sleep(3000);

/*		selectOfFruits.deselectByIndex(0);
		Thread.sleep(3000);
		selectOfFruits.deselectByVisibleText("Grape");
		Thread.sleep(3000);
		selectOfFruits.deselectByValue("apple");
*/
		List<WebElement> selectedOptions = selectOfFruits.getAllSelectedOptions();
		System.out.println("No of selected options : "+selectedOptions.size());
		
		for(WebElement e : selectedOptions) {
			System.out.println(e.getText());
		}
		
		Thread.sleep(5000);
		driver.close();
	}
}

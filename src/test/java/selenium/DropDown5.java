package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class DropDown5 {

	public static void main(String[] args) throws Exception {
		ChromeDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id='login-button']")).click();
		Thread.sleep(2000);
		
		WebElement itemSort = driver.findElement(By.xpath("//*[@class='select_container']//select"));
		Select itemSort_Select = new Select(itemSort);
		List<WebElement> itemSortElement = itemSort_Select.getOptions();
		for(WebElement e : itemSortElement) {
			System.out.println(e.getText());
		}
		
/*		itemSort.click();
		itemSort_Select.selectByIndex(1);
		Thread.sleep(2000);
		
		itemSort.click();
		itemSort_Select.selectByValue("hilo");
		Thread.sleep(2000);
*/
		
		itemSort.click();
		itemSort_Select.selectByVisibleText("Price (low to high)");
		
		
		driver.navigate().to("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		WebElement States = driver.findElement(By.xpath("//*[@name='States']"));
		Select States_Select = new Select(States);
		List<WebElement> State_List = States_Select.getOptions();
		
		for(WebElement w : State_List) {
			System.out.println(w.getText());
		}
		
		States_Select.selectByIndex(1);
		States_Select.selectByValue("Texas");
		States_Select.selectByVisibleText("Washington");
		
		
		System.out.println("Selected Option : ");
		List<WebElement> Selected_item = States_Select.getAllSelectedOptions();
		for(WebElement w : Selected_item) {
			System.out.println(w.getText());
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()='First Selected']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Get All Selected']")).click();
		
		Thread.sleep(2000);
		
		States_Select.deselectAll();
		
		Thread.sleep(5000);
		driver.close();
	}
}
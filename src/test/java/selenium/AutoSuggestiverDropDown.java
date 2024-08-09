package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestiverDropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|&s_kwcid=AL!1631!3!!e!!o!!makemytrip.com%20%5C&ef_id=:G:s");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='SW']/div[1]/div[2]/div[2]/div/section/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='fromCity']")).click();
		Thread.sleep(2000);
		WebElement from = driver.findElement(By.xpath("//*[@placeholder='From']"));
		from.sendKeys("Sydney");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//*[@value='Male']")).click();
		
		int noOfRadioButton = driver.findElements(By.xpath("//*[@type='radio']")).size();
		System.out.println(noOfRadioButton);
		
		
		
		Thread.sleep(5000);
		driver.close();
	}
}
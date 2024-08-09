package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DropDown3 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@value='oneway']")).click();

		WebElement passengers = driver.findElement(By.xpath("//*[@name='passCount']"));
		Select passengersSelect = new Select (passengers);
		passengersSelect.selectByVisibleText("2");
		
		WebElement DepartingFrom = driver.findElement(By.xpath("//*[@name='fromPort']"));
		Select DepartingFromSelect = new Select(DepartingFrom);
		DepartingFromSelect.selectByValue("London");
		
		WebElement FromMonth = driver.findElement(By.xpath("//*[@name='fromMonth']"));
		Select FromMonthSelect = new Select(FromMonth);
		FromMonthSelect.selectByIndex(8);
		
		
		WebElement FromDay = driver.findElement(By.xpath("//*[@name='fromDay']"));
		Select FromDaySelect = new Select(FromDay);
		FromDaySelect.selectByVisibleText("24");
		
		
		WebElement ArrivingIn = driver.findElement(By.xpath("//*[@name='toPort']"));
		Select ArrivingInSelect = new Select (ArrivingIn);
		ArrivingInSelect.selectByIndex(7);
		
		
		WebElement toMonth = driver.findElement(By.xpath("//*[@name='toMonth']"));
		Select toMonthSelect = new Select(toMonth);
		toMonthSelect.selectByIndex(5);
		
		WebElement toDay = driver.findElement(By.xpath("//*[@name='toDay']"));
		Select toDaySelect = new Select (toDay);
		toDaySelect.selectByValue("30");
		
		driver.findElement(By.xpath("//*[@value='Business']")).click();
		
		WebElement Airline = driver.findElement(By.xpath("//*[@name='airline']"));
		Select AirlineSelect = new Select (Airline);
		AirlineSelect.selectByIndex(3);
		
		Thread.sleep(3000);
		driver.close();
	}
}

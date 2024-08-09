package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		Thread.sleep(2000);
		
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		WebElement flights = driver.findElement(By.xpath("//a[text()='Flights']"));
		WebElement hotels = driver.findElement(By.xpath("//a[text()='Hotels']"));
		WebElement carRentals = driver.findElement(By.xpath("//a[text()='Car Rentals']"));
		WebElement cruises = driver.findElement(By.xpath("//a[text()='Cruises']"));
		WebElement destinations = driver.findElement(By.xpath("//a[text()='Destinations']"));
		WebElement vacations = driver.findElement(By.xpath("//a[text()='Vacations']"));
		
		act.moveToElement(home).perform();
		Thread.sleep(1000);
		act.moveToElement(flights).perform();
		Thread.sleep(1000);
		act.moveToElement(hotels).perform();
		Thread.sleep(1000);
		act.moveToElement(carRentals).perform();
		Thread.sleep(1000);
		act.moveToElement(cruises).perform();
		Thread.sleep(1000);
		act.moveToElement(destinations).perform();
		Thread.sleep(1000);
		act.moveToElement(vacations).perform();
		
		Thread.sleep(5000);
		driver.close();

	}
}
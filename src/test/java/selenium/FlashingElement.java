package selenium;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlashingElement {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		Thread.sleep(2000);
		
		WebElement home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
		
		WebElement userName = driver.findElement(By.xpath("//*[@name='userName']"));
		WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		
		WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
		
		for(int i=1; i<=2; i++) {
			changeColor(driver, home);
		}
		
		sendText(driver, userName, "Mahesh");
		sendText(driver, password, "Mahesh");
		drawBorder(driver, submit);
		
		String ScreenshotName = fileName();
		takeScreenshot(driver, ScreenshotName);

		onClick(driver, submit);
		
		String ScreenshotName2 = fileName();
		takeScreenshot(driver, ScreenshotName2);
		
		Thread.sleep(5000);
		driver.close();
	}
	
	
	public static String fileName() {
		 LocalDateTime currentDate = LocalDateTime.now();		    
		 DateTimeFormatter expectedFormat = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss"); 
		 String formattedDate = currentDate.format(expectedFormat);
		 return formattedDate;
	}
	
	public static void takeScreenshot(WebDriver driver, String ScreenshotName) throws Exception {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File trg = new File (".//Screenshot/"+ScreenshotName+".png");
		FileUtils.copyFile(src, trg);
	}
	
	public static void onClick(WebDriver driver, WebElement element) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void sendText(WebDriver driver, WebElement element, String text) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1];", element, text);
	}
	
	public static void drawBorder(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid red'", element);
	}
	
	public static void changeColor(WebDriver driver , WebElement element) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].style.backgroundColor='#00308F'", element);
		Thread.sleep(2000);
		js.executeScript("arguments[0].style.backgroundColor='orange'", element);
		Thread.sleep(2000);
	}

	public static void generateAlert(WebDriver driver, String message) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('"+message+"')");
	}
	
	public static void refreshBrowser(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go()");
	}
}

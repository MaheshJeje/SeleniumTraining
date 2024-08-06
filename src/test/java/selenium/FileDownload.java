package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileDownload {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//browser-driver//chromedriver_127.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		Thread.sleep(2000);
		
		WebElement generatePDF = driver.findElement(By.xpath("//*[text()='Generated PDF File to Download']"));
		act.moveToElement(generatePDF);
		
		WebElement textarea  = driver.findElement(By.xpath("//*[@id='textbox']"));
		textarea.sendKeys("Mahesh Jejurkar...");
		Thread.sleep(2000);
		
		WebElement generatefile = driver.findElement(By.xpath("//*[@id='createTxt']"));
		generatefile.click();
		Thread.sleep(2000);
		
		WebElement download = driver.findElement(By.xpath("//*[@id='link-to-download']"));
		download.click();
		

		Thread.sleep(5000);
		driver.close();
	}
}
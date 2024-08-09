package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()='Alerts & Modals']")).click();
		Thread.sleep(2000);
		
		//Javascipt Alerts
		driver.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[5]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/button")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		String msg = driver.findElement(By.xpath("//*[@id='confirm-demo']")).getText();
		System.out.println(msg);
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[3]/div[2]/button")).click();
		Thread.sleep(1000);
		
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Mahesh Jejurkar");
		Thread.sleep(5000);
		alt.accept();
		
		String msg2 = driver.findElement(By.xpath("//*[@id='prompt-demo']")).getText();
		System.out.println(msg2);
		
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		driver.close();
	}

}

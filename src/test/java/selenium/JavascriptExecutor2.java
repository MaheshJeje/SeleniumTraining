package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JavascriptExecutor2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		Thread.sleep(2000);
		
		//Print the title of the page...
		String pageTitle = js.executeScript("return document.title;").toString();
		System.out.println(pageTitle);
		
		//Print the URL of page...
		String pageURL = js.executeScript("return document.URL").toString();
		System.out.println(pageURL);
		
		//Print the Domain of URL...
		String pageDomain = js.executeScript("return document.domain").toString();
		System.out.println(pageDomain);
		
		//Scroll the page by 500 pixel vertical...
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		//Scroll the page till the element is found...
		WebElement email = driver.findElement(By.xpath("//*[contains(text(),'Email Submission')]"));
		js.executeScript("arguments[0].scrollIntoView();", email);
		Thread.sleep(2000);
		
		//Scroll the web page till bottom...
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//Highlight the button
		WebElement buttonSubmit = driver.findElement(By.xpath("//button[text()='Submit']"));
		js.executeScript("arguments[0].style.border='5px solid red'", buttonSubmit);
		Thread.sleep(2000);
		
//		//Generate the alert to display msg...
//		js.executeScript("alert('Button highlighted...');");
//		Thread.sleep(2000);
		
//		//Click on button...
//		js.executeScript("arguments[0].click();", buttonSubmit);
		
		Thread.sleep(3000);
		driver.close();
	}
}

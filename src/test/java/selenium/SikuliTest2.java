package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SikuliTest2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor e = (JavascriptExecutor) driver;
		
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement BrowseFile = driver.findElement(By.xpath("//*[@id='imagesrc']"));
		e.executeScript("arguments[0].click();", BrowseFile);
		
		
		String imageFilePath =System.getProperty("user.dir")+"\\InputData\\";
		String inputFilePath = System.getProperty("user.dir")+"\\InputData\\";
		
		
		Screen s = new Screen();
		
		Pattern inputTextbox = new Pattern(imageFilePath+"InputTextbox2.jpg");
		Pattern openButton = new Pattern(imageFilePath+"OpenButton2.jpg");
	
		Thread.sleep(5000);
		
		s.wait(inputTextbox,10);
		s.type(inputTextbox, inputFilePath+"Docx1.docx");
		s.click(openButton);
		
		Thread.sleep(3000);
		driver.close();
	}
}

package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadTest1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='uploadfile_0']")).sendKeys(System.getProperty("user.dir")+"\\InputData\\Docx1.docx");
		driver.findElement(By.xpath("//*[@id='terms']")).click();
		driver.findElement(By.xpath("//*[@id='submitbutton']")).click();
		Thread.sleep(5000);
		driver.close();
	}
}

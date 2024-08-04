package selenium;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadPropertiesFile {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\input-files\\testdata.properties");
		p.load(fis);
		String url = p.getProperty("url");
		System.out.println(url);
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get(url);
		
		Thread.sleep(2000);
		String title = driver.getTitle();
		String handle =	driver.getWindowHandle();
		
		Thread.sleep(2000);
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"\\input-files\\outputtestdata.properties");
		p.setProperty("Title", title);
		p.setProperty("Window-Handle", handle);
		p.store(fos,"");
		
		
		Thread.sleep(5000);
		driver.close();
	}
}

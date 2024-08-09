package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadWriteProperties {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testdata.properties");
		Properties properties = new Properties();
		
		properties.load(fis);
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		System.out.println(browser+"\n"+url);
		
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\testdata.properties");
		properties.setProperty("userName", "Admin");
		properties.setProperty("password", "Admin");
		properties.store(fos,null);
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		Thread.sleep(5000);
		driver.close();
	}
}
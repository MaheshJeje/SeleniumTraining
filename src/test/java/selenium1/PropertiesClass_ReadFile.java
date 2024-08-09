package selenium1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesClass_ReadFile {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\input-files\\inputtestdata.properties");
		p.load(fis);
		String input_url = p.getProperty("url");

		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(input_url);

		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		String windowHandle = driver.getWindowHandle();

		Thread.sleep(2000);
		FileOutputStream fos = new FileOutputStream(
				System.getProperty("user.dir") + "\\input-files\\outputtestdata.properties");
		p.setProperty("URL", url);
		p.setProperty("Title", title);
		p.setProperty("Window Handle", windowHandle);
		p.store(fos, "Added data...");

		Thread.sleep(5000);
		fis.close();
		fos.close();
		driver.close();
	}
}

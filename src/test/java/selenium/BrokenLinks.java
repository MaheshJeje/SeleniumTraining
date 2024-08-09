package selenium;
import java.util.Iterator;
import java.util.List;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\BrowserDriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> itr = links.iterator();
		
		while(itr.hasNext()) {
			String url = itr.next().getAttribute("href");	
			URL link = new URL(url);
			HttpURLConnection HUC = (HttpURLConnection) link.openConnection();
			HUC.connect();
			int responseCode = HUC.getResponseCode();
			
			if(responseCode >= 400) {
				System.out.println("Link is broken -> "+responseCode+"\t"+url);
			}
			else {
				System.out.println("Link is not broken -> "+responseCode+"\t"+url);
			}
			System.out.println();
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}

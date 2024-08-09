package selenium;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCookies {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Cookie ck = new Cookie("MyCookie","12345");
		driver.manage().addCookie(ck);
		
		Set <Cookie> cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		
		for(Cookie c : cookies) {
			System.out.println(c.getName()+" : "+c.getValue());
		}
		
		driver.manage().deleteCookie(ck);
		
		cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		
		for(Cookie c : cookies) {
			System.out.println(c.getName()+" : "+c.getValue());
		}
	
		driver.manage().deleteAllCookies();
		
		cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		
		for(Cookie c : cookies) {
			System.out.println(c.getName()+" : "+c.getValue());
		}
	
		
		Thread.sleep(3000);
		driver.close();
	}
}

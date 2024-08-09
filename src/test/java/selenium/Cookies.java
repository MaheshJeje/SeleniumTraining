package selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/use-autoit-selenium.html");
		Thread.sleep(2000);
		
		Set <Cookie> c = driver.manage().getCookies();
		System.out.println(c.size());
		
		for(Cookie cc : c) {
			System.out.println(cc.getName() +" : "+cc.getValue());		//Print name and value of cookies.
		}
		System.out.println("------------------------------------------");
		System.out.println(driver.manage().getCookieNamed("cookie"));	//Print specific cookie according to name.
		System.out.println("------------------------------------------");
		
		
		Cookie cobj = new Cookie("myCookie", "123456789");
		driver.manage().addCookie(cobj);
		
		c = driver.manage().getCookies();
		System.out.println(c.size());
		
		for(Cookie cc : c) {
			System.out.println(cc.getName() +" : "+cc.getValue());		//Print name and value of cookies.
		}
		
		Thread.sleep(5000);
		driver.close();
	}
}
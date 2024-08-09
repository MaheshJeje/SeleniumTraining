package selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert3 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//*[contains(text(),'click the button to display a confirm box')]")).click();
		
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		
		String str = driver.findElement(By.xpath("//*[@id='demo']")).getText();
		
		if(("You pressed Ok").equals(str)) {
			System.out.println("Test Passed... "+str);
		}
		else {
			System.out.println("Test Failed... "+str);
		}
		
		driver.findElement(By.xpath("//*[contains(text(),'click the button to display a confirm box')]")).click();
		
		Alert at = driver.switchTo().alert();
		Thread.sleep(2000);
		at.dismiss();
		
		String str2 = driver.findElement(By.xpath("//*[@id='demo']")).getText();
		
		if(("You Pressed Cancel").equals(str2)) {
			System.out.println("Test Passed... "+str2);
		}
		else {
			System.out.println("Test Failed... "+str2);
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
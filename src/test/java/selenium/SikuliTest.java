package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SikuliTest {

	public static void main(String[] args) throws Exception {	
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		Screen s = new Screen();
		
		String imageFilePath = System.getProperty("user.dir")+"\\input-files\\";
		String uploadFilePath = System.getProperty("user.dir")+"\\input-files\\";		
		System.out.println(imageFilePath +"\n"+uploadFilePath);
		
		
		Pattern inputTexbox = new Pattern(imageFilePath+"InputTextbox.jpg");
		Pattern openButton = new Pattern(imageFilePath+"OpenButton.jpg");
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		WebElement ChooseFile = driver.findElement(By.xpath("//*[@id='imagesrc']"));
		action.click(ChooseFile).build().perform();
		
		Thread.sleep(3000);
		
		s.wait(inputTexbox,10);
		s.type(inputTexbox,uploadFilePath+"SmileyEmoji.jpg");
		s.click(openButton);
	
		Thread.sleep(5000);
		driver.close();
		
	}

}

package selenium;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class JavascriptExecutor1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();		
		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().window().maximize();
		driver.get("https://www.countries-ofthe-world.com/");
		Thread.sleep(3000);
		screenshot(driver);
		
		int s = driver.findElements(By.xpath("//*[@id='topmenuul']/li/a")).size();

		for(int i = 1; i <= s; i++) {
			WebElement we = driver.findElement(By.xpath("//*[@id='topmenuul']/li["+i+"]/a"));
			act.moveToElement(we).build().perform();
			Thread.sleep(1000);
			js.executeScript("arguments[0].style.border='3px solid red'", we);
			Thread.sleep(1000);
			screenshot(driver);
			js.executeScript("arguments[0].style.border=''", we);
		}

				
/*		
		WebElement continents = driver.findElement(By.xpath("//*[@id='topmenuul']/li[1]/a"));
		String backgroundColour = continents.getCssValue("background");
		System.out.println("Button Continents Background Colour : "+backgroundColour);
		Thread.sleep(2000);
		act.moveToElement(continents).build().perform();
		backgroundColour = continents.getCssValue("background");
		System.out.println("Button Continents Background Colour : "+backgroundColour);
*/		
	}
	
	public static void screenshot(WebDriver driver) throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy HH_mm_ss");
		Date date = new Date();
		String fileName = formatter.format(date);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg = new File(System.getProperty("user.dir")+"\\Screenshot\\"+fileName+".jpg");
		FileUtils.copyFile(src, trg);
	}
}

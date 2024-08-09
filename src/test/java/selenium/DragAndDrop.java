package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(5000);

		WebElement Oslo = driver.findElement(By.xpath("//*[@id='box1']"));
		WebElement Stockholm = driver.findElement(By.xpath("//*[@id='box2']"));
		WebElement Washington = driver.findElement(By.xpath("//*[@id='box3']"));
		WebElement Copenhagen = driver.findElement(By.xpath("//*[@id='box4']"));
		WebElement Seoul = driver.findElement(By.xpath("//*[@id='box5']"));
		WebElement Rome = driver.findElement(By.xpath("//*[@id='box6']"));
		WebElement Madrid = driver.findElement(By.xpath("//*[@id='box7']"));
		
		
		
		WebElement Norway = driver.findElement(By.xpath("//*[@id='box101']"));
		WebElement Sweden = driver.findElement(By.xpath("//*[@id='box102']"));
		WebElement US = driver.findElement(By.xpath("//*[@id='box103']"));
		WebElement Denmark = driver.findElement(By.xpath("//*[@id='box104']"));
		WebElement SouthKorea = driver.findElement(By.xpath("//*[@id='box105']"));
		WebElement Italy = driver.findElement(By.xpath("//*[@id='box106']"));
		WebElement Spain = driver.findElement(By.xpath("//*[@id='box107']"));
		

		Actions act = new Actions(driver);
		//act.clickAndHold(Source).moveToElement(target).release().build().perform();
		
		act.dragAndDrop(Rome, Italy).build().perform();
		act.dragAndDrop(Madrid, Spain).build().perform();
		act.dragAndDrop(Oslo, Norway).build().perform();
		act.dragAndDrop(Copenhagen, Denmark).build().perform();
		act.dragAndDrop(Seoul, SouthKorea).build().perform();
		act.dragAndDrop(Stockholm, Sweden).build().perform();
		act.dragAndDrop(Washington, US).build().perform();
		
		Thread.sleep(5000);
		driver.close();
	}
}
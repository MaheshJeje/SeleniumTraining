package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		boolean rOption1 = driver.findElement(By.xpath("//*[@id='vfb-7-1']")).isSelected();
		boolean rOption2 = driver.findElement(By.xpath("//*[@id='vfb-7-2']")).isSelected();
		boolean rOption3 = driver.findElement(By.xpath("//*[@id='vfb-7-3']")).isSelected();
		
		boolean checkbox1 = driver.findElement(By.xpath("//*[@id='vfb-6-0']")).isSelected();
		boolean checkbox2 = driver.findElement(By.xpath("//*[@id='vfb-6-1']")).isSelected();
		boolean checkbox3 = driver.findElement(By.xpath("//*[@id='vfb-6-2']")).isSelected();
		
		System.out.println("Radioboxes =\n"+rOption1+"\n"+rOption2+"\n"+rOption3);
		System.out.println("Checkboxes =\n"+checkbox1+"\n"+checkbox2+"\n"+checkbox3);
		
	}

}

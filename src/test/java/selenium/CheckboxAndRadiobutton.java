package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxAndRadiobutton {

	public static void main(String[] args) throws Exception {		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		String baseURL = "https://demo.guru99.com/test/radio.html";
		
		driver.get(baseURL);
		
		System.out.println("--- Radio Buttons ---");
		
		WebElement Option1 = driver.findElement(By.id("vfb-7-1"));
		WebElement Option2 = driver.findElement(By.id("vfb-7-2"));
		WebElement Option3 = driver.findElement(By.id("vfb-7-3"));
		
		System.out.println("Option 1 : "+ Option1.isSelected());
		System.out.println("Option 2 : "+ Option2.isSelected());
		System.out.println("Option 3 : "+ Option3.isSelected());
		
		System.out.println("Now selecting the radio buttons...");
		Option1.click();
		System.out.println("Option 1 : "+ Option1.isSelected());
		Option2.click();
		System.out.println("Option 2 : "+ Option2.isSelected());
		Option3.click();
		System.out.println("Option 3 : "+ Option3.isSelected());
		
		
		System.out.println("--- Checkboxes ---");
		
		WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
		WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
		WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));
		
		System.out.println("Checkbox 1 : "+ checkbox1.isSelected());
		System.out.println("Checkbox 2 : "+checkbox2.isSelected());
		System.out.println("Checkbox 3 : "+checkbox3.isSelected());
		
		checkbox1.click();
		checkbox2.click();
		checkbox3.click();
		
		System.out.println("Checkbox 1 : "+ checkbox1.isSelected());
		System.out.println("Checkbox 2 : "+checkbox2.isSelected());
		System.out.println("Checkbox 3 : "+checkbox3.isSelected());
		
		checkbox1.click();
		checkbox2.click();
		checkbox3.click();
		
		System.out.println("Checkbox 1 : "+ checkbox1.isSelected());
		System.out.println("Checkbox 2 : "+checkbox2.isSelected());
		System.out.println("Checkbox 3 : "+checkbox3.isSelected());
		
		
		Thread.sleep(3000);
		driver.close();
	}

}

package selenium;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass3 {
    public static void main(String[] args) throws Exception {
    	WebDriverManager.chromedriver().setup();
    	System.setProperty("webdriver.http.factory", "jdk-http-client");
    	
    	WebDriver driver = new ChromeDriver();
    	Actions act = new Actions(driver);
        Robot rt = new Robot();
    	
        driver.manage().window().maximize();
    	driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
    	Thread.sleep(2000);
    	
    	WebElement textMsg = driver.findElement(By.xpath("//h3"));
    	System.out.println(textMsg.getText());
    	
    	act.moveToElement(textMsg).click().doubleClick().doubleClick().build().perform();
    	Thread.sleep(2000);
    	
          
        rt.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        rt.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        
        Thread.sleep(4000);
        driver.close();
    }
}
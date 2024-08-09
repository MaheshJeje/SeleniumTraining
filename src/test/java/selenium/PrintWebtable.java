package selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintWebtable {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php#");

		int rowCount = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr")).size();
		int colCount = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th")).size();
		System.out.println("No. of row : "+rowCount+"\n No. of Column : "+colCount);
		
		
		for(int i=1; i<=rowCount; i++) {
			for(int j=1; j<=colCount; j++) {
				String str = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(str+"\t");
			}
			System.out.println();
		}

//		double tempPrice = Double.parseDouble(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[4]")).getText());
//		System.out.println(tempPrice);
//		
//		for(int i=1; i<=rowCount; i++) {
//			double currentPrice = Double.parseDouble(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[4]")).getText());
//			
//			if (currentPrice > tempPrice) {
//				tempPrice = currentPrice;
//			}
//		}
//		System.out.println(tempPrice);
	
	
		
		Thread.sleep(5000);
		driver.close();
	}
}

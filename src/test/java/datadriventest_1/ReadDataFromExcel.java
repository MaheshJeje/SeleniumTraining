package datadriventest_1;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromExcel {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
			
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//input-files//Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Row Count : "+rowCount +"\t"+ "Column Count : "+colCount);
		
		
		for (int i = 0; i <= rowCount; i++) {
			XSSFRow currentRow = sheet.getRow(i);
			
			String userName = currentRow.getCell(0).getStringCellValue();
			String password = currentRow.getCell(1).getStringCellValue();
			System.out.print(userName +"\t"+password);
			System.out.println();
			
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@name='userName']")).sendKeys(userName);
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
			driver.findElement(By.xpath("//*[@name='submit']")).click();
			
			if (driver.getPageSource().contains("Login Successfully")) {
				System.out.println("Test is Passed for record : "+i);
			}
			else {
				System.out.println("Test is failed...");
			}

			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='SIGN-OFF']")).click();
		}
		driver.quit();
	}
}
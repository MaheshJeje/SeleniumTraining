package datadriventest_1;

import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SBIRateCalculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") +"//input-files//Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"//BrowserDriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver. manage().window().maximize();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		Thread.sleep(10000);
		
		
		for (int i=0; i<=rowCount; i++) {
			XSSFRow currentRow = sheet.getRow(i);
			
			int principalAmt = (int) currentRow.getCell(0).getNumericCellValue();
			driver.findElement(By.xpath("//*[@id='principal']")).sendKeys(String.valueOf(principalAmt));
			
			double interestRate = currentRow.getCell(1).getNumericCellValue();
			driver.findElement(By.xpath("//*[@id='interest']")).sendKeys(String.valueOf(interestRate));
			
			int tenure = (int) currentRow.getCell(2).getNumericCellValue();
			driver.findElement(By.xpath("//*[@id='tenure']")).sendKeys(String.valueOf(tenure));
			
			String tenurePeriod = currentRow.getCell(3).getStringCellValue();
			Select s = new Select(driver.findElement(By.xpath("//*[@id='tenurePeriod']")));
			s.selectByVisibleText(tenurePeriod);
			
			String frequency = currentRow.getCell(4).getStringCellValue();
			Select s2 = new Select(driver.findElement(By.xpath("//*[@id='frequency']")));
			s2.selectByVisibleText(frequency);
			
			driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[1]/img")).click();
			
			double expMaturityAmt = currentRow.getCell(5).getNumericCellValue();
			
			String maturityAmt = driver.findElement(By.xpath("//*[@id='resp_matval']/strong")).getText();
			double maturityAmtt = Double.parseDouble(maturityAmt);
			
			System.out.print(principalAmt+"\t"+interestRate+"\t"+tenure+"\t"+tenurePeriod+"\t"+frequency+"\t"+expMaturityAmt+"\n");
			
			if(maturityAmtt==expMaturityAmt) {
				System.out.println("Test Passed...");
			}else {
				System.out.println("Test Failed...");
			}
			
			Thread.sleep(10000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
			Thread.sleep(5000);
		}
		driver.close();
	}
}

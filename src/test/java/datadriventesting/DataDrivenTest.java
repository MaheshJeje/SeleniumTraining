package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\input-files\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int noOfSheet =	workbook.getNumberOfSheets();
		System.out.println(noOfSheet);
		
		for(int i=0; i<noOfSheet; i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("testdatasheet1")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
			}
		}
	}
}
package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.*;

public class DataProvider1 {

	@Test(dataProvider = "driveTest")
	public void testCaseData(String data1, String data2, int data3) {
		System.out.println(data1 + " " + data2 + " " + data3);
	}

	//@DataProvider(name = "driveTest")
	@Test
	public void getData() throws Exception {
//		Object[][] data = {{"Hello","Hi",1},{"Bye","Bye",2},{"Hello","Bye",3}};
//		return data;

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\input-files\\TestData2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = row.getLastCellNum();

		Object[][] excelData = new Object[rowCount - 1][columnCount];

		for (int i = 1; i < rowCount; i++) {
			row = sheet.getRow(i);
			columnCount = row.getLastCellNum();
			for (int j = 0; j < columnCount; j++) {
			  System.out.print(row.getCell(j)+"\t");
			}
			System.out.println();
		}
	}

}

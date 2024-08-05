package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.*;

public class DataProvider1 {

	@Test(dataProvider = "driveTest")
	public void testCaseData(String data1, String data2, String data3) {
		System.out.println(data1 + " " + data2 + " " + data3);
	}

	@DataProvider(name = "driveTest")
	public Object[][] getData() throws Exception {
		DataFormatter formatter = new DataFormatter();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\input-files\\TestData2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = row.getLastCellNum();

		Object[][] excelData = new Object[rowCount-1][columnCount];

		for (int i = 0; i < rowCount-1; i++) {
			row = sheet.getRow(i+1);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				excelData[i][j] = (formatter.formatCellValue(cell));
			}
		}
		return excelData;

	}

}

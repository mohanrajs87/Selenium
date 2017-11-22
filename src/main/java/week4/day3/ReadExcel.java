package week4.day3;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public Object [][] readExcel(String excelFile) throws InvalidFormatException, IOException{

		File file = new File("./testData/"+excelFile+".xlsx");
		XSSFWorkbook Wbook = new XSSFWorkbook(file);
		XSSFSheet sheet1 = Wbook.getSheetAt(0);
		int rowCount = sheet1.getLastRowNum();
		int colCount = sheet1.getRow(0).getLastCellNum();
		Object [][] data = new Object[rowCount][colCount];		
		for (int i = 1; i <= rowCount; i++) {

			XSSFRow rows = sheet1.getRow(i);	

			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = rows.getCell(j);

				data[i-1][j]= cell.getStringCellValue();
				//System.out.println("Row "+ i +"  "+ "Column"+ j + test);

			}

		}
		Wbook.close();
		return data;

	}

}

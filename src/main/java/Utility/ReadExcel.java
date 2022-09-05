package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public  class ReadExcel {


	public static String readExcelFile(int row, int col) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new  FileInputStream("C:\\Bhavana\\Eclipse-Bhavana\\workspace-Bhavana-Test\\First-Project\\KitemavenProkectO\\TestData\\TestData.xlsx");
		Sheet excelSheet=WorkbookFactory.create(file).getSheet("Sheet1");
		String value=excelSheet.getRow(row).getCell(col).getStringCellValue();
		return value;
	}

}

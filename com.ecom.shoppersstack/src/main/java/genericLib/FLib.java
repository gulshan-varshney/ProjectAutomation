package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FLib {

	public String getDataFromPropertyFile(String path, String key) throws IOException {

		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}

	public String getDataFromExcelFile(String path, String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String value = cell.getStringCellValue();
		return value;

	}

	public int getRowCount(String path, String sheetName) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		return rowCount;
	}

	public static  Object[][] getMultipleDataFromExcelSheet(String path, String sheetName)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		int row = sheet.getPhysicalNumberOfRows();
		System.out.println(row);
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] test = new Object[row-1][cell];
		for (int i = 1; i < row; i++)
		{
			for(int j=0;j<cell;j++)
			{
				test[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
			
		}
		
		return test;
	}

}

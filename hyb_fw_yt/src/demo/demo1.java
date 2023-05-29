package demo;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo1 {

	public static String mad( String s,int r,int c) {
	String value="";
		try {	
	FileInputStream f=new FileInputStream("./data/Testdata.xlsx");
	Workbook book = WorkbookFactory.create(f);
	Sheet sheet = book.getSheet(s);
	Row row = sheet.getRow(r);
	Cell cell = row.getCell(c);
	 value = cell.toString();
	 
	}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return value;
	}
}
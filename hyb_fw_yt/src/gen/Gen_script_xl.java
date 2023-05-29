package gen;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Gen_script_xl {

	public static String mad( String s,int r,int c) {
		String value="";
			try {	
		FileInputStream f=new FileInputStream("./data/Testdata.xlsx");//location
		Workbook book = WorkbookFactory.create(f);//open file
		Sheet sheet = book.getSheet(s);//which sheet
		Row row = sheet.getRow(r);//which row
		Cell cell = row.getCell(c);//which cell
		 value = cell.toString();
		 
		}
			catch (Exception e) {
				System.out.println(e);
			}
			
			return value;
		}
}

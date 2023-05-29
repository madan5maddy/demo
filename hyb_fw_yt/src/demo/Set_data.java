package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Set_data {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream f=new FileInputStream("./data/Testdata.xlsx");
	Workbook book = WorkbookFactory.create(f);
	Sheet s = book.getSheet("Sheet1");
	Row r = s.createRow(1);
	Cell c = r.createCell(0);
    c.setCellValue("madman");
    FileOutputStream fo=new FileOutputStream("./data/Testdata.xlsx");
    book.write(fo);
			}
}

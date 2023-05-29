package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class set_data_yt {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream f=new FileInputStream("./data/Testdata.xlsx");
	Workbook book = WorkbookFactory.create(f);
	Sheet s = book.getSheet("Sheet1");
	System.setProperty("webdriver.chrome.driver", "./supporter1/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.com");
	List<WebElement> link = driver.findElements(By.xpath("//a"));
	int count = link.size();
	for (int i = 0; i < count; i++) {
		Row r = s.createRow(i);
		Cell c = r.createCell(0);
		String val = link.get(i).getAttribute("href");
	    c.setCellValue(val);
	}
	
	   
    FileOutputStream fo=new FileOutputStream("./data/Testdata.xlsx");
    book.write(fo);
}
}

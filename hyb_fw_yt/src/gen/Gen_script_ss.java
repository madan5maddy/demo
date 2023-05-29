package gen;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Gen_script_ss {

	public static void photo(WebDriver driver) throws IOException
	{
		
		String photo="./photo";//folder location
		Date todaydate=new Date();//to fetch system date
		String s = todaydate.toString();//convert to string and store in s 
		TakesScreenshot ts=(TakesScreenshot)driver;
		File img = ts.getScreenshotAs(OutputType.FILE);
		File s1=new File(photo+s+".jpeg");
		FileHandler.copy(img, s1);
	}
}

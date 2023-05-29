package gen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Constant_fw {

	public WebDriver driver;
	@BeforeMethod
	public void openb()
	{
		System.setProperty(chrome_key,chromr_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	@AfterMethod
	public void closeb()
	{
		driver.close();
	}
}

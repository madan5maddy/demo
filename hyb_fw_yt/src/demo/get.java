package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get {
	
	public static void main(String[] args) {
		 String m = demo1.mad("Sheet1", 0, 0);
		// System.out.println(m);
		 String n = demo1.mad("Sheet1", 0, 1);
		 //System.out.println(n);
		 
		 System.setProperty("webdriver.chrome.driver", "./supporter1/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		    driver.get("https://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys(m);
			driver.findElement(By.id("pass")).sendKeys(n);
		 
	}
}

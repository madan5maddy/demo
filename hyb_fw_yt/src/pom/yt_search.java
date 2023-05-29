package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import gen.Base_page;

public class yt_search extends Base_page {

	@FindBy(xpath = "//input[@id='search']")
	private WebElement search_tb;
	@FindBy(xpath = "//button[@id='search-icon-legacy']")
	private WebElement search_syb;
	
	public yt_search(WebDriver driver)
	{
		super(driver);
	}
	public void s_tb(String text)
	{
		search_tb.sendKeys(text);
	}
	public void s_bt() {
		search_syb.click();
	}
}

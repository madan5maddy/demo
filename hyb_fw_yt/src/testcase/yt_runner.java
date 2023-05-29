package testcase;

import org.testng.annotations.Test;

import gen.Base_test;
import pom.yt_search;

public class yt_runner extends Base_test{

	@Test
	public void runner() throws InterruptedException
	{
		yt_search yt=new yt_search(driver);
		yt.s_tb("selenium");
		yt.s_bt();
		Thread.sleep(2000);
		
		
	}
}

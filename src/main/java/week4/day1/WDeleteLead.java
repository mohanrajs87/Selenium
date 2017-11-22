package week4.day1;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import projectwrappers.LoginWrappers;

public class WDeleteLead extends LoginWrappers 
{
	@Test(groups = "regression")
	public void deletelead() throws Exception
	{


		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//div[@class='x-tab-strip-wrap']/ul/li[2]/a[2]/em/span/span");
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("document.getElementById('ext-gen262').value = '0';");
		enterById("ext-gen266", "044");
		enterById("ext-gen270", "97866875885");
		clickById("ext-gen334");

	}

}

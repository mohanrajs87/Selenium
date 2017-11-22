package week4.day1;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import projectwrappers.LoginWrappers;


public class WDuplicateLead extends LoginWrappers
{
	@Test(groups = "sanity" , dependsOnGroups = "smoke")
	public void duplicatelead() throws Exception
	{

		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByLink("Email");
		enterByXpath("//*[@id='ext-gen282']", "mohanraj.s@gmail.com");
		clickById("ext-gen334");
		clickByLink("11096");
		clickByLink("Duplicate Lead");
		String log1= driver.findElementById("sectionHeaderTitle_leads").getText();
		//Print the get text
		System.out.println(log1);
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("scroll(0, 850)");
		clickByClassName("smallSubmit");

	}
}

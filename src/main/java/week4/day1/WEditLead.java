package week4.day1;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import projectwrappers.LoginWrappers;


public class WEditLead extends LoginWrappers {

	@Test(groups = "sanity" , dependsOnGroups = "smoke")
	public void editlead() throws Exception
	{
	
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("//*[@id='ext-gen248']", "MOHANRAJ");
		clickByXpath("//*[@id='ext-gen334']");
		clickByLink("MOHANRAJ");
		clickByLink("Edit");
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("document.getElementById('updateLeadForm_companyName').value = 'MOHANRAJ';");
		clickByClassName("smallSubmit");
		

	}
}

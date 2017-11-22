package week4.day1;

import org.testng.annotations.Test;

import projectwrappers.LoginWrappers;

public class WMergeLead extends LoginWrappers {
	
	
	@Test(groups = "regression")
	public  void MergeLead() throws Exception {

		clickByLink("Leads");
		clickByLink("Merge Leads");
		clickByXpath("//*[@class='twoColumnForm']/tbody/tr[1]/td[2]/a");
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		enterById("ext-gen25", "10609");
		clickById("ext-gen114");
		clickByLink("10609");
		driver.switchTo().window(winHandleBefore);
		clickByXpath("//*[@class='twoColumnForm']/tbody/tr[2]/td[2]/a");
		String winHandleBefore1 = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		enterById("ext-gen25", "10613");
		clickById("ext-gen114");
		clickByLink("10613");
		driver.switchTo().window(winHandleBefore1);
		clickByLink("Merge");
		driver.switchTo().alert().accept();
	}

}


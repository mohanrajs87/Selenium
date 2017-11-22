package week4.day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import projectwrappers.LoginWrappers;

public class WCreateLead extends LoginWrappers {


	@BeforeClass()
	public void setFileName() {
		excelFile = "createLead";
	}

	@Test(dataProvider = "fetchData")
	public void createLead(String cName, String fName, String sName, String eMail) throws Exception {
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", cName);
		enterById("createLeadForm_firstName", fName);
		enterById("createLeadForm_lastName", sName);
		enterById("createLeadForm_primaryEmail", eMail);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		clickByClassName("smallSubmit");
	}

}

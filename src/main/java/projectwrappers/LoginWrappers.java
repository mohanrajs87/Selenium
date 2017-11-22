package projectwrappers;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week4.day3.ReadExcel;
import wrappers.GenericWrappersInaTech;

public class LoginWrappers extends GenericWrappersInaTech {
	
	public static String excelFile;
	@DataProvider(name = "fetchData")
	public Object[][] getData() throws InvalidFormatException, IOException{
		ReadExcel data = new ReadExcel();
		return data.readExcel(excelFile);
	}


	@Parameters ({"browser","url","uName","uPassword"})
	@BeforeMethod(groups = "common")
	public void login(String browser, String url, String uName, String uPassword) throws Exception {


		invokeApp(browser ,url);
		enterById("username", uName);
		enterById("password", uPassword);
		clickByClassName("decorativeSubmit");
		clickByXpath("//*[@id='button']/a/img");

	}
	@AfterMethod(groups = "common")
	public void closeApp(){

		closeBrowser();
	}
}

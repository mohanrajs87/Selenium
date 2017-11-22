package week4.day2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuperClass {
	@BeforeSuite()
	public void beforesuite()
	{
		System.out.println("beforesuite");
	}
	@BeforeTest()
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}
	@BeforeClass()
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	@BeforeMethod()
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	@AfterMethod()
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
	@AfterClass()
	public void afterClass()
	{
		System.out.println("afterClass");
	}
	
	@AfterClass()
	public void test()
	{
		System.out.println("test");
	}
	@AfterTest()
	public void afterTest()
	{
		System.out.println("afterTest");
	}
	@AfterSuite()
	public void afterSuite()
	{
		System.out.println("afterSuite");
	}
	
}

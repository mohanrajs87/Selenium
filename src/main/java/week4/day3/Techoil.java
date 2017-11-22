package week4.day3;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import projectwrappers.LoginWrappers;

public class Techoil extends LoginWrappers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		//Path to the Driver Executable is set using the System Class 	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Launching the Chrome Browser using Chrome Driver and Assigning Object class named as driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait to make handle to wait for 3 seconds 
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//URL
		driver.get("http://qc.techoil.com:2050");
		
		//Enter the User name
		driver.findElement(By.id("i0116")).sendKeys("mohanraj.s@inatech.com");
		//Enter the Password
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("i0118")).sendKeys("raj#123");
		//Click the Submit button
		driver.findElement(By.id("idSIButton9")).click();
		
		Thread.sleep(5000);
		driver.get("http://qc.techoil.com:2050/V2/#/Contract/PhysicalDeal/PhysicalDealDetail");
		//Click on CRM button
		
		
	
	}


}

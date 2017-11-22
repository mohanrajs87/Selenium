package week1.day1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIntoOpenTaps {

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
		//Click on CRM button
		System.out.println(driver.findElement(By.xpath("//*[@id='form']/h2")).getText());
		driver.findElement(By.xpath("//*[@id='button']/a")).click();
		//Create Lead Link
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Inatech");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohanraj");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selvaraj");
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)", ""); 
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String str = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		System.out.println(str);
		
		if (str.contains("Inatech"))
		
			System.out.println("Pass");
		else
			System.out.println("Fail");
					
		driver.close();
	}


}

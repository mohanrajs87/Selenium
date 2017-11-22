package week1.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignUp {

	public static void main(String[] args) {
		//Path to the Driver Executable is set using the System Class 	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//Launching the Chrome Browser using Chrome Driver and Assigning Object class named as driver
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait to make handle to wait for 3 seconds 
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		//Passing the URL to the OMNI box
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		//Finding the element by Link text and click on the link
		driver.findElement(By.linkText("Sign up")).click();
		
		// Sending the values in the Username field by using the ID
		driver.findElement(By.id("userRegistrationForm:userName")).sendKeys("mohan87sra");
		
	
		//Sending the values in the Password field by using the ID
		driver.findElement(By.id("userRegistrationForm:password")).sendKeys("mohan@123");
		
		//Sending the values in the Confirm Password field by using the ID
		driver.findElement(By.id("userRegistrationForm:confpasword")).sendKeys("mohan@123");
		
		Select drpdown = new Select(driver.findElement(By.id("userRegistrationForm:securityQ")));
		
		drpdown.selectByIndex(1);
		
		
		
		
		
		
		
		
		
		
		
	}

}

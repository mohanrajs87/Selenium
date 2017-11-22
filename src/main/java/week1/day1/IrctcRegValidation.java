package week1.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcRegValidation {

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
		
		//Print the String Value in the Console
		String valstr = driver.findElement(By.xpath("//*[@id='userRegistrationForm']/div[2]/p")).getText();
		System.out.println(valstr);
		
		if (valstr.contains("User profile service is not allowed between - 09:30 AM - 11:30 AM"))
			
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		driver.close();
	}

}

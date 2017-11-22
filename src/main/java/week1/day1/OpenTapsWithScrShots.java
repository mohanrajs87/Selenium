package week1.day1;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.TakesScreenshot;




public class OpenTapsWithScrShots {

	public static void main(String[] args) throws IOException {
		//Path to the Driver Executable is set using the System Class 	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Launching the Chrome Browser using Chrome Driver and Assigning Object class named as driver
		ChromeDriver driver = new ChromeDriver();

		FileUtils.copyFile(((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE),new File("./screen/image1"+System.currentTimeMillis()+".png")); 
		driver.manage().window().maximize();
		//Implicit wait to make handle to wait for 3 seconds 
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//URL
		driver.get("http://leaftaps.com/opentaps");

		//Enter the User name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File("./screen/image1"+System.currentTimeMillis()+".png")); 

		//Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File("./screen/image1"+System.currentTimeMillis()+".png")); 

		//Click the Submit button
		driver.findElement(By.className("decorativeSubmit")).click();
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File("./screen/image1"+System.currentTimeMillis()+".png")); 

		//Click on CRM button
		System.out.println(driver.findElement(By.xpath("//*[@id='form']/h2")).getText());

		driver.findElement(By.xpath("//*[@id='button']/a")).click();
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File("./screen/image1"+System.currentTimeMillis()+".png")); 

		//Create Lead Link
		driver.findElement(By.linkText("Create Lead")).click();
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File("./screen/image1"+System.currentTimeMillis()+".png")); 


		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Inatech");
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File("./screen/image1"+System.currentTimeMillis()+".png")); 


		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohanraj");
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File("./screen/image1"+System.currentTimeMillis()+".png")); 


		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selvaraj");
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File("./screen/image1"+System.currentTimeMillis()+".png")); 

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)", ""); 
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File("./screen/image1"+System.currentTimeMillis()+".png")); 


		driver.findElement(By.className("smallSubmit")).click();
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File("./screen/image1"+System.currentTimeMillis()+".png")); 


		String str = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File("./screen/image1"+System.currentTimeMillis()+".png")); 


		System.out.println(str);

		if (str.contains("Inatech"))

			System.out.println("Pass");
		else
			System.out.println("Fail");

		driver.close();

	}


}


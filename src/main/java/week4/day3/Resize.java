package week4.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Resize {
	@Test
	public void reSize() throws InterruptedException {

		//Path to the Driver Executable is set using the System Class 	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Launching the Chrome Browser using Chrome Driver and Assigning Object class named as driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//URL
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		System.out.println("Inside Frame");
		WebElement resizeElement = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		Thread.sleep(5000);
		Actions builder = new Actions(driver);
		//builder.dragAndDropBy(resizeElement, 250, 250).build().perform();
		builder.moveToElement(resizeElement);
		builder.click().build().perform();
		builder.clickAndHold(resizeElement).build().perform();
		builder.moveByOffset(80, 90).release().build().perform();
		Thread.sleep(4000);
		driver.quit();
		//		builder.clickAndHold(resizeElement).moveByOffset(400,400).release().build().perform();

	}
}

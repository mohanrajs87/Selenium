package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		//URL
		driver.get("http://google.co.in");
		
		driver.findElement(By.id("lst-ib")).sendKeys("Mohan", Keys.ENTER);
		
		List<WebElement> linkText = driver.findElements(By.tagName("a"));
		
		int countLink = linkText.size();
		
		System.out.println(countLink);
		
		for(WebElement eachLink : linkText)
		{
			
			
			System.out.println(eachLink.getAttribute("onmousedown"));
			
			System.out.println(eachLink.getAttribute("href"));
		}
		driver.close();
	}
}

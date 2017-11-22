package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        //URL
        driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
    
       
       
        driver.switchTo().frame("childIframe");
        System.out.println("We are in Child Frame");
        driver.findElement(By.xpath("/html/body/div[2]/p/button")).click();
        System.out.println("Closed West Frame");
        driver.findElement(By.xpath("/html/body/div[3]/p/button")).click();
        System.out.println("Closed East Frame");
        driver.switchTo().defaultContent();
        
        driver.findElement(By.xpath("/html/body/div[1]/p[1]/button")).click();
        System.out.println("Closed East outer Frame");
        driver.findElement(By.xpath("/html/body/div[2]/p/button")).click(); 
        System.out.println("Closed west outer Frame");
        driver.close();
	}

}

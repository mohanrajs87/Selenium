
package week3.day1;


import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FindFramesCount {

       public static void main(String[] args) throws IOException, InterruptedException {
              
              System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
                     WebDriver driver = new ChromeDriver();
                     driver.manage().window().maximize();
                     //Implicit wait
                     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                     
                     //URL
                     driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
                     
/*                     int initialCount = driver.findElements(By.tagName("frame")).size();
                     System.out.println(initialCount);
                     int finalCount = initialCount + driver.findElements(By.tagName("iframe")).size();
                     System.out.println(finalCount);
                     
                  // find all your iframes
                     List<WebElement> iframes = driver.findElements(By.xpath("//iframe"));
                             // print your number of frames
                             System.out.println(iframes.size());

                             // you can reach each frame on your site
                             for (WebElement iframe : iframes) {

                                 // switch to every frame
                                 driver.switchTo().frame(iframe);

                                
                             }
                     
                     */
                     driver.findElement(By.xpath("/html/body/div[3]")).click();
                     Thread.sleep(5000);
                     driver.switchTo().frame((WebElement) driver.findElement(By.xpath("/html/body/iframe[1]")));
                     System.out.println("We are in North Frame");
                     driver.switchTo().frame("aswift_0");
                     System.out.println("We are in aswift_0 Frame");
                     List<WebElement> aswift_0Elements =  driver.findElements(By.tagName("iframe"));
                     System.out.println("Count of Frames inside aswift_0 Frame : " + aswift_0Elements.size());
                     
                     driver.switchTo().frame("google_esf"); 
                     System.out.println("We are in google_esf Frame");
                     List<WebElement> esfFrCount =  driver.findElements(By.tagName("iframe"));
                     System.out.println("Count of Frames inside google_esf Frame : " + esfFrCount.size());
                     driver.switchTo().parentFrame();
                     driver.switchTo().parentFrame();
                     /*driver.switchTo().frame("google_ads_frame0"); 
                     System.out.println("We are in google_ads_frame0 Frame");
                     List<WebElement> adsFr0Count =  driver.findElements(By.tagName("iframe"));
                     System.out.println("Count of Frames inside google_ads_frame0 Frame : " + adsFr0Count.size());*/
                    // driver.switchTo().defaultContent();                    
                     
                     
                     
                     
                     driver.switchTo().frame("aswift_1");
                     System.out.println("We are in aswift_1 Frame");
                     List<WebElement> aswift_1Elements =  driver.findElements(By.tagName("iframe"));
                     System.out.println("Count of Frames inside aswift_1 Frame : " + aswift_1Elements.size());
/*                     driver.switchTo().frame("google_ads_frame1"); 
                     System.out.println("We are in google_ads_frame1 Frame");
                     List<WebElement> adsFr1Count =  driver.findElements(By.tagName("iframe"));
                     System.out.println("Count of Frames inside google_ads_frame1 Frame : " + adsFr1Count.size());*/
                     //  driver.switchTo().defaultContent();
                     //driver.switchTo().frame((WebElement) driver.findElement(By.xpath("/html/body/iframe[1]")));
                     //driver.switchTo().parentFrame();
                     
                     
                     
                     /*driver.switchTo().frame("aswift_2");
                     System.out.println("We are in aswift_2 Frame");
                     List<WebElement> aswift_2Elements =  driver.findElements(By.tagName("iframe"));
                     System.out.println("Count of Frames inside aswift_2 Frame : " + aswift_2Elements.size());
                     driver.switchTo().frame("google_ads_frame2"); 
                     System.out.println("We are in google_ads_frame2 Frame");
                     List<WebElement> adsFr2Count =  driver.findElements(By.tagName("iframe"));
                     System.out.println("Count of Frames inside google_ads_frame Frame : " + adsFr2Count.size());*/
                     driver.switchTo().defaultContent();
                     
                     driver.findElement(By.xpath("/html/body/div[5]")).click();
                     Thread.sleep(5000);
                     driver.switchTo().frame((WebElement) driver.findElement(By.xpath("/html/body/div[2]/iframe")));
                     System.out.println("We are in BOTW Frame");
                     driver.switchTo().defaultContent();
                     
                     driver.close();
                
       }

       
       
       
}



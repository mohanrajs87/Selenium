package week2.day1;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LeaptapsDuplicate {

       public static void main(String[] args) throws IOException, InterruptedException {
              // TODO Auto-generated method stub
              
              System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
                     WebDriver driver = new ChromeDriver();
                     driver.manage().window().maximize();
                     //Implicit wait
                     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                     
                     //URL
                     driver.get("http://leaftaps.com/opentaps");
                     
                     
                     driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
                     //Password
                     driver.findElement(By.id("password")).sendKeys("crmsfa");
                     //Submit
                     driver.findElement(By.className("decorativeSubmit")).click();
                     driver.findElement(By.xpath("//*[@id='button']/a")).click();
                     driver.findElement(By.linkText("Create Lead")).click();
                     
                     driver.findElement(By.linkText("Find Leads")).click();
                     driver.findElement(By.linkText("Email")).click();
                     
                     driver.findElement(By.id("ext-gen282")).sendKeys("mohan");
                                         
                     driver.findElement(By.id("ext-gen334")).click();
                        
                     Thread.sleep(3000);
                     String firstName = driver.findElement(By.linkText("11066")).getText();
                    // driver.findElement(By.xpath("//*[@id='ext-gen473']/div[1]/table/tbody/tr[1]/td[1]/div/a")).click();      
                     driver.findElement(By.linkText("11066")).click();
                  
                     System.out.println(firstName);
                     
                     //Click on the Duplicate Lead Button
                     driver.findElement(By.linkText("Duplicate Lead")).click(); 
                     
                     //Enter the Lead Name as Duplicate Lead
                     driver.findElement(By.id("createLeadForm_firstName")).clear();
                     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("MOHANRAJ DUPLICATE LEAD");
                   
                    //Scroll the Page to detect the Create Lead Button in the Page
                    ((RemoteWebDriver) driver).executeScript("window.scrollBy(0,800)", ""); 
                     driver.findElement(By.className("smallSubmit")).click();
                                    
                     String duplicateLeadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
                     
                     if (duplicateLeadName.contains("MOHANRAJ DUPLICATE LEAD"))
                     {
                    	 System.out.println("Pass");
                     }
                     else
                     {
                    	 System.out.println("Fail");
                     }
                     driver.close();
       }

       
       
       
}



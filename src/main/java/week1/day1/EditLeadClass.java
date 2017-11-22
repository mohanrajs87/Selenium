package week1.day1;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadClass {

       public static void main(String[] args) throws IOException, InterruptedException {
              // TODO Auto-generated method stub
              
              System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
                     WebDriver driver = new ChromeDriver();
                     //driver.manage().window().maximize();
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
                     
                     driver.findElement(By.id("ext-gen248")).sendKeys("mohan");
                                         
                     driver.findElement(By.id("ext-gen334")).click();
                     Thread.sleep(3000);
                     driver.findElement(By.xpath("//*[@id='ext-gen473']/div[1]/table/tbody/tr[1]/td[1]/div/a")).click();      
                     driver.findElement(By.linkText("Edit")).click();
                     driver.findElement(By.id("updateLeadForm_companyName")).clear();
                     driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Inatech mohan");
                     driver.findElement(By.className("smallSubmit")).click();
                  
                     String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
                     
                     if (companyName.contains("Inatech mohan"))
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



package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrappersInaTech implements Wrappers {

public RemoteWebDriver driver;

public void invokeApp(String browser, String url) {
try {

if(browser.equalsIgnoreCase("chrome")){
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
driver = new ChromeDriver();
}else{
System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
driver = new FirefoxDriver();
}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get(url);

System.out.println("The browser:" + browser + " launched successfully");

} catch (Exception e) {

System.out.println("The browser:" + browser + " could NOT be launched successfully");
}
takeSnap();
}


/**
* This method will take snapshot of the browser
* @author Babu - TestLeaf
*/
public long takeSnap(){
long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 
try {
FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("./reports/images/"+number+".jpg"));
} catch (WebDriverException e) {
System.out.println("The browser has been closed");
} catch (IOException e) {
System.out.println("The snapshot could not be taken");
}
return number;
}


public void enterById(String idValue, String data) throws Exception {
// TODO Auto-generated method stub
try {
driver.findElementById(idValue).sendKeys(data);
} catch (Exception e) {
System.out.println("WebElement "+ idValue +" is not found"); 
}
finally
{
takeSnap();
System.out.println("WebElement "+ idValue +" is set with value " + data + " successfully"); 
}
}


public void enterByName(String nameValue, String data) throws Exception {
// TODO Auto-generated method stub
try {
driver.findElementByClassName(nameValue).sendKeys(data);
} catch (Exception e) {
System.out.println("WebElement "+ nameValue +" is not found");
}
finally
{ takeSnap();
System.out.println("WebElement "+ nameValue +" is set with value" +data+ "Successfully");
}

}


public void enterByXpath(String xpathValue, String data) throws Exception {
// TODO Auto-generated method stub
try{
driver.findElementByXPath(xpathValue).sendKeys(data);
} catch (Exception e) {
System.out.println("WebElement "+ xpathValue +" is not found");
}
finally
{ takeSnap();
System.out.println("WebElement "+ xpathValue +" is set with value" +data+ "Successfully");
}
}

public boolean verifyTitle(String title) {
// TODO Auto-generated method stub
return false;
}


public void verifyTextById(String id, String text) {
// TODO Auto-generated method stub
	try {
        
        String strText = driver.findElementById(id).getText();
       
        if(strText.contains(text))
        {
                        System.out.println("Text " + text + " is verified sucessfully");
        }
        else
        {
                        System.out.println("Text " + text + " is not verified sucessfully");
        }
} catch (Exception e) {
        // TODO: handle exception
        System.out.println("Unable to verify sucessful");
}


}


public void verifyTextByXpath(String xpath, String text) {
// TODO Auto-generated method stub
	 try {
         
         String loginText = driver.findElementByXPath(xpath).getText();
        
         if(loginText.contains(text))
         {
                         System.out.println("Text " + text + " is verified sucessfully");
         }
         else
         {
                         System.out.println("Text " + text + " is not verified sucessfully");
         }
} catch (Exception e) {
         // TODO: handle exception
         System.out.println("Unable to verify sucessful login");
}

}


public void verifyTextContainsByXpath(String xpath, String text) {
// TODO Auto-generated method stub

}


public void clickById(String id) throws Exception {
// TODO Auto-generated method stub
try{
driver.findElementById(id).click();
} catch(Exception e){
System.out.println("WebElement "+ id +" is not found");
}
finally{
takeSnap();
System.out.println("WebElement "+ id +  " click successfully");
}
}


public void clickByClassName(String classVal) throws Exception {
// TODO Auto-generated method stub
try {
driver.findElementByClassName(classVal).click();
} catch (Exception e) {
System.out.println("WebElement "+ classVal +" is not found");                  
}
finally
{
takeSnap();
System.out.println("WebElement "+ classVal +  " click successfully");                
}
}


public void clickByName(String name) throws Exception {
// TODO Auto-generated method stub
try{
driver.findElementByClassName(name).click();
} catch (Exception e) {
System.out.println("WebElement "+ name +" is not found");
}
finally
{ takeSnap();
System.out.println("WebElement "+ name +" is set with value" +name+ "Successfully");
}

}


public void clickByLink(String name) throws Exception {
// TODO Auto-generated method stub
try{
driver.findElementByLinkText(name).click();
} catch (Exception e) {
System.out.println("WebElement "+ name +" is not found");
}
finally
{ takeSnap();
System.out.println("WebElement "+ name +" is set with value" +name+ "Successfully");
}

}


public void clickByLinkNoSnap(String name) throws Exception {
// TODO Auto-generated method stub

}


public void clickByXpath(String xpathVal) throws Exception {
// TODO Auto-generated method stub
try{
driver.findElementByXPath(xpathVal).click();
} catch (Exception e) {
System.out.println("WebElement "+ xpathVal +" is not found");
}
finally
{ takeSnap();
System.out.println("WebElement "+ xpathVal +" is set with value" +xpathVal+ "Successfully");
}
}


public void clickByXpathNoSnap(String xpathVal) throws Exception {
// TODO Auto-generated method stub

}


public String getTextById(String idVal) {
// TODO Auto-generated method stub
return null;
}


public String getTextByXpath(String xpathVal) {
// TODO Auto-generated method stub
return null;
}


public void selectVisibileTextById(String id, String value) throws Exception {
// TODO Auto-generated method stub
	try {
		
	} catch (Exception e) {
		
	}

}


public void selectIndexById(String id, int value) throws Exception {
// TODO Auto-generated method stub
try{
	 Select dropdownIndex =new Select(driver.findElementById(id));
     dropdownIndex.selectByValue("value");

} catch (Exception e) {
System.out.println("WebElement "+ id +" is not found");
}
finally
{ takeSnap();
System.out.println("WebElement "+ id +" is set with value" +value+ "Successfully");
}

}


public void switchToParentWindow() {
// TODO Auto-generated method stub

}


public void switchToLastWindow() {
// TODO Auto-generated method stub

}


public void acceptAlert() {
// TODO Auto-generated method stub

}


public void dismissAlert() {
// TODO Auto-generated method stub

}


public String getAlertText() {
// TODO Auto-generated method stub
return null;
}


public void closeBrowser()  {
// TODO Auto-generated method stub

driver.close();


}


public void closeAllBrowsers() {
// TODO Auto-generated method stub

}



}

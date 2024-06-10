package org.unitj;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
 
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	 
	public static void chromeBrowser() {
           driver=new ChromeDriver();
           driver.manage().window().maximize();
	}   
	public static void launchBrowser(String Url) {
            driver.get(Url);
	}
	public static void passValue(WebElement element,String value) {
            element.sendKeys(value);
	}
	public static  void keyDown() {
            r.keyPress(KeyEvent.VK_DOWN);
            r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void keyEnter() {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static  String printTitle() {
      String title = driver.getTitle();
      return title;
	}
	public static  String getAttributeValue(WebElement element,String value) {
      String attribute = element.getAttribute(value);
      return attribute;
	}
	public static  void clickElement(WebElement element) {
       element.click();
	}
	public static void quit() {
		driver.quit();

	}
	public static void dateAndTime() {
         Date d=new Date();
         SimpleDateFormat s=new SimpleDateFormat("dd-MM/YYYY hh:mm:ss");
         System.out.println(s.format(d));
	}
	public void allElementWait() {
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	
	
	
	
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


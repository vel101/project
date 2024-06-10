package org.unitj;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForAssertion  extends BaseClass{
    
	@Test
	public void cased() {
       chromeBrowser();
       launchBrowser("https://www.facebook.com/");
       
       String title = driver.getTitle();
       System.out.println(title);
       
       String actual=title;
	Assert.assertTrue("To check title",actual.contains ("Facebook"));
	
	allElementWait();
	
	WebElement e = driver.findElement(By.id("email"));
	passValue(e, "siva");
	
	WebElement t = driver.findElement(By.id("pass"));
	passValue(t,"12354");		
	}
	
	@Test
	public void cas() throws InterruptedException {
		Thread.sleep(2000);
		
		

	}
	
	
	
	
	
	
	
}



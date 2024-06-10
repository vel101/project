package org.unitj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JunitJava extends BaseClass {

	@BeforeClass
	public static void browser() {
        chromeBrowser();
        launchBrowser("https://www.facebook.com/");
	}
	@Before
	public void date() {
         dateAndTime();
	}
	@Test
	public void run() {
		WebElement r = driver.findElement(By.id("email"));
        r.sendKeys("siva");
        WebElement e = driver.findElement(By.id("pass"));
        e.sendKeys("12345");
	}
	@Test
	public void turn() {
        WebElement a = driver.findElement(By.name("login"));
	    a.click();
	}
	@After
	public void date1() {
		dateAndTime();
	}
	@AfterClass
	public static void sysout() {
         System.out.println("javajunit ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

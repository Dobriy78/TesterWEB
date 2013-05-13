package testerWEB;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TestOne {
	
	  private WebDriver driver;
	  String baseUrl;
	  private StringBuffer verificationErrors = new StringBuffer();



	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
	    baseUrl = "http://depo-ssys-si:8080/";
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
    public void LoginLogoutTest() throws Exception {
			    driver.get("http://depo-ssys-si:8080/monitor/");
			    Thread.sleep(3000);
			    assertEquals("SSSS WEB interface workplace", driver.getTitle());
			    driver.findElement(By.xpath("//button[contains(text(),'Session')]")).click();
			    Thread.sleep(1500);
			    driver.findElement(By.xpath("//a/span[contains(text(),'Login')]")).click();
			    Thread.sleep(1500);
			    driver.findElement(By.name("login")).clear();
			    driver.findElement(By.name("login")).sendKeys("BNINIDJAAXXX");
			    driver.findElement(By.name("pwd")).clear();
			    driver.findElement(By.name("pwd")).sendKeys("1");
			    driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
			    try {
			      assertEquals("http://depo-ssys-si:8080/monitor/view/bdschedule", driver.getCurrentUrl());
			    } catch (Error e) {
			      verificationErrors.append(e.toString());
			    }
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("//button[contains(text(),'Session')]")).click();
			    Thread.sleep(1500);
			    driver.findElement(By.xpath("//a/span[contains(text(),'Logout')]")).click();
			    Thread.sleep(1500);
			    assertEquals("SSSS WEB interface workplace", driver.getTitle());
			    try {
			      assertEquals("http://depo-ssys-si:8080/monitor/login", driver.getCurrentUrl());
			    } catch (Error e) {
			      verificationErrors.append(e.toString());
			    }
	}
	
	 @After
	  public void tearDown() throws Exception {
	    driver.quit();
/*	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }*/
	  }
	}


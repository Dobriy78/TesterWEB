package testerWEB;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSingleTest {
	
	Variable my = new Variable();
	String UrlTest = my.getBaseUrl(); //"http://www.ya.ru"; //my2.getTestUrl();

	
  private WebDriver driver;
  String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	driver = new FirefoxDriver();
    baseUrl = UrlTest;
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
	SeleniumCommands.Open(UrlTest, driver);
	SeleniumCommands.Sleep(3000);
	SeleniumCommands.TypeText(By.id("text"),"Hello!", driver);
	SeleniumCommands.Click(By.xpath("//input[@value='']"), driver);
	SeleniumCommands.Sleep(3000);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}



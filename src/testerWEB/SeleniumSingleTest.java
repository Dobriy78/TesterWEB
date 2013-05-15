package testerWEB;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
//import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Suite.class)
@Suite.SuiteClasses({
   SomeTest.class
})

public class SeleniumSingleTest {
	
	static Variable my = new Variable();
	static String UrlTest = "http://www.ya.ru"; //my.getBaseUrl(); //"http://www.ya.ru"; //my2.getTestUrl();

	
  private static WebDriver driver;
  static String baseUrl;
  private static StringBuffer verificationErrors = new StringBuffer();
  


  @BeforeClass
  public static void setUp() throws Exception {
	driver = new FirefoxDriver();
    baseUrl = UrlTest;
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

/*  @Test
  public void myTest() throws Exception {
	SeleniumCommands.Open(UrlTest, driver);
	SeleniumCommands.Sleep(3000);
  }
  @Test
  public void myTest2() throws Exception {
	SeleniumCommands.TypeText(By.id("text"),"Hello!", driver);
	SeleniumCommands.Click(By.xpath("//input[@value='']"), driver);
	SeleniumCommands.Sleep(30000);
  }*/

  @AfterClass
  public static void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

public static WebDriver getDriver() {
	// TODO Auto-generated method stub
	return driver;
}
}



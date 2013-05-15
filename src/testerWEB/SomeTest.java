package testerWEB;

import org.junit.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SomeTest extends WebDriverAbstract {
	
	static Variable my = new Variable();
	static String UrlTest = my.getBaseUrl(); //"http://www.ya.ru"; //my.getBaseUrl();
	static String SCNFileName = my.getScenarioFileName();
	WebDriver driver = getDriver(); 

/*	  @Test
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
	  
	  @Test
	  public void AA() throws Exception {
	  SAX2parser.MyParser(SCNFileName);
	  }
}

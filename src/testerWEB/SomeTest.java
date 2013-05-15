package testerWEB;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SomeTest extends WebDriverAbstract {
	
	static Variable my = new Variable();
	static String UrlTest = "http://www.ya.ru"; //my.getBaseUrl();

	  @Test
	  public void myTest() throws Exception {
		WebDriver driver = getDriver();  
		SeleniumCommands.Open(UrlTest, driver);
		SeleniumCommands.Sleep(3000);
	  }
	
}

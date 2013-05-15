package testerWEB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class WebDriverAbstract {
	
	public static WebDriver getDriver() {
        WebDriver driver = SeleniumSingleTest.getDriver();
        if(driver != null) {
            return driver;
        }

        return new FirefoxDriver();
    }

}

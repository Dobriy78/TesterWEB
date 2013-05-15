package testerWEB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test extends WebDriverAbstract {
	
	static WebDriver driver = getDriver(); 


	public static void Open(String CommandTarget, String CommandValue){
		System.out.println("AA name - "+CommandTarget+" value "+CommandValue );
		driver.get(CommandTarget);
	}

	public static void Sleep(String CommandTarget, String CommandValue) {
		int sleepTime = Integer.parseInt(CommandTarget);
		try {
			Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
		
	public static void TypeText(By CommandTarget, String CommandValue){

	    driver.findElement(CommandTarget).clear();
	    driver.findElement(CommandTarget).sendKeys(CommandValue);
		}
		
	public static void Click(By CommandTarget, String CommandValue){
		driver.findElement(CommandTarget).click();
		}
	
	}
	
/*	public static void open2(String CommandTarget, String CommandValue){
		System.out.println("BB name - "+CommandTarget+" value "+CommandValue );
	}
	
	public static void open3(String CommandTarget, String CommandValue){
		System.out.println("CC name - "+CommandTarget+" value "+CommandValue );
	}
	
	public static void open4(String CommandTarget, String CommandValue){
		System.out.println("DD name - "+CommandTarget+" value "+CommandValue );
	}*/



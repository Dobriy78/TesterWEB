package testerWEB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumCommands {
	
/*	public static void main(String args[]) {

	MyCommand("click");
	
	}
*/	SeleniumSingleTest my = new SeleniumSingleTest();


	
	public static void Open(String commandTarget, WebDriver driver) {
		
		driver.get(commandTarget);
		SeleniumCommands.Sleep(2000);
/*		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	public static void Sleep(int commandTarget) {
		
		try {
			Thread.sleep(commandTarget);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void TypeText(By commandTarget, String commandValue, WebDriver driver){
		
	    driver.findElement(commandTarget).clear();
	    driver.findElement(commandTarget).sendKeys(commandValue);
	}
	
	public static void Click(By commandTarget, WebDriver driver){
		
		driver.findElement(commandTarget).click();
	}
	
	
	public static void MyCommand(String commandOperator, String commandTarget, String commandValue) {
		
		if (commandOperator.equals("open")) {
	    	System.out.println("Operator = OPEN page= "+commandTarget);
	    } else
		
		if (commandOperator.equals("click")) {
	    	System.out.println("Operator = CLICK");
	    }
		
		else {
			System.out.println("Your operator = " +commandOperator+ " not found!");
		}
	}
}

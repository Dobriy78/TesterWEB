package testerWEB;

import java.io.File;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
/*import org.junit.runner.Result;
import org.junit.runner.notification.Failure;*/

public class TesterWEB { 

	public static void main(String args[]) throws Exception {
		
		int numberOfArgs = args.length;
		for (int i=0; i<numberOfArgs; i++){
		System.out.println("I’ve got " + args[i]);
		}
		if (args.length != 2){
			System.out.println("Error: Yor mast send all parameters like TesterWEB Config and Scenario, or Batch name"); 
			// exit from this
			System.exit(0);
			} else {
					
		testerConfig(args[0]); //argument 1 - testerWeb configFile
		testerScenario(args[1]); //argument 2 - testerWeb scenario
		
			}
		
	}
	
	//check for file testerWebconfig.xml
	
	public static void testerConfig(String name) throws Exception {
		
		File testerConfigFile = new File(name+".xml");
		String xmlFileName = name+".xml";
		if (testerConfigFile.exists()) {
			
		System.out.println("This is config file, with name - " +name);
		SAX2parser.MyParser(xmlFileName);
		
		} else
			
		System.out.println("File " + testerConfigFile.getName()	+ " not exist!");
		
	}
	
	public static void testerScenario(String name) throws Exception {
		
		File testerScenarioFile = new File(""+name+".xml");
		String xmlFileName = ""+name+".xml";
		if (testerScenarioFile.exists()) {
		System.out.println("This is scenario file, with name - " +name);
		Variable my = new Variable();
		my.setScenarioFileName(xmlFileName);
		System.out.println("Scenario File Name: "+my.getScenarioFileName());
		
		//SAX2parser.MyParser(xmlFileName);
		
		 JUnitCore junit = new JUnitCore();
		 junit.addListener(new TextListener(System.out));
		 junit.run(SeleniumSingleTest.class);
		
/*		Result result = JUnitCore.runClasses(SeleniumSingleTest.class);
		for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());*/
		
		} else
			
			System.out.println("File " + testerScenarioFile.getName()	+ " not exist!");
	}

}

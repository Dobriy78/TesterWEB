package testerWEB;

import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//import org.openqa.selenium.WebDriver;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.XMLReaderFactory;
import org.xml.sax.helpers.DefaultHandler;


public class SAX2parser extends DefaultHandler
{

   public Method method;
//   private WebDriver driver;

	// public static void main(String args[]) //uncomment for testing a file
    public static void MyParser(String xmlFileName)
	throws Exception
    {
	XMLReader xr = XMLReaderFactory.createXMLReader();
	SAX2parser handler = new SAX2parser();
	xr.setContentHandler(handler);
	xr.setErrorHandler(handler);

				// Parse each file provided on the
				// command line.
	//for (int i = 0; i < args.length; i++) {
	   // FileReader r = new FileReader("TesterWEB.xml"); //uncomment for testing a file
	    FileReader r = new FileReader(xmlFileName);
	    xr.parse(new InputSource(r));
	//}
    }


    public SAX2parser ()
    {
	super();
    }


    ////////////////////////////////////////////////////////////////////
    // Event handlers.
    ////////////////////////////////////////////////////////////////////


    public void startDocument ()
    {
	//System.out.println("Start document");
    }


    public void endDocument ()
    {
	//System.out.println("End document");
    }


    public void startElement (String uri, String name,
			      String qName, Attributes atts)
    {
	if ("".equals (uri)) {
	  //  System.out.println("Start element: " + qName);
	    if (qName.equals("Var")) {
	    	System.out.println("Var name: "+atts.getValue("name")+" Value: "+atts.getValue("value"));
	    	if (atts.getValue("name").equals("baseUrl")){
	    		String TestBaseUrl = atts.getValue("value");
	    		System.out.println("Var Baseurl: "+TestBaseUrl);
	    		Variable my = new Variable();
				my.setBaseUrl(TestBaseUrl);
				System.out.println("Set BaseUrl: "+my.getBaseUrl());
	    	}
	    	if (atts.getValue("name").equals("driver")){
	    		String TestDriver = atts.getValue("value");
	    		System.out.println("Var TestDriver: "+TestDriver);
	    		Variable my = new Variable();
				my.setDriver(TestDriver);
				System.out.println("Set Driver: "+my.getDriver());
	    	}
	    }
	    if (qName.equals("Scenario")) {
	    	System.out.println("Scenario name:   "+atts.getValue("name"));
	    	System.out.println("Scenario speed:  "+atts.getValue("speed"));
	    	System.out.println("Scenario repeat: "+atts.getValue("repeat"));
	    	String ScenarioName = atts.getValue("name");
			Variable my = new Variable();
			my.setScenarioName(ScenarioName);
			System.out.println("Scenario Name: "+my.getScenarioName());
	    }
	    if (qName.equals("Step")) {
	    	System.out.println("Step operator:   "+atts.getValue("operator"));
	    	String CommandName = atts.getValue("operator");//.toLowerCase();
	    	System.out.println("Step target:     "+atts.getValue("target"));
	   // 	String CommandTarget = atts.getValue("target");
	    	System.out.println("Step value:      "+atts.getValue("value"));
	   // 	String CommandValue = atts.getValue("value");
	    	//SeleniumCommands.MyCommand(CommandName,CommandTarget,CommandValue);
	    	try {
	    		Test myTestClass = new Test();
	    		Class<?> TestClass = myTestClass.getClass();
				method = TestClass.getMethod(CommandName, String.class, String.class);
				method.invoke(TestClass, atts.getValue("target"), atts.getValue("value"));
				System.out.println("Public method found: " +method.toString());
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}
	else{
	 //   System.out.println("Start element: {" + uri + "}" + name);
	}
    }


    public void endElement (String uri, String name, String qName)
    {
	if ("".equals (uri)) {
	 //   System.out.println("End element: " + qName);
	}
	else {
	 //   System.out.println("End element:   {" + uri + "}" + name);
	}
    }

/*
    public void characters (char ch[], int start, int length)
    {
	System.out.print("Characters:    \"");
	for (int i = start; i < start + length; i++) {
	    switch (ch[i]) {
	    case '\\':
		System.out.print("\\\\");
		break;
	    case '"':
		System.out.print("\\\"");
		break;
	    case '\n':
		System.out.print("\\n");
		break;
	    case '\r':
		System.out.print("\\r");
		break;
	    case '\t':
		System.out.print("\\t");
		break;
	    default:
		System.out.print(ch[i]);
		break;
	    }
	}
	System.out.print("\"\n");
    }
*/    
    public void characters(char[] c, int start, int length) 
            throws SAXException {
super.characters(c, start,  length);
for(int i=start;i< start+length;++i)
System.err.print(c[i]);
}
    

}

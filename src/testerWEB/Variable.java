package testerWEB;

public class Variable {
	
	 static String BaseUrl;
	 static String Driver;
	 static String ScenarioFileName;
	    
	    public String getBaseUrl()
	    {
	    //  System.out.println("Base url is: "+BaseUrl);
	      return BaseUrl;
	    }
	 
	    public void setBaseUrl(String BaseUrl)
	    {
	      Variable.BaseUrl = BaseUrl;
	    //  System.out.println("Base url is: "+BaseUrl);
	    }
	    
	    public String getDriver()
	    {
	    //  System.out.println("Base url is: "+Driver);
	      return Driver;
	    }
	 
	    public void setDriver(String Driver)
	    {
	      Variable.Driver = Driver;
	    //  System.out.println("Base url is: "+Driver);
	    }
	    
	    public String getScenarioFileName()
	    {
	    //  System.out.println("Base url is: "+Driver);
	      return ScenarioFileName;
	    }
	 
	    public void setScenarioFileName(String ScenarioFileName)
	    {
	      Variable.ScenarioFileName = ScenarioFileName;
	    //  System.out.println("Base url is: "+Driver);
	    }
	    
}

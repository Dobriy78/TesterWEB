package testerWEB;

public class Variable {
	
	 static String BaseUrl;
	 static String Driver;
	    
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
	    
}

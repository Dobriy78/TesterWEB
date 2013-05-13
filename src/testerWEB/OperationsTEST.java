package testerWEB;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OperationsTEST {
	
	   public Method method;
	   
	public void OpTEST(String CommandName, String CommandTarget, String CommandValue){
	
	try {
		Test myTestClass = new Test();
		Class<?> TestClass = myTestClass.getClass();
		method = TestClass.getMethod(CommandName, String.class, String.class);
		method.invoke(TestClass, CommandTarget, CommandValue);
		System.out.println("Public method found: " +method.toString());
	} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
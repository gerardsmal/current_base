package com.betacom.process;

import com.betacom.exception.AcademyException;
import com.betacom.utils.ReflectionManager;

public class ProcessReflection2 extends ReflectionManager{

	private Object myClass = null;
	public boolean execute() {
		System.out.println("Begin ProcessReflection");
		
		String packageName = "com.betacom.objects";
		String className = "MyClassRefection";
		Object[] params = {20, "test numero 2", 45}; // define parameters for new instance
//		Object[] params = {20, "test numero 2", 45, "pluto"}; // define parameters for new instance
//		Object[] params = {20, "test numero 2"};
//		Object[] params = {};
		try {
			Object myClass = classNewInstance(packageName + "." + className, params);

			
			Object[] paramsMethod = {"test con metodo.."};	
			executeMethod(myClass, "setDesc", paramsMethod);
			
			Object[] paramsMethod1 = {};	
			String msg = (String) executeMethod(myClass, "toString", paramsMethod1);
			
			System.out.println(msg);
			return true;
			
		} catch (AcademyException e) {
			System.out.println(e.getMessage());
			return false;
		} 	
	}
		
	
}

package com.betacom.process;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import com.betacom.exception.AcademyException;

public class ProcessReflection2 {

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
			Object myClass = retrieveConstructor(packageName + "." + className, params);
			
			String methodName = "toString";
			Method toString = myClass.getClass().getMethod(methodName);
			
			String msg = (String)toString.invoke(myClass);
			System.out.println(msg);
			return true;
			
		} catch (AcademyException e) {
			System.out.println(e.getMessage());
			return false;
		} catch (NoSuchMethodException e) {
			System.out.println(e.getMessage());
			return false;
		} catch (SecurityException e) {
			System.out.println(e.getMessage());
			return false;
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
			return false;
		} catch (InvocationTargetException e) {
			System.out.println(e.getMessage());
			return false;
		}
		

	}
		
	
	private Object retrieveConstructor(String className, Object[] params) throws AcademyException {
		try {
			Class cl = Class.forName(className);  // class search
			Constructor[] ctore = cl.getConstructors(); // search all constructors
			Constructor  selectedCtore = null;
			/*
			 * Find constructor
			 */
			for (Constructor ctor1:ctore) {
				if (ctor1.getParameterCount() == params.length) { //parameters length is used for search the correct constructor
					selectedCtore = ctor1;
					break;
				}
			}
			if (selectedCtore == null)
				throw new AcademyException("contructor not found with these parameters" );
			
			return selectedCtore.newInstance(params);
			
		} catch (ClassNotFoundException e) {
			throw new AcademyException("Class not found :" + e.getMessage());
		} catch (InstantiationException e) {
			throw new AcademyException("InstantiationException :" + e.getMessage());
		} catch (IllegalAccessException e) {
			throw new AcademyException("IllegalAccessException :" + e.getMessage());
		} catch (IllegalArgumentException e) {
			throw new AcademyException("IllegalArgumentException :" + e.getMessage());
		} catch (InvocationTargetException e) {
			throw new AcademyException("InvocationTargetException :" + e.getMessage());
		}
		
	}
	
}

package com.betacom.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.betacom.exception.AcademyException;

public class ReflectionManager {

	public Object executeMethod(Object myClass,String methodName, Object[] params) throws AcademyException {
		try {
			
			Method[] methods = myClass.getClass().getMethods();
			Method metodoRoExecute = null;
			for (Method metodo:methods) {
				if (methodName.equalsIgnoreCase(metodo.getName())) {
					metodoRoExecute = metodo;
					break;
				}
			}
			
			if (metodoRoExecute == null)
				throw new AcademyException("Method not found :" + methodName);
			return metodoRoExecute.invoke(myClass, params);
			
		} catch (SecurityException e) {
			throw new AcademyException("SecurityException :" + e.getMessage());
		} catch (IllegalAccessException e) {
			throw new AcademyException("IllegalAccessException :" + e.getMessage());
		} catch (InvocationTargetException e) {
			throw new AcademyException("InvocationTargetException :" + e.getMessage());
		}
		
	}
	
	
	
	public Object classNewInstance(String className, Object[] params) throws AcademyException {
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

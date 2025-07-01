package com.betacom;

import com.betacom.process.ProcessInterface;

public class MainInterfaces {

	public static void main(String[] args) {
		
		if (new ProcessInterface().execute()) {
			System.out.println("Fine normale del processo");
		} else {
			System.out.println("Error nel processo");
		}
	}

}

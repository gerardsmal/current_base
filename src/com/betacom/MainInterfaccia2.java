package com.betacom;

import com.betacom.process.ProcessInterfaccia2;

public class MainInterfaccia2 {

	
public static void main(String[] args) {
		
		if (new ProcessInterfaccia2().execute()) {
			System.out.println("Fine normale del processo");
		} else {
			System.out.println("Error nel processo");
		}
	}


}

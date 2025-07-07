package com.betacom;

import com.betacom.process.ProcessReflection;
import com.betacom.process.ProcessReflection2;

public class MainReflection {

	public static void main(String[] args) {
		int tipo = 2;
		
		if (tipo == 0) {
			if (new ProcessReflection().execute()) {
				System.out.println("Fine normale del processo");
			} else {
				System.out.println("Error nel processo");
			}

		} else {
			if (new ProcessReflection2().execute()) {
				System.out.println("Fine normale del processo");
			} else {
				System.out.println("Error nel processo");
			}
	
		}


	}

}

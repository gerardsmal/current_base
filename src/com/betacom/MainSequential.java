package com.betacom;

import com.betacom.process.ProcessSequential;

public class MainSequential {

public static void main(String[] args) {
		
		if (new ProcessSequential().execute()) {
			System.out.println("Fine normale del processo");
		} else {
			System.out.println("Error nel processo");
		}
	}

}

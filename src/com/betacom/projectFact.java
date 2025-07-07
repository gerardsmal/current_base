package com.betacom;

import com.betacom.process.ProcessFact;

public class projectFact {
	public static void main(String[] args) {
		if (new ProcessFact().execute()) {
			System.out.println("Fine normale del processo");
		} else {
			System.out.println("Error nel processo");
		}
	}
}

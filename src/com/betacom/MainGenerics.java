package com.betacom;

import com.betacom.process.ProcessGenerics;

public class MainGenerics {

	public static void main(String[] args) {
		if (new ProcessGenerics().execute()) {
			System.out.println("Fine normale del processo");
		} else {
			System.out.println("Error nel processo");
		}

	}

}

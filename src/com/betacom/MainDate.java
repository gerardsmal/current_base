package com.betacom;

import com.betacom.process.ProcessDate;

public class MainDate {

	public static void main(String[] args) {
		
		System.out.println("Begin MainDate :" + args[0]);
		String input = "01/06/2025";
		
		if (new ProcessDate().execute(input)) {
			System.out.println("Fine normale del processo.");
		} else {
			System.out.println("Errore nel processo");
		}
	}

}

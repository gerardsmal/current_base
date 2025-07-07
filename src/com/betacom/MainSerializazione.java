package com.betacom;

import com.betacom.process.ProcessSerializazione;

public class MainSerializazione {
	public static void main(String[] args) {
		if (new ProcessSerializazione().execute()) {
			System.out.println("Fine normale del processo");
		} else {
			System.out.println("Error nel processo");
		}

	}

}

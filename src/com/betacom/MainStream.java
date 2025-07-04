package com.betacom;

import com.betacom.process.ProcessStream;

public class MainStream {

	public static void main(String[] args) {
		if (new ProcessStream().execute()) {
			System.out.println("Fine normale del processo");
		} else {
			System.out.println("Error nel processo");
		}

	}

}

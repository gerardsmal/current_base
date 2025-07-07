package com.betacom;

import com.betacom.process.ProcessInner;

public class MainInner {

	public static void main(String[] args) {
		if (new ProcessInner().execute()) {
			System.out.println("Fine normale del processo");
		} else {
			System.out.println("Error nel processo");
		}

	}
}

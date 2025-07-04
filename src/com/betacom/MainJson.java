package com.betacom;

import com.betacom.process.ProcessJson;

public class MainJson {
public static void main(String[] args) {
		
		if (new ProcessJson().execute()) {
			System.out.println("Fine normale del processo");
		} else {
			System.out.println("Error nel processo");
		}
	}

}

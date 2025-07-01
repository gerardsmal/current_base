package com.betacom.singletone;

public class MySingleTone {

	private static MySingleTone instance = null;
	
	private MySingleTone() {}	

	private Integer idx = 0;
	
	public static MySingleTone getInstance() {
		if (instance == null) {
			instance = new MySingleTone();
		}
		return instance;
	}
	
	
	public Integer computeIndice() {
		return idx++;
	}
}

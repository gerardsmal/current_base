package com.betacom;

import com.betacom.objects.Impiegati;

public class MainEredit {

	public static void main(String[] args) {
		System.out.println("Begin MainEredit");
		
		Impiegati imp = new Impiegati("Paola", "Verde", true, 1500.0);
		
		System.out.println(imp);

		
		imp = new Impiegati();
		imp.setCognome("Bianco");
		imp.setNome("Bruno");
		imp.setSesso(true);
		imp.setSalary(2000.0);
		
		System.out.println(imp);
	}

}

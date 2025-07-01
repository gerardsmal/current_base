package com.betacom;

import java.util.StringTokenizer;

public class MainString {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		/*
		 * Build string using append
		 */

		sb.append("Buongiorno");
		sb.append(" , ");
		sb.append("sono");
		sb.append(" ");
		sb.append("Gérard");

		String rS = sb.toString();
		System.out.println(rS);
		
		/*
		 * Build string using string format
		 */
		
		String n = "Gèrard";
		String f = "Francese";
		String r = String.format("Mio nome é %s, sono %s ", n, f);
		String r1 = "Mio nome é " + n + " sono " + f;
		System.out.println(r1);
		
		
		if (n.equalsIgnoreCase("gèrard"))
			System.out.println("found ....");
		else
			System.out.println("Not found");
	
		if (rS.contains(","))
			System.out.println("found comma");
		else
			System.out.println("NOT found comma");
		
		String test = "     ".trim();
		if (test.isEmpty())
			System.out.println("parametro vuoto..");
		
		/*
		 * String compare
		 */
		String p1 = "Samsung";
		String p2 = "Samsungqaa";
		int result = p2.compareTo(p1);
		System.out.println("compare :" + result);
		
		
		/*
		 * transform integer to String
		 */
		int numero = 20;
		String numeroStr = String.valueOf(numero);
		System.out.println(numeroStr);
		
		/*
		 * Transform String in array
		 */
		String parameters = "token1,token1,token2,token3,token4,token5,token6,token7";
		String[] tokens = parameters.split(",");
		for (String it:tokens) {
			System.out.println(it);
		}
		
		/*
		 * Transform string in token
		 */
		System.out.println("****StringTokenizer *****");
		StringTokenizer st = new StringTokenizer(parameters,",");
		
		while(st.hasMoreTokens()) {
			String tst = st.nextToken();
			System.out.println("Token trovato:" + tst);
			
		}
		
		
		
		
		
	}

}

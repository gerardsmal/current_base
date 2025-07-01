package com.betacom;

import java.util.ArrayList;
import java.util.Scanner;

import com.betacom.objects.User;
import com.betacom.utils.PromozioneAutomatica;

public class MainBase {

	public static void main(String[] args) {
		/*
		 * primitive	
		 */
		byte b = 127;
		int i = 2_000_000_000;
		long j = 9_473_892_479_237L; // - separatore 
		short k = 32767;
		float l = 5.345611f;
		double m = 5.123552345657678;
		char n = 'z';
		boolean o = false;
		/*
		 * referenxe
		 */
		String str = "ciao sono una string";

		System.out.print(str + "\n");

		System.out.print(str.toUpperCase() + "\n");

		Scanner sc = new Scanner(System.in);
		System.out.println("nome:");
		String nome = sc.nextLine();

		/*
		 * operatori logici
		 * && and
		 * || or
		 * < > <= >=
		 */
		
//		boolean rc = (10 < 16) && (n != 'p') ;
//		System.out.println("risposta logica:" + rc);
		int eta = 30;
		String result ="";
		if (eta < 50) {
			result = " sono in ragazzino";
		}
		else {
			result = " sono vacchio";
		}
		// ternary expression
		//		String result = (eta < 50) ? " sono un ragazzino" : " sono vecchio";
		
		
		System.out.println("Ciao sono " + nome + result);
		
		/*
		 * operatori aritmetici
		 * + - / * %
		 */
		
		i = 20;
		i++;
		int jj = 3;
		int res = i * jj;
		int div = res / 2;
		int remi = res % 2;
		
		System.out.println("valore di i:" + i + " i*j:" + res + " res/2:" + div + " resto:");
		
		String param = "1234";
		div =  Integer.parseInt(param) / 2;
		System.out.println("result:" + div);
		
		String text = "jskjkdjdskidodipjjdjdjdajdjkjdajdooooj";
		
		System.out.println("text length:" + text.length() + " " + text.substring(4, 6));
		text = "    inizio      corso di java       ";
		System.out.println(">>" + text.trim() +"<<");
		
		String search = "corso";
		if (text.trim().contains(search))
			System.out.println("trovato la string " + search);
		else
			System.out.println("NON trovato la string " + search);
		
		if (text.trim().startsWith("inizio"))
			System.out.println("prefix trovato" );
		else
			System.out.println("prefix NON trovato");
		
		/*
		 * Array fissi
		 */
		
		String[] array = new String[4];
		array[0] = "primo";
		array[1] = "secondo";
		array[2] = "terzo";
		array[3] = "quarto";
		
		
		for (int idx = 0; idx < array.length; idx++) {
			System.out.println("idx:" + idx + " " + array[idx] + " String length :" + array[idx].length());
		}
		
		
		for (String it:array) {
			System.out.println(it);
		}
		
		int[] numeri = {10,20,30, 50, 60 };
		
		numeri[3] = 100;
		
		for (int numero:numeri) {
			System.out.println(numero);
		}
		
		
		
		/*
		 * Array dinamiche
		 */
		
		ArrayList<String> dynam = new ArrayList<String>();
		dynam.add("dynam 1");
		dynam.add("dynam 2");
		dynam.add("dynam 3");
		dynam.add("dynam 4");
		dynam.add("dynam 5");
		dynam.add("dynam 6");
		dynam.add("dynam 7");
		dynam.add("dynam 8");
		dynam.add("dynam 9");
		dynam.add("dynam 10");
		dynam.add("dynam 11");
		
		System.out.println("dynam length:" + dynam.size());
		
		for (String it:dynam) {
			System.out.println(it  + " string length:" + it.length());
			if (it.equalsIgnoreCase("Dynam 6"))
				break;
			
		}
		
		
		/*
		 * array 2D
		 * 
		 */
		String[][] classi = new String[3][2];
		
		classi[0][0] = "elem 0 class 0";
		classi[0][1] = "elem 1 class 0";

		classi[1][0] = "elem 0 class 1";
		classi[1][1] = "elem 1 class 1";

		classi[2][0] = "elem 0 class 2";
		classi[2][1] = "elem 1 class 2";

		String extract = "class 1";
		
		for (int id1 = 0; id1 < classi.length; id1++) {
			for (int id2 = 0; id2 < classi[id1].length; id2++) {
				if (classi[id1] [id2].contains(extract))
					System.out.println(classi[id1] [id2]);
			}
		}
		/*
		 * wrapped class
		 */
		Integer prim;
		Boolean bool;
		Double  doub;
		Character car;
		Float fl;
		Long  lon;

		ArrayList<User> lUsers = new ArrayList<User>();

		lUsers.add(new User("Pietro", "Uno"));
		lUsers.add(new User("Paolo", "Due"));
		lUsers.add(new User("Anna", "Tre", false));
		lUsers.add(new User("Carmen", "Quatro"));
		lUsers.add(new User("Giuseppe", "Cinque"));
		
		System.out.println(lUsers);
		
//		for (User it:lUsers) {
//			System.out.println(it);
//		}
		
		PromozioneAutomatica pA = new PromozioneAutomatica();
		double t = 0;
		int inte = 10;
		t = inte;
		boolean bb = true;
		
		Double dW = (double) 10;
		
		pA.method(inte);
		pA.method(dW);
		pA.method(bb);
		pA.method("Parametro String");
		
	}

	
	
}

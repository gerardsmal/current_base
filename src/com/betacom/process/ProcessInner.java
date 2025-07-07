package com.betacom.process;

import com.betacom.objects.Inner;
import com.betacom.objects.Inner2;

public class ProcessInner {
	public boolean execute() {
		System.out.println("Begin ProcessInner");
		Inner inner = new 	Inner();
		inner.setFatherClass("Siamo nella class Padre");
		inner.setNumero(3);

		System.out.println("Class inner :" + inner.getFatherClass() + " numero:" + inner.getNumero());
		
		/*
		 * New instance del figlio
		 */
		Inner.Figlio figlio = inner.setInstaceFiglio();
		figlio.setNumero2(44);  // set value for figlio
		System.out.println("Valore de figlio: " + figlio.displayNumeri());
		/*
		 * new instance del nipote
		 */
		Inner.Figlio.Nipote nipote = figlio.setInstaceNipote();
		nipote.setNumero3(99);
		
		System.out.println("Valore del Nipote: " + nipote.displayNumeriNipote());
		
		
		/*
		 * new instance automatico
		 */
		Inner2 inner2 = new Inner2();
		inner2.setFatherClass("Siamo nella class Padre");
		inner2.setNumero(3);
		
		System.out.println("Class inner :" + inner.getFatherClass() + " numero:" + inner.getNumero());
		
		inner2.f.setNumero2(35);
		System.out.println("Valore del figlio:" + inner2.f.displayNumeri());
		
		
		inner2.f.n.setNumero3(87);
		System.out.println("Valore del Nipote :" + inner2.f.n.displayNumeriNipote());
		
		Inner2 inner3 = new Inner2();
		inner3.f.n.setNumero3(43);
		
		System.out.println("Valore del Nipote :" + inner3.f.n.displayNumeriNipote());
		
		return true;
	}
}

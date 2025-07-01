package com.betacom.objects;

import java.util.function.Predicate;

import com.betacom.process.interfaces.Preda;
import com.betacom.process.interfaces.Predatore;

public class Pesce implements Preda, Predatore{

	@Override
	public void sonoUnPredatore() {
		System.out.println("Sono un pesce e sono un predatore");
		
	}

	@Override
	public void sonoUnaPreda() {
		System.out.println("Sono un pesce e sono una preda");
		
	}

	

}

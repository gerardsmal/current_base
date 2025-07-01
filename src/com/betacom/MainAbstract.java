package com.betacom;

import com.betacom.objects.BMW;
import com.betacom.objects.Car;
import com.betacom.objects.Fiat500;

public class MainAbstract {

	public static void main(String[] args) {
		System.out.println("Begin MainAbstract");
		
		Fiat500 fiat = new Fiat500();
		fiat.setModel("500");
		fiat.setColor("Giallo");
		fiat.setMaxSpeed(150);
		
		fiat.accelera();
		fiat.frena();
		System.out.println("Model :" + fiat.getModel());

		
		BMW bmw = new BMW();
		bmw.setModel("M3");
		bmw.setColor("Bianca");
		bmw.setMaxSpeed(250);
		
		bmw.accelera();
		bmw.frena();

		System.out.println("Model :" + bmw.getModel());

	}

}

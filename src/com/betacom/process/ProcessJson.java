package com.betacom.process;

import java.util.ArrayList;
import java.util.List;

import com.betacom.objects.Cliente;
import com.betacom.objects.DataNascita;
import com.google.gson.Gson;

public class ProcessJson {
	public boolean execute() {
		System.out.println("Begin ProcessJson");
		
		Cliente p = new Cliente("Paolo", "Verdi", new DataNascita(1, 10, 1999));
		
		Gson gson = new Gson(); 
		
		String jsonString = gson.toJson(p);
		
		
		System.out.println("Object to json:" + jsonString);
		
		
		
		Cliente newCliente = gson.fromJson(jsonString, Cliente.class);
		System.out.println("Class generata:" + newCliente);
		
		
		List<Cliente> lC = new ArrayList<Cliente>();
		lC.add(new Cliente("Paolo", "Verdi", new DataNascita(1, 10, 1999)));
		lC.add(new Cliente("Mario", "Rossi", new DataNascita(27, 2, 2001)));
		lC.add(new Cliente("Antonio", "Giallo", new DataNascita(5, 4, 2006)));
		lC.add(new Cliente("Anna", "Nera", new DataNascita(5, 9, 1986)));
		lC.add(new Cliente("Stefania", "Bianca", new DataNascita(30, 4, 2002)));
		
		jsonString = gson.toJson(lC);
		System.out.println("Lista json:" + jsonString);
		
		List<Cliente> res = gson.fromJson(jsonString, List.class);
		
		System.out.println("List generata:" + res);
		
		
		return true;
	}
}

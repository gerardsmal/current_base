package com.betacom.process;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.betacom.objects.Cliente;
import com.betacom.objects.ClienteStream;
import com.betacom.objects.DataNascita;
import com.betacom.objects.Generica;

public class ProcessGenerics {
	public boolean execute() {
		System.out.println("Begin ProcessGenerics");
		
		List<ClienteStream> lC = Stream.of(
				new ClienteStream("Paolo", "Rossi", 30, 1800.00),
				new ClienteStream("Pietro", "Verde", 24, 1300.00),
				new ClienteStream("Anna", "Blue", 40, 1800.00),
				new ClienteStream("Giuseppe", "Giallo", 45, 1800.00),
				new ClienteStream("Alex", "Bainco", 38, 1900.00),
				new ClienteStream("Cristina", "Nero", 50, 2000.00),
				new ClienteStream("Ugo", "Griggio", 35, 1850.00)
				)
				.collect(Collectors.toList());
		
		Generica<ClienteStream> lG = new Generica<ClienteStream>();
		
		lG.setRc(true);
		lG.setDati(lC);
		
		System.out.println(lG);
		
		
		List<Cliente> lcli = Stream.of(
				new Cliente("Paolo", "Verdi", new DataNascita(1, 10, 1999)),
				new Cliente("Mario", "Rossi", new DataNascita(1, 11, 1999)),
				new Cliente("Maria", "Gaiallo", new DataNascita(1, 2, 2000)),
				new Cliente("Giuseppe", "Nera", new DataNascita(1, 4, 2001))
				)
				.collect(Collectors.toList());
		Generica<Cliente> lCliS = new Generica<Cliente>();
		
		lCliS.setRc(true);
		lCliS.setDati(lcli);
		
		System.out.println(lCliS);
		
		
		
		
		return true;
	}
}

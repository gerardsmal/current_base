package com.betacom.process;

import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.betacom.objects.ClientStremMap;
import com.betacom.objects.ClienteStream;

public class ProcessStream {

	
	public boolean execute() {
		System.out.println("Begin ProcessStream");
		
		/*
		 * create stream object
		 */
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

		lC.forEach(c -> System.out.println(c));
		
		
		/*
		 * create stream con Builder
		 */

		Stream<String> streamBuilder = Stream.<String>builder()
				.add("Lunedi")
				.add("Martedi")
				.add("Mercoledi")
				.add("Giovedi")
				.add("Venerdi")
				.add("Sabato")
				.add("Domenica")
				.build();
		
		/*
		 * transform in array di string
		 */
		String[] giorni = streamBuilder.toArray(size -> new String[size]);
		System.out.println("Giorni length:" + giorni.length + " giorni[4]:" + giorni[4]);
		
		/*
		 * creazione random
		 */
		Random ran = new Random();
		Stream<Integer> lg = Stream.generate(() -> ran.nextInt()).limit(10);
		lg.forEach(it -> System.out.println(it));
		
		/*
		 * Generazione dati primitive
		 */
		System.out.println("Generazione interi con range");
		IntStream intStream  = IntStream.range(2, 15);
		intStream.forEach(it -> System.out.println(it));
		
		System.out.println("---------- filter by eta > 40 --------");
		
		/*
		 * filtro usando Stream
		 */
		lC.stream()
			.filter(c -> c.getEta() >= 40)
			.filter(c -> c.getCognome().startsWith("N"))
			.forEach(c -> System.out.println(c));
		
		/*
		 * Mapping
		 */
		System.out.println("Transformazione ClienteStream in ClienteStreamMap");
		List<ClientStremMap> lM = lC.stream()
				.map(c -> new ClientStremMap(
						c.getNome() + " " + c.getCognome(),
						c.getEta(),
						c.getStipendio()))
				.collect(Collectors.toList());
		lM.forEach(c -> System.out.println(c));
		
		/*
		 * Count
		 */
		System.out.println("----- funzione di count -------");
		long count = lC.stream()
				.filter(c -> c.getEta() >= 40)
				.count();
		System.out.println("Numero di cliente con eta >= 40:" + count);
		
		/*
		 * Match
		 */
		boolean rc = lC.stream()
			.anyMatch(c -> c.getCognome().startsWith("Z"));
		
		System.out.println("Result del match :" + rc);
		
		
		/*
		 * Sort
		 */
		System.out.println("-------- Sort ----------");
			
//		lC.sort(new Comparator<ClienteStream>() {
//
//			@Override
//			public int compare(ClienteStream o1, ClienteStream o2) {
//				return o1.getEta() - o2.getEta();
//			}
//		});
//		
		lC.sort((ClienteStream o1, ClienteStream o2) -> o1.getEta() - o2.getEta() );
		lC.forEach(c -> System.out.println(c));
		
		return true;
		
	}
}

package com.betacom.process;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.betacom.objects.Impiegati;

public class ProcessCollection {

	public boolean execute(int id) {
		System.out.println("Begin ProcessCollection");
		
		if (id == 0) executeList();
		if (id == 1) executeMap();
		if (id == 2) mapTest();
		
		return true;
	}
	
	private void executeList() {
		System.out.println("List process");
		/*
		 * List create
		 */
		List<Impiegati> lI = new ArrayList<Impiegati>();
		
		lI.add(new Impiegati("Paolo", "Verdi", true, 1500.0));
		lI.add(new Impiegati("Bruno", "Nero", true, 2000.0));
		lI.add(new Impiegati("Anna", "Bianco", true, 1600.0));
		lI.add(new Impiegati("Maria", "Giallo", true, 1300.0));
		lI.add(new Impiegati("Giuseppe", "Azzura", true, 1900.0));
		lI.add(new Impiegati("Luigi", "Rosso", true, 2500.0));
		lI.add(new Impiegati("Carola", "Viola", true, 2100.0));
		lI.add(new Impiegati("Antonio", "Verde", true, 1800.0));
		
		listImpiegati(lI);
		

		Impiegati save = removeFromImpegato("Giallo", lI);
		System.out.println("After remove");	
		listImpiegati(lI);
		
		if (save != null)
			lI.add(save);
		
		System.out.println("After first save");
		listImpiegati(lI);

		lI.add(save);
		System.out.println("After second save");
		listImpiegati(lI);

		save = removeFromImpegato("Giallo", lI);
		System.out.println("After remove first  save");
		listImpiegati(lI);
		
		lI.sort(new Comparator<Impiegati>() {
			@Override
			public int compare(Impiegati o1, Impiegati o2) {
				return Double.compare(o2.getSalary(), o1.getSalary());
			}
		});

		System.out.println("After sort salary");
		listImpiegati(lI);
		
		
	}
	
	private void executeMap() {
		
		System.out.println("Map process");
		/*
		 * Define Map
		 */
		Map<String, String> map = new HashMap<String, String>(); 
		
		map.put("k1", "v1");
		map.put("k2", "v2");
		map.put("k3", "v3");
		map.put("k4", "v4");
		map.put("k5", "v5");
		map.put("k6", "v6");
		map.put("k7", "v7");
		map.put("k8", "v8");
		map.put("k9", "v9");
		map.put("k10", "v10");
		
		System.out.println("numero di elemti di map :" +  map.size());
		
		String keySearch = "k6";
		if (map.containsKey(keySearch))
			System.out.println("Key " + keySearch + " trovata");
		else
			System.out.println("Key " + keySearch + " NON trovata");
		
		String valueSearch = "v8";

		if (map.containsValue(valueSearch))
			System.out.println("Value  " + valueSearch + " trovata");
		else
			System.out.println("Value " + valueSearch + " NON trovata");
		
		String value = null;
		value = map.get("k10");

		System.out.println("valore di k10 :" + value);
		
		map.put("k10", "bla bla bla ...");
		System.out.println("valore dopo di k10 :" + map.get("k10"));
		
		map.put("K99", "Nuova valore");
		System.out.println("numero di elemti di map :" +  map.size() + " valore K99:" + map.get("K99"));
		
		for (Entry<String, String> it:map.entrySet()) {
			System.out.println("key:" + it.getKey() + " valore:" + it.getValue());
		}

		for (String  it:map.keySet()) {
			System.out.println("key:" + it + " valore :" + map.get(it));
		}

		
	}

	private void mapTest() {
		String params = "p1=aaaa,p2=25,p3=Paolo";
		System.out.println("mapTest:" + params);
		String[] p = params.split(",");
		Map<String, String> result = new HashMap<String, String>();
		for (String it:p){
			String[] elem = it.split("=");
			result.put(elem[0], elem[1]);
		}
		
		for (Entry<String, String> it:result.entrySet()) {
			System.out.println("key:" + it.getKey() + " valore:" + it.getValue());
		}
		System.out.println("valore di p3:" + result.get("p3"));
	}
	
	
	public Impiegati removeFromImpegato(String search, List<Impiegati> lI) {
		int pos=0;
		Impiegati rc = null;
		for (Impiegati it:lI) {
			if (it.getCognome().equalsIgnoreCase(search)) {
				rc = it;
				break;
			}
			pos++;
		}
		
		if (rc != null) {
			System.out.println("remove item " + pos);
			lI.remove(pos);
		}
		
		
		return rc;
	}
	
	
	private void listImpiegati(List<Impiegati> lI) {
		int pos = 0;
		for (Impiegati it:lI) {
			System.out.println(pos + " " + it);
			pos++;
		}
		
	}
}

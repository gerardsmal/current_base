package com.betacom.process;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.betacom.objects.Address;

public class ProcessSerializazione {
	public boolean execute() {
		System.out.println("Begin ProcessSerializazione");

		Address address = new Address();
		address.setCity("Torino");
		address.setName("Vincenzio Rossi");
		address.setStreet("Via Roma");
		address.setSesso(true);
		
		
		/*
		 * Fileoutputstrem an ObjectOutputStream write 
		 * file in byte
		 */
		
		try {
			FileOutputStream fout = new FileOutputStream("/Users/gerard/Downloads/address.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fout);

			oos.writeObject(address);
			oos.flush();
			oos.close();
			System.out.println("Object created...." + address);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return true;
	}
}

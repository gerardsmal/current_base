package com.betacom.process;

import static com.betacom.utils.Utilities.displayDate;
import static com.betacom.utils.Utilities.stringToDate;

import java.time.LocalDate;

import com.betacom.exception.AcademyException;
import com.betacom.objects.User;

public class ProcessDate {

	private final static String PATTERN_DATE = "dd/MM/yyyy";
	private final static String PATTERN_DATE_ESTESO = "EEEE dd MMMM yyyy";
	
	public boolean execute(String input) {
		
		User u = null;
			
		try {
			u = new User("Paolo", "Verde", true, 2000, 3, 25, stringToDate(PATTERN_DATE, input) , 6);
			System.out.println(u);
			
			LocalDate adesso = LocalDate.now();
			System.out.println("Adesso:" + displayDate(PATTERN_DATE,adesso));
			
			System.out.println("Data Nascità:" + displayDate(PATTERN_DATE_ESTESO,u.getNascita()));
			
			System.out.println("Giorno dell'anno :" + u.getNascita().getDayOfYear());
			
			int plusGiorni = 25;
			u.setNascita(u.getNascita().plusDays(plusGiorni));

			System.out.println("Data Nascità modificata:" + displayDate(PATTERN_DATE,u.getNascita()));
			
			
			System.out.println("Data fine validita:" + displayDate(PATTERN_DATE,u.getFineValidita()));
			return true;

		} catch (AcademyException e) {
			System.out.println("Errore in create user :" + e.getMessage());
			return false;
		}

	}
	
}

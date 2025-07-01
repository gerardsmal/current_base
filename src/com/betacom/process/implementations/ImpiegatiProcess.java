package com.betacom.process.implementations;

import java.text.NumberFormat;
import java.util.Locale;

import com.betacom.objects.Impiegati;
import com.betacom.process.interfaces.IDisplaySalary;
import com.betacom.process.interfaces.ISalaryInsert;
import com.betacom.singletone.MySingleTone;

public class ImpiegatiProcess implements ISalaryInsert, IDisplaySalary{

	@Override
	public void inserNewSalary(Impiegati imp) {
		Integer idx = MySingleTone.getInstance().computeIndice();
		System.out.println("Valore di idx da inserNewSalary:" + idx);
		double quota = 0;
		if (imp.getSesso()) {
			quota = 2;
			imp.setSalary(imp.getSalary() * quota);
		} else {
			quota =  1.5;
			imp.setSalary(imp.getSalary() * quota);
		}
	}

	
	@Override
	public void formatSalary(Impiegati imp) {
	
		System.out.println("Salary :" +  NumberFormat.getCurrencyInstance(Locale.ITALY).format(imp.getSalary()));
	}

	
	
	/*
	 * metodo fuori interface
	 */
	public void cambioSalary(Impiegati imp, Double salary) {
		imp.setSalary(salary);
	}

}

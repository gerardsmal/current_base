package com.betacom.process;

import com.betacom.objects.Impiegati;
import com.betacom.process.implementations.ImpiegatiProcess;
import com.betacom.process.interfaces.IDisplaySalary;
import com.betacom.process.interfaces.ISalaryInsert;
import com.betacom.singletone.MySingleTone;

public class ProcessInterface {

	public boolean execute() {
		System.out.println("Begin ProcessInterface");
		
		
		Integer idx = MySingleTone.getInstance().computeIndice();
		System.out.println("Valore di idx:" + idx);
		
		
		
		Impiegati i = new Impiegati("Paolo", "Bianco", true, 2000.0);
		System.out.println("inziale:" + i);
		
		Object o = new ImpiegatiProcess();
//		Object o = new ProcessDate();
		
		if (o instanceof ISalaryInsert) {
			ISalaryInsert s = (ISalaryInsert)o;	
			s.inserNewSalary(i);
			System.out.println("dopo:" + i);			
		} else {
			System.out.println("object non compatibile");
		}
		
		
		if (o instanceof IDisplaySalary) {
			IDisplaySalary d = (IDisplaySalary)o;
			d.formatSalary(i);			
		} else {
			System.out.println("object non compatibile");
		}
		
		if (o instanceof ImpiegatiProcess) {
			ImpiegatiProcess p = (ImpiegatiProcess)o;
			p.cambioSalary(i, 2500.0);			
			System.out.println("dopo cambioSalary:" + i);			
		} else {
			System.out.println("object non compatibile");
		}
		
		idx = MySingleTone.getInstance().computeIndice();
		System.out.println("Valore di idx finale:" + idx);
		
		return true;
	}
}

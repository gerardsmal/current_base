package com.betacom.objects;

import com.betacom.singletone.MySingleTone;

public class Impiegati extends User{
	
	private Double salary;

	public Impiegati() {
		super();

	}

	public Impiegati(String nome, String cognome, Boolean sesso, Double salary) {
		super(nome, cognome, sesso);

		this.salary = salary;
//		Integer idx = MySingleTone.getInstance().computeIndice();
//		System.out.println("Valore di idx da Impiegati:" + idx);
		
	}

	public String getMySesso() {
		return (getSesso()) ? "M" : "F";
	}

	
	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Impiegati [salary=" + salary + ", nome=" + getNome() + ", cognome=" + getCognome()
				+ ", sesso=" + getSesso()  + ", mySesso=" + getMySesso() + "]";
	}


}

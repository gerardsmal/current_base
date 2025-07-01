package com.betacom.objects;

import java.time.LocalDate;

public class User {

	private String nome;
	private String cognome;
	private Boolean sesso;
	private LocalDate nascita;
	private LocalDate certificatoMedico;
	private Integer mesiDiValidita;
	public User() {
	}

	
	public User(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public User(String nome, String cognome, Boolean sesso) {
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
	}
	

	public User(String nome, String cognome, Boolean sesso, LocalDate nascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.nascita = nascita;
	}


	public User(String nome, String cognome, Boolean sesso, int anno, int mese, int giorno) {
		this(nome, cognome, sesso, LocalDate.of(anno, mese, giorno)); // chiama l'altro costructtore
	}

	public User(String nome, String cognome, Boolean sesso, int anno, int mese, int giorno,LocalDate certificatoMedico,
			Integer mesiDiValidita) {
		this(nome, cognome, sesso, LocalDate.of(anno, mese, giorno), certificatoMedico, mesiDiValidita); // chiama l'altro costructtore
	}

	
	public User(String nome, String cognome, Boolean sesso, LocalDate nascita, LocalDate certificatoMedico,
			Integer mesiDiValidita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.nascita = nascita;
		this.certificatoMedico = certificatoMedico;
		this.mesiDiValidita = mesiDiValidita;
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public LocalDate getFineValidita() {
		return certificatoMedico.plusMonths(mesiDiValidita);
	}
	

	public Boolean getSesso() {
		return sesso;
	}


	public void setSesso(Boolean sesso) {
		this.sesso = sesso;
	}

	public LocalDate getNascita() {
		return nascita;
	}


	public void setNascita(LocalDate nascita) {
		this.nascita = nascita;
	}



	public LocalDate getCertificatoMedico() {
		return certificatoMedico;
	}


	public void setCertificatoMedico(LocalDate certificatoMedico) {
		this.certificatoMedico = certificatoMedico;
	}


	public Integer getMesiDiValidita() {
		return mesiDiValidita;
	}


	public void setMesiDiValidita(Integer mesiDiValidita) {
		this.mesiDiValidita = mesiDiValidita;
	}
	
	@Override
	public String toString() {
		String resp = "User [nome=" + nome + ", cognome=" + cognome ;
		if (sesso != null)
			resp= resp + " , sesso=" + sesso;
		if (nascita != null)
			resp= resp + " , nascita=" + nascita;
		if (certificatoMedico != null)
			resp= resp + " , certificatoMedico=" + certificatoMedico;

		if (mesiDiValidita != null)
			resp= resp + " , mesiDiValidita=" + mesiDiValidita;

		resp = resp +  "]";
		
		return resp;
	}


	
}

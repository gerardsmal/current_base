package com.betacom.objects;

public class Cliente {

	private String nome;
	private String cognome;
	private DataNascita dataNascita;
	
	public Cliente(String nome, String cognome, DataNascita dataNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
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

	public DataNascita getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(DataNascita dataNascita) {
		this.dataNascita = dataNascita;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + "]";
	}
	
	

}

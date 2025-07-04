package com.betacom.objects;

public class ClienteStream {
	private String nome;
	private String cognome;
	private Integer eta;
	private Double stipendio;
	
	public ClienteStream() {
		super();
	}

	public ClienteStream(String nome, String cognome, Integer eta, Double stipendio) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.stipendio = stipendio;
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

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	public Double getStipendio() {
		return stipendio;
	}

	public void setStipendio(Double stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return "ClienteStream [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", stipendio=" + stipendio
				+ "]";
	}
}

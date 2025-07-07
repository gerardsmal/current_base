package com.betacom.objects;

import java.util.List;

public class Generica<T> {

	private Boolean rc;
	private String msg;
	List<T> dati;
	
	public Boolean getRc() {
		return rc;
	}
	public void setRc(Boolean rc) {
		this.rc = rc;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<T> getDati() {
		return dati;
	}
	public void setDati(List<T> dati) {
		this.dati = dati;
	}
	@Override
	public String toString() {
		return "Generica [rc=" + rc + ", msg=" + msg + ", dati=" + dati + "]";
	}
}

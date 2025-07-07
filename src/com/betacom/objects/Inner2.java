package com.betacom.objects;

public class Inner2 {
	private String fatherClass;
	private int numero;
	public Figlio f = null;
	
	public class Figlio{
		private int numero2;
		private String figlioClass;
		public Nipote n = null; 
		
		public class Nipote{
			private int numero3;
			private String nipoteClass;

			public int getNumero3() {
				return numero3;
			}

			public void setNumero3(int numero3) {
				this.numero3 = numero3;
			}
			
			public String displayNumeriNipote() {
				return ">> Padre:" + numero + " Figlio:" + numero2 + " nipote:" + numero3;
			}

			public String getNipoteClass() {
				return nipoteClass;
			}

			public void setNipoteClass(String nipoteClass) {
				this.nipoteClass = nipoteClass;
			}
			
		}

		public int getNumero2() {
			return numero2;
		}

		public void setNumero2(int numero2) {
			this.numero2 = numero2;
		}
		
		public String displayNumeri() {
			return ">> Padre:" + numero + " Figlio:" + numero2;
		}


		public String getFiglioClass() {
			return figlioClass;
		}

		private void setFiglioClass(String figlioClass) {
			this.figlioClass = figlioClass;
		}

		public Figlio() {
			if (n == null)
				n =   new Nipote();
		}


	}
	
	
	
	
	
	
	public String getFatherClass() {
		return fatherClass;
	}
	public void setFatherClass(String fatherClass) {
		this.fatherClass = fatherClass;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Inner2() {
		if (f == null)
			f = new Figlio();
	}

}

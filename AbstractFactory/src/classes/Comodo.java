package classes;

public class Comodo {
	
	String tipoComodo;
	String piso;
	String parede;
	String tinta;
	String metal;
	String louca;
	String porta;
	

	public String getPorta() {
		return porta;
	}

	public void setPorta(String porta) {
		this.porta = porta;
	}

	public Comodo(String comodo, String piso, String parede, String porta, String tinta, String metal, String louca) {
		super();
		this.tipoComodo = comodo;
		this.piso = piso;
		this.parede = parede;
		this.tinta = tinta;
	}
	
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public String getParede() {
		return parede;
	}
	public void setParede(String parede) {
		this.parede = parede;
	}
	public String getTinta() {
		return tinta;
	}
	public void setTinta(String tinta) {
		this.tinta = tinta;
	}
	
	public String getTipoComodo() {
		return tipoComodo;
	}

	public void setTipoComodo(String tipoComodo) {
		this.tipoComodo = tipoComodo;
	}
	
	public String getMetal() {
		return metal;
	}

	public void setMetal(String metal) {
		this.metal = metal;
	}

	public String getLouca() {
		return louca;
	}

	public void setLouca(String louca) {
		this.louca = louca;
	}
	
	
}

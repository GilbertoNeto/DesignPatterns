package classes;

import java.util.List;

import interfaces.Luxo;

public class CasaLuxo implements Luxo {

	
	private List<Comodo> comodosLuxo;
	
	@Override
	public CasaLuxo criarCasaLuxo() {
		CasaLuxo casaLuxo = new CasaLuxo();
		return casaLuxo;
	}

	public CasaLuxo() {}

	public List<Comodo> getComodosLuxo() {
		return comodosLuxo;
	}

	public void setComodosLuxo(List<Comodo> comodosLuxo) {
		this.comodosLuxo = comodosLuxo;
	}
	
	public void addComodo(Comodo c) {
		this.comodosLuxo.add(c);
	}

	
}

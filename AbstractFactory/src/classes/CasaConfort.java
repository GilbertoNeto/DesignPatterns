package classes;

import java.util.List;

import interfaces.Confort;

public class CasaConfort implements Confort {

	
	private List<Comodo> comodosConfort;
	

	public CasaConfort() {}
	
	@Override
	public CasaConfort criarCasaConfort() {
		CasaConfort casaConfort = new CasaConfort();
		return casaConfort;
	}

	public List<Comodo> getComodosConfort() {
		return comodosConfort;
	}

	public void setComodosConfort(List<Comodo> comodosConfort) {
		this.comodosConfort = comodosConfort;
	}
	
	public void addComodo(Comodo c) {
		this.comodosConfort.add(c);
	}

}

package classes;

import java.util.List;

import interfaces.Basica;

public class CasaBasica implements Basica {
	
	private List<Comodo> comodosBasicos;


	public CasaBasica() {}
	
	@Override
	public CasaBasica criarCasaBasica() {
		CasaBasica casaBasica = new CasaBasica();
		return casaBasica;
	}

	public List<Comodo> getComodos() {
		return comodosBasicos;
	}

	public void setComodos(List<Comodo> comodos) {
		this.comodosBasicos = comodos;
	}
	
	public void addComodo(Comodo c) {
		this.comodosBasicos.add(c);
	}


}

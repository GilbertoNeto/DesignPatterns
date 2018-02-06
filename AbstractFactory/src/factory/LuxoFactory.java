package factory;

import classes.CasaLuxo;
import interfaces.Basica;
import interfaces.CasaFactory;
import interfaces.Confort;
import interfaces.Luxo;

public class LuxoFactory implements CasaFactory {

	@Override
	public Basica criaBasica() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Confort criaConfort() {
		
		return null;
	}

	@Override
	public Luxo criaLuxo() {
		CasaLuxo casaLuxo = new CasaLuxo();
		return casaLuxo;
	}

}

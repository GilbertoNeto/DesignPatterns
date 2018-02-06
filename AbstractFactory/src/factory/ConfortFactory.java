package factory;

import classes.CasaConfort;
import interfaces.Basica;
import interfaces.CasaFactory;
import interfaces.Confort;
import interfaces.Luxo;

public class ConfortFactory implements CasaFactory {

	@Override
	public Basica criaBasica() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Confort criaConfort() {
		CasaConfort casaConfort = new CasaConfort();
		return casaConfort;
	}

	@Override
	public Luxo criaLuxo() {
		return null;
	}

}

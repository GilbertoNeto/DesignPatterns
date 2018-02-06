package factory;

import classes.CasaBasica;
import interfaces.Basica;
import interfaces.CasaFactory;
import interfaces.Confort;
import interfaces.Luxo;

public class BasicaFactory implements CasaFactory  {

	@Override
	public Basica criaBasica() {
		CasaBasica casaBasica = new CasaBasica();
		return casaBasica;
	}

	@Override
	public Confort criaConfort() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Luxo criaLuxo() {
		// TODO Auto-generated method stub
		return null;
	}

}

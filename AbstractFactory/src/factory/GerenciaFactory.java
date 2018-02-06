package factory;
import classes.CasaConfort;
import interfaces.Basica;
import interfaces.CasaFactory;
import interfaces.Confort;
import interfaces.Luxo;
import classes.CasaConfort;
import classes.CasaLuxo;
import factory.*;

public class GerenciaFactory {
	
	public static CasaFactory getFactory(String tipoCasa) {
		
		if (tipoCasa == "Basica")
			return new BasicaFactory();
		
		if (tipoCasa == "Confort")
			return new ConfortFactory();
		
		if (tipoCasa == "Luxo") {
			return new LuxoFactory();
		}
		
		return null;
		
	}
	
}

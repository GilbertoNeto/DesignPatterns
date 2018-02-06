import classes.CasaBasica;
import classes.CasaConfort;
import classes.CasaLuxo;
import classes.Comodo;
import interfaces.Basica;
import interfaces.Confort;
import interfaces.Luxo;

public class CreateHome {

	public CasaBasica adicionarComodoByBasica (String tipoCasa, String nomeComodo) {
		
		if (tipoCasa == "Basica") {
			Basica basicaFactory = GerenciaFactory.getFactory(tipoCasa).criaBasica();
			CasaBasica casaBasica = basicaFactory.criarCasaBasica();
			Comodo c = new Comodo(nomeComodo, "ceramica" ,"mdf", "gesso", "latex", "ferro", "Elizabeth");
			casaBasica.addComodo(c);
			return casaBasica;
		}
		return null;
	}
	
	
	public CasaConfort adicionarComodoByConfort (String tipoCasa, String nomeComodo) {
		if (tipoCasa == "Confort") {
			Confort confortFactory = GerenciaFactory.getFactory(tipoCasa).criaConfort();
			CasaConfort casaConfort = confortFactory.criarCasaConfort();
			Comodo c = new Comodo(nomeComodo, "ceramica esmaltada", "alvenaria", "madeira", "latex", "aluminio", "Elizabeth");
			casaConfort.addComodo(c);
			return casaConfort;
		}
		return null;
		
	}
		
	public CasaLuxo adicionarComodoByLuxo (String tipoCasa, String nomeComodo) {
		if (tipoCasa == "Luxo") {
			Luxo LuxoFactory = GerenciaFactory.getFactory(tipoCasa).criaLuxo();
			CasaLuxo casaLuxo = LuxoFactory.criarCasaLuxo();
			Comodo c = new Comodo(nomeComodo, "porcelanato", "alvenaria drywall", "madeira de lei", "super lavavel","inox", "Elizabeth");
			casaLuxo.addComodo(c);
			return casaLuxo;
		}
		return null;
	}
		
	}
	
	


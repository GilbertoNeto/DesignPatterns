package model;

import java.util.ArrayList;
import java.util.List;

public class FiguraComposta implements Figura {

	private List<Figura> figuras = new ArrayList<Figura>();
	
	@Override
	public String desenha() {
		// TODO Auto-generated method stub
		return "FiguraComposta";
	}

	@Override
	public double area() {
		return 0;
		// TODO Auto-generated method stub
	}

	@Override
	public double perimetro() {
		return 0;
		// TODO Auto-generated method stub

	}

	public List<Figura> getFiguras() {
		return figuras;
	}

	public void addFiguras(Figura figura) {
		this.figuras.add(figura);
	}
	
	public int qtdFiguras() {
		return figuras.size();
	}

	@Override
	public String toString() {
		return "FiguraComposta \n[figuras=\n" + figuras + "]";
	}		
}

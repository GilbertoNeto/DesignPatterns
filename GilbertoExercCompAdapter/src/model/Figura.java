package model;

import java.util.List;

public interface Figura {
	
	public String desenha();
	
	public double area();
	
	public double perimetro();
	
	public List<Figura> getFiguras()throws Exception;
	
	public void addFiguras(Figura figura)throws Exception;
	
	public int qtdFiguras()throws Exception;
	
}

package model;

import java.util.List;

public class AdapterQuadrado implements Figura{
	private Quadrado quadrado;
	
	public AdapterQuadrado(double lado){
		this.quadrado = new Quadrado(lado); 
	}
	
	@Override
	public String desenha() {
		// TODO Auto-generated method stub
		return this.quadrado.desenharQuadrado();
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.quadrado.areaQuadrado();
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return this.quadrado.perimetroQuadro();
	}
	
	@Override
	public List<Figura> getFiguras() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Não contém figuras!");
	}

	@Override
	public void addFiguras(Figura figura) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Não pode adicionar Figuras!");
	}

	@Override
	public int qtdFiguras() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Não contém figuras");
	}

	@Override
	public String toString() {
		return this.quadrado.toString();
	}

	
}

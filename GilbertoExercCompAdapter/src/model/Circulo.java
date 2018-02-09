package model;

import java.util.List;

public class Circulo implements Figura{

	private double area;
	private double perimetro;
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
		this.area = this.area();
		this.perimetro = this.perimetro();
	}
	
	@Override
	public String desenha() {
		// TODO Auto-generated method stub
		return "Desenho de um Circulo";
	}

	@Override
	public double area() {		
	         return 3.1415 * Math.pow(raio, 2);	         
		// TODO Auto-generated method stub		
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * 3.1415 * raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
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
		return "Circulo \n[area=" + area + ", perimetro=" + perimetro + ", raio=" + raio + "]\n";
	}	
}

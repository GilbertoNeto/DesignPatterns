package model;

import interfaces.Figura;

public class Circulo implements Figura {
	
	private double area;
	private double perimetro;
	private double raio;

	public Circulo() {
		this.raio = raio;
		this.area = this.area();
		this.perimetro = this.perimetro();
	}

	@Override
	public String desenha() {
		
		return "Circulo";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.1415 * (Math.pow(area, 2));	
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo [area=" + area + ", perimetro=" + perimetro + ", raio=" + raio + "]";
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}

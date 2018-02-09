package model;

public class Quadrado {		
	double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public String desenharQuadrado(){
		return "Quadrado!";
	}
	
	public double areaQuadrado(){
		return lado*lado;
	}
	
	public double perimetroQuadro(){
		return 4*lado;
	}
	
	@Override
	public String toString() {
		return "Quadrado: " + "\n[lado1="+"]\n";
	}
	
}

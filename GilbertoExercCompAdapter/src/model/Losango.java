package model;

public class Losango {
	double lado;
	double altura;
	
	public Losango(double lado, double altura) {
		this.lado = lado;
		this.altura = altura;
	}
	
	public String desenharLosango(){
		return "Losango!";
	}
	
	public double areaLosango(){
		return lado*altura;
	}
	
	public double perimetroLosango(){
		return 4*lado;
	}
	
	@Override
	public String toString() {
		return "Losango: " + "\n[lado = "+this.lado +" Altura = "+this.altura+"]\n";
	}

}

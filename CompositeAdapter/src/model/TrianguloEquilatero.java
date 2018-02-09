package model;

public class TrianguloEquilatero extends Triangulo {
	
	double ladoA; 
	double ladoB;
	double ladoC; 
	double perimetro;
	double area;

	public TrianguloEquilatero(double ladoA, double ladoB, double ladoC) {
		super(ladoA, ladoB, ladoC);
	}
	
	@Override
	public double area() {
		
		double ladoArea = this.ladoA * this.ladoB;
		
		double areaEquilatero = (ladoArea * Math.sqrt(3)) / 4;
		
		return areaEquilatero;
	}
	
	
	@Override
	public String desenha() {
		return "Triangulo Equilatero";
	}
	
	@Override
	public String toString() {
		return "TrianguloEquilatero [ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + ", perimetro="
				+ perimetro + ", area=" + area + "]";
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	

}

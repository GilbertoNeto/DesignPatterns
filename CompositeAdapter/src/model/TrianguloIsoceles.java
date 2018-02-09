package model;

public class TrianguloIsoceles extends Triangulo {

	double ladoA; 
	double ladoB;
	double ladoC; 
	double perimetro;
	double area;

	public TrianguloIsoceles(double ladoA, double ladoBase, double ladoC) {
		
		super(ladoA, ladoBase, ladoC);
	}
	
	@Override
	public double area() {
		return area;
	}
	
	@Override
	public String desenha() {
		return "Triangulo Isóceles";
	}

	@Override
	public String toString() {
		return "TrianguloIsoceles [ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + ", perimetro="
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

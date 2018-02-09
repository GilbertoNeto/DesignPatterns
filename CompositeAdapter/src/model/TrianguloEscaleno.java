package model;

public class TrianguloEscaleno extends Triangulo {

	
	private double ladoA, ladoB, ladoC, area, perimetro;
	
	
	public TrianguloEscaleno(double ladoA, double ladoB, double ladoC) {

		super(ladoA, ladoB, ladoC);
	}

	
	@Override
	public String desenha() {
		return "Triangulo Retangulo";
	}

	@Override
	public String toString() {
		return "TrianguloRetangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + ", area=" + area
				+ ", perimetro=" + perimetro + "]";
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

}

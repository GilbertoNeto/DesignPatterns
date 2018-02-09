package model;

import interfaces.Figura;

abstract class Triangulo implements Figura {

	private double l1;
	private double l2;
	private double l3;
	private double perimetro;
	private double area;
	
	public Triangulo(double l1, double l2, double l3) {
		super();
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}
	
	@Override
	public double perimetro() {
		return l1 + l2 + l3;
	}
	
	@Override
	public double area() {
		return area;
	}
	
	@Override
	public String desenha() {
		return "Triangulo folha/abstrato";
	}

	@Override
	public String toString() {
		return "Triangulo Abstrato: lado A =" + l1 + ", Lado B =" + l2 + ", Lado C = " + l3 + ", perimetro=" + perimetro + ", area=" + area
				+ "";
	}

	public double getL1() {
		return l1;
	}

	public void setL1(double l1) {
		this.l1 = l1;
	}

	public double getL2() {
		return l2;
	}

	public void setL2(double l2) {
		this.l2 = l2;
	}

	public double getL3() {
		return l3;
	}

	public void setL3(double l3) {
		this.l3 = l3;
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

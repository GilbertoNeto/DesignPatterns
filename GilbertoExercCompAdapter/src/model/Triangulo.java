package model;

import java.util.List;

abstract class Triangulo implements Figura {
	private double lado1;
	private double lado2;
	private double lado3;
	private double perimetro;
	private double area;
	
	public Triangulo(double lado1, double lado2, double lado3){
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	@Override
	public String desenha() {
		// TODO Auto-generated method stub
		return "Triangulo ";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		//	Teorema de Heron
		double s = ((lado1+lado2+lado3)/2);
        double area = (Math.sqrt(s * ((s-lado1)*(s-lado2)*(s-lado3))));
        return area; 
	}

	@Override
	public double perimetro() {
		return lado1+lado2+lado3;
		// TODO Auto-generated method stub

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
		return this.getClass().getSimpleName() + "\n[lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]\n";
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

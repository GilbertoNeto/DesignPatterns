package model;

import java.util.List;

public class AdapterLosango implements Figura{

	private Losango losango;
	
	public AdapterLosango(double lado, double altura){
		 this.losango = new Losango(lado,altura);
	}
	
	@Override
	public String desenha() {
		// TODO Auto-generated method stub	
		return losango.desenharLosango();
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return losango.areaLosango();
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return losango.perimetroLosango();
	}

	@Override
	public String toString() {
		return this.losango.toString();
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

}

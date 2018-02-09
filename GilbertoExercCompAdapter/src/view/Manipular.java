package view;

import model.AdapterLosango;
import model.AdapterQuadrado;
import model.Circulo;
import model.Figura;
import model.FiguraComposta;
import model.Losango;
import model.TrianguloEquilatero;
import model.TrianguloEscaleno;
import model.TrianguloIsoceles;

public class Manipular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Figura figuraComposta = new FiguraComposta();
		
		Figura c = new Circulo(4);
								
		try {
			figuraComposta.addFiguras(c);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		
		System.out.printf("Area = %.2f %n", c.area());
		System.out.printf("Perimetro = %.2f %n", c.perimetro());
		System.out.println(c.desenha());
		System.out.println(c.toString());		

		
/*		Figura triEqui = new TrianguloEquilatero(3,3,3);
		
		try {
			figuraComposta.addFiguras(triEqui);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.printf("Area: %.2f %n", triEqui.area());
		System.out.printf("Perimetro: %.2f %n", triEqui.perimetro());
		System.out.println(triEqui.desenha());
		System.out.println(triEqui.toString());		
										
		
		Figura triEsc = new TrianguloEscaleno(3, 4, 5);		
		System.out.printf("Area: %.2f %n", triEsc.area());
		System.out.printf("Perimetro: %.2f %n", triEsc.perimetro());
		System.out.println(triEsc.desenha());
		System.out.println(triEsc.toString());
		try {
			figuraComposta.addFiguras(triEsc);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		 		
		
			Figura is = new TrianguloIsoceles(5, 5, 4);
			System.out.println();
			System.out.printf("Area: %.2f %n", is.area());
			System.out.printf("Perimetro: %.2f %n", is.perimetro());
			System.out.println(is.desenha());
			System.out.println(is.toString());
			
			try {
				figuraComposta.addFiguras(is);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
					
				
			Figura quad = new AdapterQuadrado(4);			
			System.out.printf("Area: %.2f %n", quad.area());
			System.out.printf("Perimetro: %.2f %n", quad.perimetro());
			System.out.println(quad.desenha());
			System.out.println(quad.toString());
			
			try {
				figuraComposta.addFiguras(quad);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		
		
			Figura losango = new AdapterLosango(2, 1);			
			System.out.printf("Area: %.2f %n", losango.area());
			System.out.printf("Perimetro: %.2f %n", losango.perimetro());
			System.out.println(losango.desenha());
			System.out.println(losango.toString());		
					
			try {
				figuraComposta.addFiguras(losango);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}*/
		
	/*try {
		System.out.println("figuras adicionadas em figuras compostas: " + figuraComposta.qtdFiguras());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	}

}

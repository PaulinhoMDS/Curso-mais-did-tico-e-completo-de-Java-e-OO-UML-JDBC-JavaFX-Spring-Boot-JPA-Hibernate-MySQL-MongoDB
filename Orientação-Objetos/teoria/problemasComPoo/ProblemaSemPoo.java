import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class ProblemaSemPoo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner triangulo = new Scanner(System.in);
		Triangulo x,y ; 
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Coloque as medidadas do triangulo X");
		
		x.a = triangulo.nextDouble();
		x.b = triangulo.nextDouble();
		x.c = triangulo.nextDouble();
	
        System.out.println("Coloque as medidadas do triangulo Y");
		
		y.a = triangulo.nextDouble();
		y.b = triangulo.nextDouble();
		y.c = triangulo.nextDouble();
	
		double p = (x.a + x.b + x.c) / 2; 
		double areaX = Math.sqrt(p * (p-x.a) * (p - x.b) * (p-x.c));
		
		 p = (y.a + y.b + y.c) / 2; 
		double areaY = Math.sqrt(p * (p-y.a) * (p - y.b) * (p-y.c));
		
		System.out.printf("Area do triangulo X  : %.4f%n " ,areaX );
		System.out.printf("Area do triangulo Y  : %.4f%n " ,areaY );

		if (areaX > areaY) {
			System.out.println("Maior área : X");
		}
		
		else {
			System.out.println("Maior área : Y");
		}
		
		triangulo.close();
	  
	}

}

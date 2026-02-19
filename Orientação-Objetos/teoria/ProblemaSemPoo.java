import java.util.Locale;
import java.util.Scanner;

public class ProblemaSemPoo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner triangulo = new Scanner(System.in);
		double xA, xB , xC, yA, yB, yC;
		
		System.out.println("Coloque as medidadas do triangulo X");
		
		xA = triangulo.nextDouble();
		xB = triangulo.nextDouble();
		xC = triangulo.nextDouble();
	
        System.out.println("Coloque as medidadas do triangulo Y");
		
		yA = triangulo.nextDouble();
		yB = triangulo.nextDouble();
		yC = triangulo.nextDouble();
	
		double p = (xA + xB + xC) / 2; 
		double areaX = Math.sqrt(p * (p-xA) * (p - xB) * (p-xC));
		
		 p = (yA + yB + yC) / 2; 
		double areaY = Math.sqrt(p * (p-yA) * (p - yB) * (p-yC));
		
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

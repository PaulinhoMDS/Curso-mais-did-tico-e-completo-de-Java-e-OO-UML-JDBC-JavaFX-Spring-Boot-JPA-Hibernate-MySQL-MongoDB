import java.util.Scanner;

public class ExDois {
	public static void main (String[]args) { 
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Digite um o raio");
	int raio = sc.nextInt();
	sc.nextLine();
	
	double pi = 3.14159;
	 
	double diametro = Math.pow(raio, 2.0);
	
	double area = (double)pi * diametro ; 
	
	System.out.printf("A área do circulo é igual a %.4f%n", area);
	 
	
	sc.close();
	}
}

import java.util.Scanner;

public class ExSeis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor (a)");
		double ValorUm = sc.nextDouble();
		sc.nextLine();

		System.out.println("Digite o segundo valor(b)");
		double ValorDois = sc.nextDouble();
		sc.nextLine();

		System.out.println("Digite o terceiro valor(c)");
		double ValorTres = sc.nextDouble();
		sc.nextLine();

		// Área do triângulo = b * h / 2
		double AreaTriangulo = ValorUm * ValorTres / 2;
		System.out.printf("a área do triângulo é: %.3f%n", AreaTriangulo);

		// Área circulo = pi . r^2
		double Raio = ValorTres * ValorTres;
		double Pi = 3.14159;
		double AreaCirculo = Raio * Pi;
		System.out.printf("A área do ciruclo é %.3f%n", AreaCirculo);

		// Área trapézio = base + base * altura / 2
		double Base = ValorUm + ValorDois;
		double AreaTrapezio = Base * ValorTres / 2;
		System.out.printf("A área do trapézio é: %.3f%n", AreaTrapezio);

		// Area do Quadrado = lado * lado
		double AreaQuadrado = ValorDois * ValorDois ;
		System.out.printf("A área do quadrado é: %.3f%n", AreaQuadrado);
		
		// Área do Retangulo = lado * lado
		double AreaRetangulo = ValorUm * ValorDois ; 
		System.out.printf("A área do retangulo é: %.3f%n" , AreaRetangulo);
		
		sc.close();
	}
}

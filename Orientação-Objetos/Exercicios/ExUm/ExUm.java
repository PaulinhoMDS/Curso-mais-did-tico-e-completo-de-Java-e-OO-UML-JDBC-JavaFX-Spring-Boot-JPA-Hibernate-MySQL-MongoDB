package Exercicio;

import java.util.Locale;
import java.util.Scanner;

import Produto.Produtos;

public class ExUm {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		Produtos retangulo;
		retangulo = new Produtos() ;
		
		System.out.println("Insira a largura do retangulo");
		retangulo.largura = sc.nextDouble();
		System.out.println();
		
		System.out.println("Insira a altura do retangulo");
		retangulo.altura = sc.nextDouble();
		System.out.println();
		
		System.out.printf("A altura do retangulo é %.2f%n " , retangulo.altura);
		System.out.printf("A largura do retangulo é %.2f%n " , retangulo.largura);
		System.out.printf("Area: %.2f%n " , retangulo.area());
		System.out.printf("Perimetro: %.2f%n " , retangulo.perimetro());
		System.out.printf("Diagonal: %.2f%n " , retangulo.diagonal());
		
		
		sc.close();
	
	
	
	
	
	}
}

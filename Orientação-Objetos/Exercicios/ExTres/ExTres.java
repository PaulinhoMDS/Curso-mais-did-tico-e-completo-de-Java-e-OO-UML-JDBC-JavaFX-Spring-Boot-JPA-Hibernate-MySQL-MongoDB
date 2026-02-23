package Exercicios;

import java.util.Locale;
import java.util.Scanner;

import Nota.Notas;

public class ExTres {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Notas nota;
		nota = new Notas();
		
		System.out.println("DIGITE O NOME DO ALUNO");
		nota.nome = sc.nextLine();
		System.out.println("DIGITE A PRIMEIRA NOTA");
		nota.nota1 = sc.nextDouble();
		
		System.out.println("DIGITE A SEGUNDA NOTA");
		nota.nota2 = sc.nextDouble();
		
		System.out.println("DIGITE A TERCEIRA NOTA");
		nota.nota3 = sc.nextDouble();
		
		
		System.out.println(nota);
		
		if(nota.notaFinal()>=60.0) {
    		 System.out.println("Pass");
    	 }
		else  {
			System.out.println("Failed");
			
		}
		sc.close();
	}
}

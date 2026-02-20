package Exercicios;
import java.util.Scanner;
import Funcionario.DadosFuncionarios;

public class ExDois {
     public static void main (String[]args) {
    	 Scanner sc = new Scanner (System.in);
    	 
    	 DadosFuncionarios funcionario; 
    	 funcionario = new DadosFuncionarios();
    	 
    	 System.out.println("NOME DO FUNCIONARIO");
    	 funcionario.nome = sc.nextLine();
    	 
    	 System.out.println("SALÁRIO BRUTO");
    	 funcionario.salarioBruto = sc.nextDouble();
    	 
    	 System.out.println("IMPOSTO");
    	 funcionario.imposto = sc.nextDouble();
    	 
    	 System.out.println(funcionario.nome);
    	 System.out.println(funcionario.salarioBruto);
    	 System.out.println(funcionario.imposto);
    	 System.out.println();
    	 System.out.println("funcionario " + funcionario);
    	 System.out.println();
    	 
    	 System.out.println("EM QUANTOS PORCENTOS SERÁ O AUMENTO");
    	 double porcentagem = sc.nextInt();
    	 funcionario.aumentoSalario(porcentagem);
    	 System.out.println();
    	 
    	 System.out.println("O AUMENTO FICARÁ " + funcionario);

    	 sc.close();
     }
}

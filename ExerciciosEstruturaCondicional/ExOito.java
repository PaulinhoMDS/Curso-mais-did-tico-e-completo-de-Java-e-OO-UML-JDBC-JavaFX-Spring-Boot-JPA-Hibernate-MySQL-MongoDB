import java.util.Scanner;

public class ExOito {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual o valor do salário");
		double Salario = sc.nextDouble(); sc.nextLine();
		double resto;
		double imposto;
		
		
		// impostos fixo de 8% sobre 1000 para salario acima de 3000 
		double ImpostoOito = 1000 * (8 / 100.0);
		// imposto fixo de 18* sobre 1500, para salario acima de 4500
		double ImpostoDezoito = 1500 * (18 / 100.0);
		
		if (Salario >= 2000.01 && Salario <= 3000 ) {
			
			 resto = Salario - 2000;
			 imposto = resto * (8 / 100.0);
			 System.out.printf("o valor do imposto é %.2f%n"  , imposto);
		}
		
		else if (Salario >= 3000.01 && Salario <= 4500) {
			resto = Salario - 3000;
			imposto = ImpostoOito + resto * ( 18 / 100.0);
			 System.out.printf("o valor do imposto é %.2f%n"  , imposto);
		}
		
		else if (Salario > 4500) {
			resto = Salario - 4500;
			imposto = ImpostoDezoito + ImpostoOito + resto * ( 28 / 100.0);
			 System.out.printf("o valor do imposto é %.2f%n" , imposto);

		}
		
		else {
			System.out.println("Isento");
		}
	
		sc.close();
	}
}

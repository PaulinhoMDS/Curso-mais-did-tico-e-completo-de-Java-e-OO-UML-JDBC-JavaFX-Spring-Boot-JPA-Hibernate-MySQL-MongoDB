import java.util.Scanner;

public class ExQuatro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o número do funcionário?");
		int NumeroDoFuncionario = sc.nextInt();
		sc.nextLine();
		System.out.println("Qual o númeor de horas trabalhadas do funcionário?");
		double NumeroDeHoras = sc.nextDouble();
		sc.nextLine();

		System.out.println("Qual o valor recebido por hora do funcionário?");
		double SalarioPorHora = sc.nextDouble();
		sc.nextLine();

		double SalarioTotal = NumeroDeHoras * SalarioPorHora;

		System.out.printf("Number = %d%n", NumeroDoFuncionario);
		System.out.printf("Salary = %.2f%n", SalarioTotal);

		sc.close();
		
		
		
	}

}

import java.util.Scanner; 

public class ExCinco {
	public static void main(String[] args) {
		// código da primeira peça
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código da primeira peça:");
		int CodigoDaPeca1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite a quantidade de peças:");
		int NumeroDePeca1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o valor da segunda peça:");
		double ValorDaPeca1 = sc.nextDouble();
		sc.nextLine();

		// código da segunda peça
		System.out.println("Digite o código da segunda peça:");
		int CodigoDaPeca2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite a quantidade de peças:");
		int NumeroDePeca2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o valor da segunda peça:");
		double ValorDaPeca2 = sc.nextDouble();
		sc.nextLine();

		// Soma dos valores
		double ValorUm = ValorDaPeca1 * NumeroDePeca1;
		double ValorDois = ValorDaPeca2 * NumeroDePeca2;
		double ValorTotal = ValorUm + ValorDois;

		System.out.printf("Valor total a pagar pelas peças: %.2f%n", ValorTotal);

		sc.close();
	}
}

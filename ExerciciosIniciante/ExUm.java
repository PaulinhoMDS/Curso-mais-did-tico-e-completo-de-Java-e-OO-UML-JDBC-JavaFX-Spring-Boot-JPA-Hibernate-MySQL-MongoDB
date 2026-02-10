import java.util.Scanner;

public class ExUm {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero");
		int EntradaUm = sc.nextInt();
		sc.nextLine();

		System.out.println("Digite o segundo numero");
		int EntradaDois = sc.nextInt();
		sc.nextLine();

		int resultado = (int) EntradaUm + EntradaDois;

		System.out.println(resultado);

		sc.close();
	}
}

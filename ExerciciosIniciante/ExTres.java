import java.util.Scanner;

public class ExTres {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("DIGITE OS VALORES DE: A,B,C E D");

		int a = sc.nextInt();
		sc.nextLine();

		int b = sc.nextInt();
		sc.nextLine();

		int c = sc.nextInt();
		sc.nextLine();

		int d = sc.nextInt();
		sc.nextLine();

		int resultado = (a * b - c * d);

		System.out.printf("O resultado entre a diferença dos produtos é: %d  ", resultado);

		sc.close();

	}

}

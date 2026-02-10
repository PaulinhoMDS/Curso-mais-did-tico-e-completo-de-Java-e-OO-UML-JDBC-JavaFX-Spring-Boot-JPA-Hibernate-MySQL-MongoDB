import java.util.Scanner;

public class ExTres {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int PrimeiroNumero;
		System.out.println("digite o primeiro número");
		PrimeiroNumero= sc.nextInt(); sc.nextLine();
	
		int SegundoNumero;
		System.out.println("Digite o segundo número");
		SegundoNumero = sc.nextInt(); sc.nextLine();
				
		if (PrimeiroNumero % SegundoNumero == 0 || SegundoNumero % PrimeiroNumero == 0 ) {
			System.out.println("Os números são multiplos");
			}
		else {
			System.out.println("Os númeors não são multiplos");
		sc.close();
		}
	}
}

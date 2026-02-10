import java.util.Scanner;

public class ExUm {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		int Numero;
		System.out.println("Digite o número");
		Numero = sc.nextInt(); sc.nextLine();
		
		if (Numero > 0   )
			System.out.println("NÃO NEGATIVO");
		
		else { System.out.println("NEGATIVO");
		
		}
		sc.close();
	}
}

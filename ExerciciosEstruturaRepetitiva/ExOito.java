import java.util.Scanner;

public class ExOito {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		int fatorial = 1;
		int saida;
		for (int i=1; i<=N;i++) {
			
			fatorial *=i ;
			
			if (fatorial == 0) {
				saida = 1;
				System.out.println( saida );
			}
		}
		
		
		System.out.println(fatorial);

		sc.close();
	}
}

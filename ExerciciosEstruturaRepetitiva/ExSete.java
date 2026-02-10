import java.util.Scanner;

public class ExSete {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		
		
		for (int i=0;i<N;i++) {
			int primeiroNumero = sc.nextInt();
			int segundoNumero =  sc.nextInt();
			 
			
			if(primeiroNumero == 0 && segundoNumero == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			}
			else {
				double divisao = (double) primeiroNumero  / segundoNumero; 
				System.out.printf("%.2f%n",divisao);
			}
		}
		sc.close();
	}
}

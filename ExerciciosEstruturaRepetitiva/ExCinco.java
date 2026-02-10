import java.util.Scanner;

public class ExCinco {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITE A QUANTIDADE DE VALORES DESEJADA");
		int N = sc.nextInt();
		int valor;
		int i;
		int in= 0 ;
		int out = 0;
		int Numero;
		
		for(i=0; i < N; i++) {
			Numero = i+1;
			System.out.println("DIGITE O " + Numero + " NUMERO");
			valor = sc.nextInt();
		
			if(valor >= 10 && valor <= 20){
				 in += 1;
			}
			else {
				out +=1;
			}
		}
		
		System.out.println(out + " out");
		System.out.println(in + " in");

		sc.close();
	}
}

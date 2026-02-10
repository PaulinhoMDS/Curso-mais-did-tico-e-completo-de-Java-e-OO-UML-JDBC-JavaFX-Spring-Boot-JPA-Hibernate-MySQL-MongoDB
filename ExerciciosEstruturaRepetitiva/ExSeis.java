import java.util.Scanner;

public class ExSeis {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE O NUMERO DE CASO DE TESTE");
		int N = sc.nextInt();
		int i ;
		double teste1 ; 
		double teste2 ;
		double teste3 ;
		double Media ;
		double SomaDosTestes;
		
		
		for (i=0 ; i < N; i++) {
			System.out.println("DIGITE OS VALORES DO 1 TESTE" );
			teste1= sc.nextDouble(); sc.nextLine();
			System.out.println("DIGITE OS VALORES DO 2 TESTE" );
			teste2= sc.nextDouble(); sc.nextLine();
			System.out.println("DIGITE OS VALORES DO 3 TESTE" );
			teste3= sc.nextDouble(); sc.nextLine();
		
		teste1 *= 2;
		teste2 *= 3;
		teste3 *= 5;
		SomaDosTestes = teste1+ teste2 + teste3;
		Media = SomaDosTestes / 10;
		
		
		System.out.printf("%.1f%n" , Media );

		sc.close();
		}
	}	
}

import java.util.Scanner;

public class ExTres {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o código do produto");
		int x = sc.nextInt(); sc.nextLine();
		 int alcool = 0 ; 
		 int  gasolina = 0  ;
		int  diesel = 0;
		
		while(x != 4) {
 			
			if (x == 1){
				alcool = alcool +   1;
			}
			else if (x == 2) {
				gasolina = gasolina + 1;
			}
			else if(x == 3){
				diesel = diesel + 1 ; 
			}
		
			System.out.println("Digite o código");
			x = sc.nextInt();
			
		}
		
		System.out.println("Muito obrigado!!");
		System.out.println(  "alcool : " + alcool );
		System.out.println( "gasolina " + gasolina );
		System.out.println( "diesel " + diesel );
		sc.close();
	}
}

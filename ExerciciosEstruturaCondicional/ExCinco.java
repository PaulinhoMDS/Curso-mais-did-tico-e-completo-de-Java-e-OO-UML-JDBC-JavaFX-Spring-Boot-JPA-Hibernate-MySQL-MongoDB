
import java.util.Scanner;

public class ExCinco {
	public static void main (String []args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Qual o código do item?");
		int Codigo = sc.nextInt(); sc.nextLine();
		
		System.out.println("Qual a quantidade do produto?");
		 int Quantidade = sc.nextInt(); sc.nextLine();
		
		 double Total ;
		 
		if ( Codigo == 1) { 
			Total = Quantidade * 4;
		}
		else if (Codigo == 2){
			Total = Quantidade *  4.50;
		}
		else if (Codigo == 3 ) {
			Total = Quantidade * 5;	
		}
		else if (Codigo == 4) {
			Total = Quantidade * 2;
		}
		else {
			Total = Quantidade * 1.50;
		}
		
		
		System.out.printf("o valor total deu %.2f%n Reais" , Total );
		
		sc.close();
	}
}

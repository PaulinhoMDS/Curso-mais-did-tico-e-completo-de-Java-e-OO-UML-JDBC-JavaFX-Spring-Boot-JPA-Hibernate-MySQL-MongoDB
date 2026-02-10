import java.util.Locale;
import java.util.Scanner;

public class ExNove {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Informe a quantidade de minutos");
		
		Double Minutos = sc.nextDouble(); sc.nextLine();
		Double ValorAdicional;
		Double total;
		
		if(Minutos > 100) {
			ValorAdicional = Minutos - 100 ; 
			ValorAdicional *= 2; 
			total = ValorAdicional + 50;
					System.out.printf("Valor a pagar : R$%.2f%n" , total);	
		}
				
		else {
			System.out.println("Valor total a pagar: R$50,00 ");
		}
		sc.close();
	}
}

import java.util.Scanner;

public class ExUm {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);		
		int senha = sc.nextInt(); sc.nextLine();
		
		while (senha != 2002) {
			System.out.println("SENHA INVÁLIDA");	
			 senha = sc.nextInt(); 
					
		}
		
		System.out.println("ACESSO PERMITIDO");
		
		sc.close();
	
	}
}

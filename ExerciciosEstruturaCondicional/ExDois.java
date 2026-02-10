import java.util.Scanner;

public class ExDois {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Numero ; 
		System.out.println("Digite o número");
		Numero = sc.nextInt(); sc.nextLine();	
	
		if (Numero  % 2 ==0 ) {
			System.out.println("o Número é Par");
		}
		
		else {
			System.out.println("O número é impar");
		}
		
		sc.close();	}

}

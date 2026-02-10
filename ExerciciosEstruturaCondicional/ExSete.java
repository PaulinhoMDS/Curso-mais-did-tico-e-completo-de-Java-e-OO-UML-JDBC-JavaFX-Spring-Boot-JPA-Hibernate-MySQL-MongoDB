import java.util.Scanner;

public class ExSete {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de x");
		double x = sc.nextDouble(); sc.nextLine();
		
		
		System.out.println("Digite o  valor de y");
		double y= sc.nextDouble(); sc.nextLine();
	
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		
		else  if (x < 0 && y < 0 ) {
			System.out.println("Q3");
		}
		else if  (x > 0 && y < 0 ) {
			System.out.println("Q4");
		}
		
		
		
		
		else{
			System.out.println("Origem");
		}
		
		sc.close();	
	
	}
}

import java.util.Scanner;

public class ExDois {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("digite o valor de x");
		int x = sc.nextInt();sc.nextLine();
		System.out.println("digite o valor de y");
		int y = sc.nextInt();sc.nextLine();
		
		
		
		while (x != 0 && y != 0 ) {
			if( x > 0 && y > 0 ) {
			System.out.println("Quadrante 1");
			}
			if( x < 0 &&  y > 0 ) {
				System.out.println("Quadrante 2");

			}
				
			if  (x > 0 && y < 0) {
				System.out.println("Quadrante 3");

			}
			if  ( x < 0 && y < 0 ) {
				System.out.println("Quadrante 4");

			}
		
			System.out.println("digite o valor de x");
			 x = sc.nextInt();sc.nextLine();
			System.out.println("digite o valor de y");
			 y = sc.nextInt();sc.nextLine();
			}
		
		sc.close();
			
		}
}

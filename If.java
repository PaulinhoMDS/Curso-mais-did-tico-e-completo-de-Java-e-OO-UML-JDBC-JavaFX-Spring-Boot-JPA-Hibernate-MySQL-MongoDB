import java.util.Scanner;

public class If {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		
		System.out.println("que horas são?");
		hora = sc.nextInt(); sc.nextLine(); 
		
		
		if (hora < 12) {
			System.out.println("bom dia");
		}
		
		else{
			System.out.println("boa tarde");
		
		sc.close();
		}
	}
}

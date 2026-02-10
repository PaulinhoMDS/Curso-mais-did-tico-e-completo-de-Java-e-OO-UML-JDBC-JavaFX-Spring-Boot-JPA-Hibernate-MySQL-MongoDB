import java.util.Scanner;

public class IfElseDois {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hora;
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		sc.nextLine();

		if (hora < 12) {
			System.out.println("bom dia");
		} 

		else if (hora < 18) {
			System.out.println("Boa tarde");
		}

		else {
			System.out.println("boa noite");
		}
		

		sc.close();
	}

}

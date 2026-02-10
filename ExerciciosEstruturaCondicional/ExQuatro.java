import java.util.Scanner;

public class ExQuatro {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int HoraUm = sc.nextInt();
		int HoraDois = sc.nextInt();
		
		int duracao;
		
		if (HoraUm < HoraDois) {
			duracao = HoraDois - HoraUm;
		}
		
		else {
			duracao = 24 - HoraUm + HoraDois;
		}
	
		System.out.printf("O jogo durou" + duracao + "Horas");
		
		sc.close();
	
	}
}

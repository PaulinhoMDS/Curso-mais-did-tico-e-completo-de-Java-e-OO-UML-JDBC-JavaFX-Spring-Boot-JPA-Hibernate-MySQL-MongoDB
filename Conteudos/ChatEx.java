
public class ChatEx {
	public static void main (String[]args) {
		
		String caderno = "Caderno" ;
		int estoque = 15;
		double preco = 12.50 ; 
		
		double TotalEstoque = preco * 15 ; 
		
		
		System.out.printf("Resumoo do produto%n");
				
		System.out.printf("Temos %d %ss , e o preço de cada um é %.2f%n" , estoque , caderno , preco );
		
		System.out.printf("Logo, o valor totar que temos em estoque é: %.2f%n" , TotalEstoque ) ; 
	}
}

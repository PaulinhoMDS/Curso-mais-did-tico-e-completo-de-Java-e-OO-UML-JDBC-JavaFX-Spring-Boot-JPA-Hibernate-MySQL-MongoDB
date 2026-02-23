package Dolar;

import java.util.Locale;
import java.util.Scanner;

import Conversao.ConversaoDolar;

public class ExQuatro {
   public static void main (String[]args) {
	   Scanner sc = new Scanner (System.in);
	   Locale.setDefault(Locale.US);
	   
	   System.out.println("QUAL O PREÇO DO DOLAR??");
	   ConversaoDolar.dolar = sc.nextDouble();
	   System.out.println("QUANTOS DOLARS VOCÊ QUER COMPRAR??");
	   ConversaoDolar.quantidade = sc.nextDouble();
	   System.out.printf("VOCE PAGARÁ %.2f%n REAIS " ,  ConversaoDolar.total());
	   sc.close();
   }
}

package Nota;

public class Notas {
	public double nota1;
	public double nota2;
	public double nota3;
	public String nome;
	public String aprovacao ; 
	
	public double notaFinal() {
		return nota1 + nota2 + nota3  ; 
	}
	

	public double missingPoints() {
		if (notaFinal() < 60.0 ) {
			return 60.0 - notaFinal(); 
		}
		else {
			return 0.0;
		}
	}
	
	
	public String toString() {
		return nome  + "FINAL GRADE = " +
		String.format("%.2f", notaFinal()) 
		 ; 
		
		
	}
}

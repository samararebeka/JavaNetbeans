package raioCirculo;

import java.util.Locale;
import java.util.Scanner;

public class Diferen�aProduto {

	public static void main(String[] args) {
 
		
		   Scanner input = new Scanner(System.in); 
		      Locale.setDefault(Locale.US);

		      
		      
			 int A, B, C, D, diferenca;
			 
		      

		       System.out.println("Digite o valor de A: ");
		       A=input.nextInt();
		       
		       System.out.println("Digite o valor de B: ");
		       B=input.nextInt();
		       
		       System.out.println("Digite o valor de C: ");
		       C=input.nextInt();
		       
		       System.out.println("Digite o valor de D: ");
		       D=input.nextInt();

		    
		       
		       diferenca = (A * B - C * D);

		       
		       System.out.println("O valor da diferen�a do produto de " + A + " e " + B + " pelo produto de " + C + " e "+ D +" �: " + diferenca);
		       
		       
		       input.close();
	}

}

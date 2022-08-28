package raioCirculo;

import java.util.Locale;
import java.util.Scanner;

public class DiferençaProduto {

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

		       
		       System.out.println("O valor da diferença do produto de " + A + " e " + B + " pelo produto de " + C + " e "+ D +" é: " + diferenca);
		       
		       
		       input.close();
	}

}

package raioCirculo;
import java.util.Locale;
import java.util.Scanner;



public class RaioCirculo {
	
		
		public static void main(String[] args) {
					      
		      Scanner input = new Scanner(System.in); 
		      Locale.setDefault(Locale.US);

		      
		      
			 double raio, Area, PI = 3.14159;
		      

		       System.out.println("Digite o valor do raio: ");
		       raio=input.nextDouble();
		       
		    
		       
		       Area = PI *(raio*raio);

		       
		       System.out.println("O valor da Area é : " + Area);
		       
		       
		       input.close();
			}
	}
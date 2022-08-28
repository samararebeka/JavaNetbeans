package curso_programacao;
import java.util.Locale;
import java.util.Scanner;





public class soma {


		public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in); 
	      Locale.setDefault(Locale.US);
		  int num1;
	      int num2;
	      int soma;

	       System.out.println("Digite o número 1: ");
	       num1=sc.nextInt();
	       
	       System.out.println("Digite o número 2: ");
	       num2=sc.nextInt();
	       
	       soma= num1 + num2;
	       
	       System.out.println("A soma: " + soma);
	       
	       sc.close();
	      
		}
}

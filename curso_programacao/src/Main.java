import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      
	  int num1;
      int num2;
      int soma;

       System.out.println("Digite o número 1: ");
       num1=input.nextInt();
       
       System.out.println("Digite o número 2: ");
       num2=input.nextInt();
       
       soma= num1 + num2;
       
       System.out.println("A soma: " + soma);
       
       
      
	}

}

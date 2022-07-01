/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class main {
    double salarioG, salarioP;
    String nomeG, nomeP;
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
        System.out.println("Digite o nome do Gerente: ");
        String nomeG = input.next();
        System.out.println("Digite o valor do salario do Gerente: ");
        double salarioG = input.nextDouble();      
        Gerente gerente = new Gerente(nomeG, salarioG);
        System.out.println("O salario do gerente com o aumento é de " + gerente.aumentasalario()+ "R$\n");
        
        
        System.out.println("\nDigite o nome do Programador: ");
        String nome = input.next();
        System.out.println("Digite o valor do salario do Programador: ");
        double salario = input.nextDouble();
       
        Programador programador = new Programador(nome, salario);
        
        System.out.println("O salario do programador com o aumento é de " + programador.aumentasalario()+ "R$");
    }
}
   

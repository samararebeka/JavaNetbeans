/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaabstrata;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class main {
        public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
            
            String numC1, numC2;
             double cred1, cred2, deb1, deb2;
              
   
            System.out.println("\nDigite o numero da sua conta: ");
            numC1 = input.next(); 
            
            System.out.println("\nDigite o numero da sua conta com imposto: ");
            numC2 = input.next(); 
            
            
            
                     ContaAbstrata ca1 = new Conta (numC1);
                     ContaAbstrata ca2 = new ContaImposto (numC2);
            
            
            System.out.println("\nDigite o valor a ser creditado na conta: " + ca1.getNumero());
             cred1= input.nextDouble(); 
             ca1.creditar(cred1);
            
            
             System.out.println("\nDigite o valor a ser creditado na conta: " + ca2.getNumero());
             cred2= input.nextDouble(); 
             ca1.creditar(cred2);
             
           
            
            System.out.println("Saldo conta 1: " + ca1.getNumero()+ " e " + ca1.getSaldo());
            System.out.println("Saldo conta 2: " + ca2.getNumero() +" e " + ca2.getSaldo());
            
            System.out.println("\nDigite o valor a ser debitado na conta: " + ca1.getNumero());
             deb1= input.nextDouble(); 
             ca1.debitar(deb1);
             System.out.println("Saldo atual da conta: " + ca1.getNumero()+ " e " + ca1.getSaldo());

             
             System.out.println("\nDigite o valor a ser debitado na conta: " + ca2.getNumero());
             deb2= input.nextDouble(); 
             ca1.debitar(deb2);
             System.out.println("Saldo atual da conta: " + ca2.getNumero()+ " e " + ca2.getSaldo());

            
    }
}

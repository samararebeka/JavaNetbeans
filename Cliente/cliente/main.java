/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
 

     String nome, cpf;
     int dia, ano;
     String mes;
     String numero, num;
     double credito,debito, credcorr,debcorr;
    
     
    /*******************nome e cpf (Classe cliente)******************************/

     System.out.println("Digite o nome do titular: ");
     nome = input.next();
     
     System.out.println("Digite o cpf do titular: ");
     cpf = input.next();
    
     /*******************Data de aniversario (Classe DataAniversario )******************************/
     
     System.out.println("\nDigite sua data de aniversário");
     
     System.out.println("Dia: ");
     dia = input.nextInt();
     System.out.println("Mes: ");
     mes = input.next();
     System.out.println("Ano: ");
     ano = input.nextInt();
     
     Cliente pessoa = new Cliente(nome, cpf);
     DataAniversario aniversario = new DataAniversario(dia, mes, ano);
     
    /*******************Creditar e Debitar (Classes Conta e Poupanca )******************************/
       /*********************************Conta Poupanca )*****************************************/

                 System.out.println("\nTitular da conta: " + nome);

       
    System.out.println("\nDigite o numero da conta Poupança");
     numero = input.next();
       
    System.out.println("\nDigite o valor do deposito na conta poupança: ");
     credito = input.nextDouble();
     
    System.out.println("\nDigite o valor de retirada na conta poupança: ");
     debito = input.nextDouble();
    
    
       System.out.println("\nSaldo em conta poupança: ");
       
       
       Poupanca x = new Poupanca (numero, pessoa, aniversario);
        x.creditar(credito);
         x.debitar(debito);
         ((Poupanca)x).renderjuros(0.01);
          System.out.println(x.getSaldo());
          
   /*************************************** Conta corrente*****************************************/

    System.out.println("\nDigite o numero da conta Corrente");
     num = input.next(); 

    System.out.println("\nDigite o valor do deposito em conta corrente: ");
     credcorr = input.nextDouble();
     
    System.out.println("\nDigite o valor da retirada em conta corrente: ");
     debcorr = input.nextDouble();     
    
     
        System.out.println("\nSaldo em conta corrente: ");

       Conta y = new Poupanca (num, pessoa, aniversario );
        y.creditar(credcorr);
         y.debitar(debcorr);
          ((Poupanca)y).renderjuros(0.01);
            System.out.println(y.getSaldo());

}}

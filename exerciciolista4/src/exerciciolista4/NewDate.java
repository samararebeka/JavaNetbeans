/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciolista4;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class NewDate {
    
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        date info = new date();
        
    int dia;
    int mes;
    int ano;
        
       
        System.out.println("Digite a data atual:  " );
        dia=input.nextInt();
        System.out.println("Digite o mes atual de 1 a 12 :  ");
        mes=input.nextInt();
        System.out.println("Digite o ano atual:  ");
        ano=input.nextInt();
        System.out.println(" dia: " +dia + " do mês " +mes + " do ano de " +ano);
        if(mes==2){
        System.out.println("Faltam "+ (28-dia) + " dias para o final do mes");
    }else if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
                System.out.println("Faltam "+ (31-dia) + " dias para o final do mes");

    }else if(mes==4 ||mes==6||mes==9||mes==11){
                System.out.println("Faltam "+ (30-dia) + " dias para o final do mes");

    }
         

       
        
       info.setDia(dia);
       info.getDia();
       info.setDia(mes);
       info.getDia();
       info.setDia(ano);
       info.getDia();
        }
 }
        
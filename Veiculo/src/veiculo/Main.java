/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculo;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        String tipovei, carga, motorcar,motorcam;
        int rodascar, rodascam;
        
        System.out.println ("Digito  tipo de automovel: ");
        tipovei = input.next();
        System.out.println ("Digito  tipo do motor: ");
        motorcar = input.next();
        System.out.println("Digite o número de rodas ");
        rodascar = input.nextInt();

        Veiculo automovel = new Veiculo(motorcar, rodascar);
         

        
        System.out.println("\nProximo veiculo \n");
       
        
        System.out.println ("Digite o tipo do automovel de carga: ");
        carga = input.next();
        System.out.println ("Digit o tipo do motor: ");
        motorcam = input.next();
        System.out.println("Digite o número de rodas ");
        rodascam = input.nextInt();
        
         Veiculo Carga = new Veiculo(motorcam, rodascam);

      
    }
    
  
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areacalculavel;

import java.util.Scanner;



public class main {

    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AreaCalculavel[] vetor = new AreaCalculavel[5];
          
        System.out.println("Quanto o valor do raio do circulo?");
        double raio = input.nextDouble();
        System.out.println("Qual o nome da figura? ");
        String nome1 = input.next();
        Circulo circulo = new Circulo(raio, nome1);
      //  System.out.println("O circulo tem " + circulo.calculaArea() + " de area");
        vetor[0] = circulo;        
        
        System.out.println("Qual o valor do lado do quadrado? ");
         double lado = input.nextDouble();
         System.out.println("Qual o nome da figura? ");
         String nome2 = input.next();
         Quadrado quadrado = new Quadrado(lado, nome2);
        // System.out.println("O quadrado tem " + quadrado.calculaArea() + " de area"); 
         vetor[1] = quadrado;

        
        System.out.println("Qual o valor da base do retangulo?");
        double base = input.nextDouble();
        System.out.println("Qual o valor da altura do retangulo?");
        double altura = input.nextDouble();
        System.out.println("Qual o nome da figura? ");
        String nome3 = input.next();
         Retangulo retangulo = new Retangulo(base, altura, nome3);
        //System.out.println("O retangulo tem " + retangulo.calculaArea() + " de area");
        vetor[2] = retangulo;
        
        
        for(int indice=0; indice<3; indice++){
            System.out.println("A figura " + vetor[indice].getNome()+ " tem " + vetor[indice].calculaArea() + " de area");
           //  System.out.println("A figura" + ((Circulo)vetor[indice]).getNome() +"tem " + vetor[indice].calculaArea() + " de area");

        }
     }
     
      //public static void inserir(AreaCalculavel a){
        // vetor [indice] = a;
         //indice++;
        
     //}    
}

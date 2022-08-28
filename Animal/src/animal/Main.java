/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
   String nomeAnimal, nomeEspecie, filtrEspecie;
   
   FerramentasImpl ferr = new FerramentasImpl();
      
      AnimalImpl[] animal = new AnimalImpl[3];
      
      for(int i=0; i<3; i++){
           System.out.println("Digite o nome do animal: ");
           nomeAnimal= input.next();
           
           System.out.println("Digite o nome da especie: ");
           nomeEspecie= input.next();         
           animal[i]= new AnimalImpl(nomeEspecie, nomeAnimal); 

           
      }
       System.out.println("Digite o nome da especie: ");
       filtrEspecie= input.next();  
       ferr.filtraEspecie(animal, filtrEspecie);
      // ferr.classificaEspecies(animal);
    } 
    public Resultado[] especieSobre(AnimalImpl[] especieSobre, FerramentasImpl tudoSobre){
         Resultado[] temp = new Resultado[especieSobre.length];        
           for(int i=0; i<especieSobre.length; i++){
             if(especieSobre[i].getNomeEspecie().equals(tudoSobre.Especie[i])){
               for(int j=0; j<especieSobre.length; j++){
                   if(especieSobre[j].getNomeAnimal().equals(null)){                       
                   }else{
                 temp[i].setQuantidade(1); 
              }
           }
         } 
      }return temp;
   } 
}
 
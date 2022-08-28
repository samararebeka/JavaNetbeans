/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify;

/**
 *
 * @author Administrator
 */
public class Interprete {
    String cantor;
    
    public Interprete(String Cantor){
        cantor=Cantor;
    }
    public String getCantor() {
        return cantor;
    }
    
     public void setCantor(String Cantor) {
        this.cantor = Cantor;
    }
    
    public void print(){
        System.out.println("Cantor: "+ cantor);
    }
   
}

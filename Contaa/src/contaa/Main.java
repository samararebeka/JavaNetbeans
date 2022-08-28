/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaa;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        Poupança x = new Poupança ("12x-3");
        x.creditar(500.25);
        x.debitar(45.13);
        x.rederJuros(0.01);
        System.out.println(x.getSaldo());
        
        Contaa y = new Poupança ("333-y");
        y.creditar(250.32);
        y.debitar(100.00);
        ((Poupança)y).rederJuros(0.01);
    }
    
  
}

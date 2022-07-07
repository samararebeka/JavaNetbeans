/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;
import java.util.Date;


/**
 *
 * @author Administrator
 */
public class Main {
  public static void main(String[] args) {
      
      
      
    java.util.Date data;
    data = new Date();
    
    
    
    Pessoa x = new Pessoa();
   System.out.println("\nnome: " + x.getNome() + "\nrg: " +  x.getRg() + "\ncpf: " + x.getCpf() + "\nEMAIL"+ x.getEmail() +"\nFONE: " + x.getFone() + "\nENDEREÇO: " + x.getEndereco() + "\nBAIRRO: " + x.getBairro() + "\nESTADO: " + x.getEstado() + "\nCIDADE: "+ x.getCidade() );
   
   Conta y = new Especial(500.00, x, "12x-3", 2);
     y.debitar(100.00);
System.out.println(((Especial)y).getSaldo());
System.out.println(((Especial)y).getLimite());

   System.out.println("Saldo final: ");
       
   Conta Z = new Poupança (data, x, "12x-3", 4 );
        Z.creditar(400.25);
        Z.debitar(45.13);
        ((Poupança)Z).Corrigir(0.01);
        System.out.println(Z.getSaldo());
        
        Conta w = new Poupança (data, x, "333-y", 7);
        w.creditar(250.32);
        w.debitar(100.00);
        ((Poupança)w).Corrigir(0.01);
      
            System.out.println(data);

    }
}

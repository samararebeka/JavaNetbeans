/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contaa;


public class Contaa {

    private String numero;
    private double saldo;
    


    public Contaa(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void creditar (double valor){
        saldo = saldo + valor;
    }
      public void debitar (double valor){
          if( saldo > valor)
        saldo = saldo - valor;
          else
              System.out.println("Saldo insuficiente");
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
   
}

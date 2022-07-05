/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;




public class Conta {
    private Cliente titular;
    private String numero;
    private double saldo;

   public Conta(Cliente titular, String numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void mostrar(){
        System.out.println(" Nome do titular: " + titular + "Numero da conta: " + numero);
    }
    // **********************Creditar e Debitar ************************//
    public void creditar (double valor){
        saldo = saldo + valor;
    }
      public void debitar (double valor){
          if( saldo > valor)
        saldo = saldo - valor;
          else
              System.out.println("Saldo insuficiente");
    }     
}



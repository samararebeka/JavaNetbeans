/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;



public class Conta {
    private Pessoa titular;
    private String numero;
    private int digito;
    private double saldo;

    public Conta(Pessoa titular, String numero, int digito) {
        this.titular = titular;
        this.numero = numero;
        this.digito = digito;
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

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }
   

}

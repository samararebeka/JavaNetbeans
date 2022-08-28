/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaabstrata;


public class Conta extends ContaAbstrata {
  
    public Conta(String numero) {
        super(numero);
    }
    public void debitar (double valor){
        double saldo = getSaldo();
        if(saldo > valor)
            setSaldo(saldo - valor);
        else{
            System.out.println("Saldo insuficiente");
    }
  }
}
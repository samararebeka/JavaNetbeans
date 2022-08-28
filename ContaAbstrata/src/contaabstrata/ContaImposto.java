/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaabstrata;

/**
 *
 * @author Administrator
 */
public class ContaImposto extends ContaAbstrata {
    public static final double TAXA = 0.001;

    public ContaImposto(String numero) {
        super(numero);
    }
    
    public void debitar (double valor){
        double imposto = valor *TAXA;
        double saldo = this.getSaldo();
        if(valor + imposto <= saldo){
            setSaldo(saldo - (valor + imposto));
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
}

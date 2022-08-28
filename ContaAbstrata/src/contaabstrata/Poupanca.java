/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaabstrata;

/**
 *
 * @author Administrator
 */
public class Poupanca extends Conta {

    public Poupanca(String numero) {
        super(numero);
    }
    public void renderJuros(double taxa){
        double juros = this.getSaldo()*taxa;
        this.creditar(juros);         
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contaabstrata;

/**
 *
 * @author Administrator
 */
public abstract class ContaAbstrata {
private String numero;
private double saldo;

    public ContaAbstrata(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }
public void creditar(double valor){
    this.saldo += valor;
    }
public abstract void debitar (double valor);

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

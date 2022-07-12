/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaa;


public class Poupança extends Contaa{
    public Poupança (String numero){
        super (numero);
    }
    public void rederJuros(double taxa){
     double juros = this.getSaldo() * taxa;
     this.creditar(juros);
    }
}

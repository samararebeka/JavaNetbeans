/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;


public class Especial extends Conta {
    private double limite;

    public Especial(double limite, Pessoa titular, String numero, int digito) {
        super(titular, numero, digito);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
     public void debitar (double valor){
          if(( this.getSaldo() + limite)>= valor){
              this.setSaldo(this.getSaldo() - valor);
              if (this.getSaldo() < 0)
                limite = limite + this.getSaldo(); 
          }else
              System.out.println("Saldo insuficiente");
         
    }

}

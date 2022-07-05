/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;



public class Poupanca extends Conta {
     private DataAniversario aniversario;     
    
    
    public Poupanca(String numero, Cliente titular, DataAniversario aniversario) {
        super(titular, numero);
        
    }

    public DataAniversario getAniversario() {
        return aniversario;
    }

    public void setAniversario(DataAniversario aniversario) {
        this.aniversario = aniversario;
    }
    
    // ***********************render juros *************************//
    public void renderjuros(double taxa){
     double juros = this.getSaldo() * taxa;
     this.creditar(juros);
    }
}


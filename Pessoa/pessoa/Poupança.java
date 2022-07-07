/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

import java.util.Date;

public class Poupança extends Conta {
    private Date data;

    public Poupança(Date data, Pessoa titular, String numero, int digito) {
        super(titular, numero, digito);
        this.data= data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public void Corrigir(double taxa){
     double juros = this.getSaldo() * taxa;
     this.creditar(juros);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculo;


public class Automovel extends Veiculo{
    
        private String tipo;
        
 public Automovel(String motor, int n_rodas){
   super(motor , n_rodas);
  tipo = "fusca ";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
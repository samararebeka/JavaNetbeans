/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculo;

/**
 *
 * @author Administrator
 */
public class Carga extends Veiculo{
   
        private double carga;

 public  Carga (String motor, int n_rodas){
   super(motor, n_rodas);
   this.carga = carga;
 }        

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
 
}


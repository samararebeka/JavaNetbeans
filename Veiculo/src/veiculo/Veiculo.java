/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veiculo;

public class Veiculo {
    
    private String motor;
    private int n_rodas;

    public Veiculo(String motor, int n_rodas) {
        this.motor = motor;
        this.n_rodas = n_rodas;
    }

    public int getN_rodas() {
        return n_rodas;
    }

    public void setN_rodas(int n_rodas) {
        this.n_rodas = n_rodas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
}

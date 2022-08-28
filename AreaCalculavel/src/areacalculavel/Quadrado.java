/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areacalculavel;

/**
 *
 * @author Administrator
 */
public class Quadrado implements AreaCalculavel {
   private double lado; 
   private String nome;

    public Quadrado(double lado, String nome) {
        this.lado = lado;
        this.nome = nome;
    }
     public double calculaArea() {
        return getLado()*getLado();
    }
   

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 
}

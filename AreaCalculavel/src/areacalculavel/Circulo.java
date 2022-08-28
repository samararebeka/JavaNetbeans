/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areacalculavel;

/**
 *
 * @author Administrator
 */
    public class Circulo implements AreaCalculavel{
    private double raio;
    private final double pi = 3.1415;
    private String nome;

    public Circulo(double raio, String nome) {
        this.raio = raio;
        this.nome = nome;
    }
      public double calculaArea(){
        return getPi()* (getRaio()*getRaio());
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


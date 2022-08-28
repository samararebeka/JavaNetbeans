/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areacalculavel;

/**
 *
 * @author Administrator
 */
public class Retangulo implements AreaCalculavel {
     private double base;
    private double altura;
    private String nome;

    public Retangulo(double base, double altura, String nome) {
        this.base = base;
        this.altura = altura;
        this.nome = nome;
    }
    public double calculaArea(){
        return (getBase()*getAltura());
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
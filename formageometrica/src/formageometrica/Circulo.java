package com.company;

public class Circulo extends FormaGeometrica {
    private double raio;
    private final double pi = 3.1415;

    public Circulo(double raio) {
        this.raio = raio;
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

    public double area() {
        return getPi() * (getRaio() * getRaio());
    }


    public double comprimento() {
        return (2 * getPi()) * getRaio();
    }
}

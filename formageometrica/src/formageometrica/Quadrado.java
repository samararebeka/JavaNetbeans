package com.company;

public class Quadrado extends FormaGeometrica{
    private double lado;
    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return getLado()*getLado();
    }


    public double comprimento() {
        return getLado()*4;
    }
}

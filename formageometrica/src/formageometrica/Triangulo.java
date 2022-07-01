package com.company;

public class Triangulo extends FormaGeometrica{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
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

    public double area() {
        return (getBase()*getAltura())/2;
    }


    public double comprimento() {
        double hipotenusa = Math.sqrt((getBase()*getBase())+(getAltura()*getAltura()));
        return getBase()+getAltura()+hipotenusa;
    }
}

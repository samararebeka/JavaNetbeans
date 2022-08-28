package com.company;

public class Multiplicacao extends OperacaoMatematica{

    public Multiplicacao(double c1, double c2) {
        super(c1, c2);
    }
    public double calcula() {
        return getC1()*getC2();
    }
}

package com.company;

public abstract class OperacaoMatematica {
    private double c1;
    private double c2;
    public OperacaoMatematica (double c1, double c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public abstract double calcula();
}

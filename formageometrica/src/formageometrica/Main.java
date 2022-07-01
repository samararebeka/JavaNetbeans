package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Quanto de lado tem o quadrado?");
        double lado = input.nextDouble();
        Quadrado quadrado = new Quadrado(lado);
        System.out.println("O quadrado tem " + quadrado.area() + " de area e " + quadrado.comprimento()
            + " de comprimento");

        System.out.println("Quanto de raio tem o circulo?");
        double raio = input.nextDouble();
        Circulo circulo = new Circulo(raio);
        System.out.println("O circulo tem " + circulo.area() + " de area e " + circulo.comprimento()
            + " de comprimento");

        System.out.println("Quanto de base tem o triangulo?");
        double base = input.nextDouble();
        System.out.println("Quanto de altura tem o triangulo?");
        double altura = input.nextDouble();
        Triangulo triangulo = new Triangulo(base, altura);
        System.out.println("O triangulo tem " + triangulo.area() + " de area e " + triangulo.comprimento()
            + " de comprimento");


    }
}

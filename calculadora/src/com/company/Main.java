package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número para ser o primeiro operador:");
        double c1 = input.nextDouble();
        System.out.println("Digite um número para ser o segundo operador:");
        double c2 = input.nextDouble();

        Soma soma = new Soma(c1, c2);
        Subtracao subtracao = new Subtracao(c1, c2);
        Multiplicacao multiplicacao = new Multiplicacao(c1, c2);
        Divisao divisao = new Divisao(c1, c2);

        System.out.println("A soma de " + c1 + " + " + c2 + " da: " + soma.calcula());
        System.out.println("A subtração de " + c1 + " - " + c2 + " da: " + subtracao.calcula());
        System.out.println("A multiplicação de " + c1 + " * " + c2 + " da: " + multiplicacao.calcula());
        System.out.println("A divisão de " + c1 + " ÷ " + c2 + " da: " + divisao.calcula());

    }
}

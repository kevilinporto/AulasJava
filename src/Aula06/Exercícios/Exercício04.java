package Aula06.Exercícios;

import java.util.Scanner;

public class Exercício04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        double media = soma / 4;
        System.out.println("A média é: " + media);
    }
}

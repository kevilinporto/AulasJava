package aula02.exercicios;

import java.util.Scanner;

public class Exercício08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base do retângulo: ");
        float base = scanner.nextFloat();

        System.out.println("Digite o valor da altura do retângulo: ");
        float altura = scanner.nextFloat();

        float area = base * altura;
        System.out.println("A área do retângulo é: " + area);

        scanner.close();

    }
}
